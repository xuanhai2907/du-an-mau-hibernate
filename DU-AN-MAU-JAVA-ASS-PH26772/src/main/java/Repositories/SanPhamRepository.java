/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.SanPham;
import Utilities.HibernateUtil;
import ViewModels.QLSanPham;

import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SanPhamRepository {

    public List<QLSanPham> getAll() {
        try ( Session s = HibernateUtil.getSessionFactory().openSession();) {
            Query q = s.createQuery("Select new ViewModels.QLSanPham (m.id as id, m.ma as ma, m.ten as ten) from DomainModels.SanPham m");
            List<QLSanPham> list = q.getResultList();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public void them(SanPham sp) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.save(sp);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                sp = null;
            }
        }
    }

    public void sua(SanPham sp) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(sp);
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
            SanPham sp = s.find(SanPham.class, id);
            s.delete(sp);
            tr.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public SanPham findId(UUID id) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        SanPham ch = s.find(SanPham.class, id);
        t.commit();
        s.close();
        return ch;
    }
}
