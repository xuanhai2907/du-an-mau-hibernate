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

    public void insert(KhachHang kh) {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.save(kh);
        trans.commit();
        session.close();
    }

    public void update(KhachHang kh, UUID vitri) {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        kh.setId(vitri);
        session.update(kh);
        trans.commit();
        session.close();
    }

    public void delete(UUID vitri) {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        KhachHang kh = session.get(KhachHang.class, vitri);
        session.delete(kh);
        trans.commit();
        session.close();
    }

}
