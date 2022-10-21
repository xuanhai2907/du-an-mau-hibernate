/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.KhachHang;
import Utilities.HibernateUtil;
import ViewModels.QLKhachHang;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class KhachHangRepository {

    public List<QLKhachHang> getList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("select new ViewModels.QLKhachHang (m.id as id, m.ma as ma, m.ten as ten, m.tenDem as tenDem, m.ho as ho, m.ngaySinh as ngaySinh, "
                + " m.sdt as sdt, m.diaChi as diaChi, m.thanhPho as thanhPho, m.quocGia as quocGia, m.matKhau as matKhau ) from DomainModels.KhachHang m ");
        List<QLKhachHang> list = query.getResultList();
        session.close();
        return list;
    }

    public List<QLKhachHang> getListByDiaChi(String diaChi) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("select new ViewModels.QLKhachHang (m.id as id, m.ma as ma, m.ten as ten, m.tenDem as tenDem, m.ho as ho, m.ngaySinh as ngaySinh, "
                + " m.sdt as sdt, m.diaChi as diaChi, m.thanhPho as thanhPho, m.quocGia as quocGia, m.matKhau as matKhau ) from DomainModels.KhachHang m where m.diaChi like :diaChi");
        query.setParameter("diaChi", diaChi);
        List<QLKhachHang> list = query.getResultList();
        session.close();
        return list;
    }

    public void them(KhachHang khachHang) {
        Transaction t = null;
        try ( Session s = new HibernateUtil().getSessionFactory().openSession();) {
            t = s.beginTransaction();
            s.save(khachHang);
            t.commit();
        } catch (Exception e) {
            e.printStackTrace();
            t.rollback(); //hoàn lại kết quả
        }
    }

    public void sua(KhachHang khachHang) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        s.update(khachHang);
        t.commit();
        s.close();
    }

    public void xoa(UUID id) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        KhachHang kh = s.find(KhachHang.class, id);
        s.delete(kh);
        t.commit();
        s.close();
    }

    public KhachHang findId(UUID id) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        KhachHang kh = s.find(KhachHang.class, id);
        t.commit();
        s.close();
        return kh;
    }

    public QLKhachHang findByMa(String ma) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("select new ViewModels.QLKhachHang (m.id as id, m.ma as ma, m.ten as ten, m.tenDem as tenDem, m.ho as ho, m.ngaySinh as ngaySinh, "
                + " m.sdt as sdt, m.diaChi as diaChi, m.thanhPho as thanhPho, m.quocGia as quocGia, m.matKhau as matKhau ) from DomainModels.KhachHang m where m.ma like :ma");
        query.setParameter("ma", ma);
        QLKhachHang qLKhachHang = null;
        try {
            qLKhachHang = (QLKhachHang) query.getSingleResult();
        } catch (NoResultException e) {
//            e.printStackTrace();
        }
        session.close();
        if (qLKhachHang == null) {
            return null;
        }
        return qLKhachHang;
    }
    
    public boolean checkMa(String ma){
        QLKhachHang ql = findByMa(ma);
        if(ql != null){
            return true;
        }
        return false;
    }

}
