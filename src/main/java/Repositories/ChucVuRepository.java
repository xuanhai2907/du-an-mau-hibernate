/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChucVu;
import Utilities.HibernateUtil;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class ChucVuRepository {

    public ChucVu getChucVuById(String ma) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ChucVu cv = session.find(ChucVu.class, ma);
        return cv;
    }

    public List<ChucVu> getList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("From ChucVu");
        List<ChucVu> list = query.getResultList();
        session.close();
        return list;
    }

    public void Insert(ChucVu chucVu) {
        ChucVu cv = new ChucVu();
        cv.setMa(chucVu.getMa());
        cv.setTen(chucVu.getTen());
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(cv);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void Update(ChucVu chucVu, UUID Id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ChucVu cv = session.get(ChucVu.class, Id);
        cv.setTen(chucVu.getTen());
        session.getTransaction().begin();
        session.save(cv);
        session.getTransaction().commit();
        session.close();
    }

    public void Delete(UUID Id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ChucVu cv = session.get(ChucVu.class, Id);
        session.getTransaction().begin();
        session.delete(cv);
        session.getTransaction().commit();
        session.close();

    }
}
