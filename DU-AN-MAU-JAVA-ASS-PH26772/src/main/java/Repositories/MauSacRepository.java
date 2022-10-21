/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.MauSac;

import Utilities.HibernateUtil;
import ViewModels.QLMauSac;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author asus
 */
public class MauSacRepository {

    public List<QLMauSac> getAll() {
        try ( Session s = HibernateUtil.getSessionFactory().openSession();) {
            Query q = s.createQuery("select new ViewModels.QLMauSac (m.id as id, m.ma as ma, m.ten as ten) from DomainModels.MauSac m");
            List<QLMauSac> list = q.getResultList();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public void them(MauSac ms) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.save(ms);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                ms = null;
            }
        }
    }

    public void sua(MauSac ms) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(ms);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.toString());
            transaction.rollback();
        }
    }

    public void xoa(UUID id) {
        Transaction tr = null;
        try ( Session s = HibernateUtil.getSessionFactory().openSession();) {
            tr = s.beginTransaction();
            MauSac ms = s.find(MauSac.class, id);
            s.delete(ms);
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public MauSac findId(UUID id) {
        Session s = HibernateUtil.getSessionFactory().openSession();

        Transaction t = s.beginTransaction();
        MauSac ch = s.find(MauSac.class, id);
        t.commit();
        s.close();
        return ch;
    }

}
