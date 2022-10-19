/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.NhanVien;
import Utilities.HibernateUtil;
import java.util.List;
import java.util.UUID;
import org.hibernate.Query;
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

    public List<NhanVien> getList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        javax.persistence.Query query = session.createQuery("From NhanVien");
        List<NhanVien> list = query.getResultList();
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
}
