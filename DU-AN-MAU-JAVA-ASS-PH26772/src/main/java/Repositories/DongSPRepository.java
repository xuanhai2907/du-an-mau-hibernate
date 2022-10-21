/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.DongSP;

import Utilities.HibernateUtil;
import ViewModels.QLDongSP;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author MMC
 */
public class DongSPRepository {

    public List<QLDongSP> getAll() {
        try ( Session s = HibernateUtil.getSessionFactory().openSession();) {
            Query q = s.createQuery("select new ViewModels.QLDongSP (m.id as id, m.ma as ma, m.ten as ten) from DomainModels.DongSP m");
            List<QLDongSP> list = q.getResultList();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public void them(DongSP dsp) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.save(dsp);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                dsp = null;
            }
        }
    }

    public void sua(DongSP dsp) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(dsp);
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
            DongSP sp = s.find(DongSP.class, id);
            s.delete(sp);
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public DongSP finId(UUID id) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        DongSP ch = s.find(DongSP.class, id);
        t.commit();
        s.close();
        return ch;
    }
}
