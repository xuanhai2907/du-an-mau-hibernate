/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.MauSac;
import DomainModels.SanPham;

import Utilities.HibernateUtil;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author asus
 */
public class MauSacRepository {
    public List<MauSac> getAll() {
        try ( Session s = HibernateUtil.getSessionFactory().openSession();) {

            Query q = s.createQuery("From MauSac");
            List<MauSac> list = q.getResultList();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public MauSac them(MauSac ms) {
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
        } finally {
            return ms;
        }
    }

    public boolean sua(MauSac ms) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();
            session.update(ms);
            transaction.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            transaction.rollback();
            return false;
        }
    }

    public String xoa(MauSac ms, String ma) {
        Transaction tr = null;
        String check = "";
        try ( Session s = HibernateUtil.getSessionFactory().openSession();) {
            tr = s.beginTransaction();

            MauSac ms1 = new MauSac(ms.getMa());
            s.delete(ms);
            check = "Xóa thành công";
            tr.commit();

        } catch (Exception e) {
            e.printStackTrace();
            check = "Xóa thất bại";
        }
        return check;
    }
}
