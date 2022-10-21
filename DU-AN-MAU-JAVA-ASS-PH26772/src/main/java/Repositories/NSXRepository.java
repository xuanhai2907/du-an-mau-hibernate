/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.MauSac;
import DomainModels.NSX;

import Utilities.HibernateUtil;
import ViewModels.QLNSX;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class NSXRepository {

    public List<QLNSX> getAll() {
        try ( Session s = HibernateUtil.getSessionFactory().openSession();) {
            Query q = s.createQuery("select new ViewModels.QLNSX (m.id as id, m.ma as ma, m.ten as ten) from DomainModels.NSX m");
            List<QLNSX> list = q.getResultList();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public void them(NSX nsx) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.save(nsx);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                nsx = null;
            }
        }
    }

    public void sua(NSX nsx) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(nsx);
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
            NSX nsx = s.find(NSX.class, id);
            s.delete(nsx);
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public NSX findId(UUID id) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        NSX ch = s.find(NSX.class, id);
        t.commit();
        s.close();
        return ch;
    }

}
