/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.DongSP;


import Utilities.HibernateUtil;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author MMC
 */
public class DongSPRepository {

     public List<DongSP> getAll() {
        try ( Session s = HibernateUtil.getSessionFactory().openSession();) {

            Query q = s.createQuery("From DongSP");
            List<DongSP> list = q.getResultList();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public DongSP them(DongSP dsp) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
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
        } finally {
            return dsp;
        }
    }
   public boolean sua(DongSP dsp ){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
           
            transaction = session.beginTransaction();
            session.update(dsp);
            transaction.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            transaction.rollback();
            return false;
        }
    }
   public String xoa(DongSP dsp,String ten) {
        Transaction tr = null;
        String check = "";
        try (Session s = HibernateUtil.getSessionFactory().openSession();) {
            tr = s.beginTransaction();

            DongSP dsp1 = new DongSP(dsp.getTen());
            s.delete(dsp);
            check = "Xóa thành công";
            tr.commit();

        } catch (Exception e) {
            e.printStackTrace();
            check = "Xóa thất bại";
        }
        return check;
    }
}

