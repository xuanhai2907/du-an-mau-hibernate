/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import domainModels.NhanVien;
import utilities.HibernateUtil;
import customModels.NhanVienCustom;
import java.util.List;
import java.util.UUID;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author window
 */
public class NhanVienRepository {

//    public NhanVien getNhanVienById(String id){
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        NhanVien nv = session.find(NhanVien.class, id);
//        return nv;
//    }
    public NhanVien getNhanVienByMa(String ma) {
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        javax.persistence.Query query = session1.createQuery("From NhanVien where Ma = :ma");// truy vấn trên entity(HQL)
        query.setParameter("ma", ma);
        List<NhanVien> list = query.getResultList();
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    public NhanVien getNhanVienById(String ma) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        NhanVien nv = session.find(NhanVien.class, ma);
        return nv;
    }

    public List<NhanVienCustom> getList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("Select"
                + " new ViewModels.QLNhanVien ("
                + " m.id as id,"
                + " m.ma as ma,"
                + " m.ten as ten,"
                + " m.tenDem as tenDem,"
                + " m.ho as ho, "
                + " m.gioiTinh as gioiTinh,"
                + " m.ngaySinh as ngaySinh,"
                + " m.sdt as sdt, "
                + " m.matKhau as matKhau, "
                + " m.diaChi as diaChi, "
                + " m.trangThai as trangThai"
                + ") from DomainModels.NhanVien m");
        List<NhanVienCustom> list = query.getResultList();
        session.close();
        return list;
    }

    public List<NhanVienCustom> getListBySdt(String sdt) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("Select"
                + " new ViewModels.QLNhanVien ("
                + " m.id as id,"
                + " m.ma as ma,"
                + " m.ten as ten,"
                + " m.tenDem as tenDem,"
                + " m.ho as ho, "
                + " m.gioiTinh as gioiTinh,"
                + " m.ngaySinh as ngaySinh,"
                + " m.sdt as sdt, "
                + " m.matKhau as matKhau, "
                + " m.diaChi as diaChi, "
                + " m.trangThai as trangThai"
                + ") from DomainModels.NhanVien m where m.sdt like CONCAT('%',:sdt,'%')");
        query.setParameter("sdt", sdt);
        List<NhanVienCustom> list = query.getResultList();
        session.close();
        return list;
    }

    public List<NhanVienCustom> getListByMa1(String ma) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("Select"
                + " new ViewModels.QLNhanVien ("
                + " m.id as id,"
                + " m.ma as ma,"
                + " m.ten as ten,"
                + " m.tenDem as tenDem,"
                + " m.ho as ho, "
                + " m.gioiTinh as gioiTinh,"
                + " m.ngaySinh as ngaySinh,"
                + " m.sdt as sdt, "
                + " m.matKhau as matKhau, "
                + " m.diaChi as diaChi, "
                + " m.trangThai as trangThai"
                + ") from DomainModels.NhanVien m where m.ma like CONCAT('%',:ma,'%')");
        query.setParameter("ma", ma);
        List<NhanVienCustom> list = query.getResultList();
        session.close();
        return list;
    }
    
    public List<NhanVienCustom> getListByGioiTinh(String gt) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("Select"
                + " new ViewModels.QLNhanVien ("
                + " m.id as id,"
                + " m.ma as ma,"
                + " m.ten as ten,"
                + " m.tenDem as tenDem,"
                + " m.ho as ho, "
                + " m.gioiTinh as gioiTinh,"
                + " m.ngaySinh as ngaySinh,"
                + " m.sdt as sdt, "
                + " m.matKhau as matKhau, "
                + " m.diaChi as diaChi, "
                + " m.trangThai as trangThai"
                + ") from DomainModels.NhanVien m where m.gioiTinh like CONCAT('%',:gt,'%')");
        query.setParameter("gt", gt);
        List<NhanVienCustom> list = query.getResultList();
        session.close();
        return list;
    }
    public void them(NhanVien nhanVien) {
        Transaction t = null;
        try ( Session session = new HibernateUtil().getSessionFactory().openSession();) {
            t = session.beginTransaction();
            session.save(nhanVien);
            t.commit();
        } catch (Exception e) {
            e.printStackTrace();
            t.rollback(); //hoàn lại kết quả
        }
    }

    public void sua(NhanVien nhanVien) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        s.update(nhanVien);
        t.commit();
        s.close();
    }

    public void xoa(UUID id) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        NhanVien nv = s.find(NhanVien.class, id);
        s.delete(nv);
        t.commit();
        s.close();
    }

    public NhanVien findId(UUID id) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        NhanVien nv = s.find(NhanVien.class, id);
        t.commit();
        s.close();
        return nv;
    }

    public NhanVienCustom getListByMa(String ma) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("Select"
                + " new ViewModels.QLNhanVien ("
                + " m.id as id,"
                + " m.ma as ma,"
                + " m.ten as ten,"
                + " m.tenDem as tenDem,"
                + " m.ho as ho, "
                + " m.gioiTinh as gioiTinh,"
                + " m.ngaySinh as ngaySinh,"
                + " m.sdt as sdt, "
                + " m.matKhau as matKhau, "
                + " m.diaChi as diaChi, "
                + " m.trangThai as trangThai"
                + ") from DomainModels.NhanVien m where m.ma like :ma");
        query.setParameter("ma", ma);
        NhanVienCustom qlnv = null;
        try {
            qlnv = (NhanVienCustom) query.getSingleResult();
        } catch (NoResultException e) {
        }
        session.close();
        if (qlnv == null) {
            return null;
        }
        return qlnv;
    }

    public boolean checkMa(String ma) {
        NhanVienCustom ql = getListByMa(ma);
        if (ql != null) {
            return true;
        }
        return false;
    }
}
