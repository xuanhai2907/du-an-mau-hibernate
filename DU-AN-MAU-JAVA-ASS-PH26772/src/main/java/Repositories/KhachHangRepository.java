/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.KhachHang;
import Utilities.HibernateUtil;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Acer
 */
public class KhachHangRepository {

    public List<KhachHang> getList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("From KhachHang");
        List<KhachHang> list = query.getResultList();
        session.close();
        return list;

    }

    public String them(KhachHang khachHang) {
        Transaction t = null;
        String check;
        try ( Session s = new HibernateUtil().getSessionFactory().openSession();) {
            t = s.beginTransaction();
            s.save(khachHang);
            t.commit();
            check = "Thêm thành công";
        } catch (Exception e) {
            e.printStackTrace();
            t.rollback(); //hoàn lại kết quả
            check = "Thêm thất bại";
        }
        return check;
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

}
