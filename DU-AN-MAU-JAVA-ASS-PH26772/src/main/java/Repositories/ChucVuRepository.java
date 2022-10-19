/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChucVu;
import Utilities.HibernateUtil;
import ViewModels.QLChucVu;
import ViewModels.ViewModelsChucVu;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class ChucVuRepository {


    public List<QLChucVu> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("select "
                + " new ViewModels.QLChucVu("
                + " m.id as id,"
                + " m.ma as ma,"
                + " m.ten as ten )"
                + " from DomainModels.ChucVu m ");
        List<QLChucVu> list = query.getResultList();
        session.close();
        return list;
    }

    public String them(ChucVu chucVu) {
        Transaction t = null;
        String check ;
        try (Session session = HibernateUtil.getSessionFactory().openSession();) {
            t = session.beginTransaction();
            session.save(chucVu);
            t.commit();
            check = "Thêm thành công";
        } catch (Exception e) {
            e.printStackTrace();
            t.rollback(); //hoàn lại kết quả
           check = "Thêm thất bại";
        }
        return check;
    }
    
    public void sua(ChucVu chucVu) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(chucVu);
        t.commit();
        session.close();
    }

    public void xoa(UUID id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ChucVu cv = session.find(ChucVu.class, id);
        session.delete(cv);
        t.commit();
        session.close();
    }
    
    public ChucVu findId(UUID id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ChucVu cv = session.find(ChucVu.class, id);
        t.commit();
        session.close();
        return cv;
    }
}
