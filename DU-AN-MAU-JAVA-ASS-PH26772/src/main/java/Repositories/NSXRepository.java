/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;


import DomainModels.NSX;

import Utilities.HibernateUtil;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author MMC
 */
public class NSXRepository {

//    public List<NSX> getAll() {
//        try ( Session s = HibernateUtil.getSessionFactory().openSession();) {
//            Query q = s.createQuery("From NSX");//HQL 
//            List<NSX> list = q.getResultList();
//            return list;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    public boolean them(NSX nsx) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        NSX nsx1 = new NSX();
//        nsx1.setMa("NSX05");
//        nsx1.setTen("Hà Nội");
//        nsx1.setId(nsx.getId());
//        session.save(nsx1);
//        session.close();
//        return true;
//    }
//
//    public boolean sua(NSX nsx) {
//        Transaction transaction = null;
//        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
//            transaction = session.beginTransaction();
//            session.update(nsx);
//            transaction.commit();
//            return true;
//        } catch (Exception e) {
//            System.out.println(e.toString());
//            transaction.rollback();
//            return false;
//        }
//    }
//
////    public String xoa(String ten) {
////        Transaction t = null;
////        String check = "";
////        try (Session s = HibernateDemo.getFACTORY().openSession();) {
////            NSX nsx = s.find(NSX.class, ten);
////            t = s.beginTransaction();
////            s.delete(nsx);
////            check = "Xóa thành công";
////            t.commit(); // luu lai
////
////        } catch (Exception e) {
////            e.printStackTrace();
////            check = "Xóa thất bại";
////        }
////        return check;
////    }
//    public String xoa(NSX nsxx, String ten) {
//        Transaction tr = null;
//        String check = "";
//        try ( Session s = HibernateUtil.getSessionFactory().openSession();) {
//            tr = s.beginTransaction();
//
//            NSX nsx = new NSX(nsxx.getTen());
//            s.delete(nsxx);
//            check = "Xóa thành công";
//            tr.commit();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            check = "Xóa thất bại";
//        }
//        return check;
//    }

     public List<NSX> getAll() {
        try ( Session s = HibernateUtil.getSessionFactory().openSession();) {

            Query q = s.createQuery("From NSX");
            List<NSX> list = q.getResultList();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public NSX them( NSX nsx) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
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
        } finally {
            return nsx;
        }
    }
   public boolean sua(NSX nsx ){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
           
            transaction = session.beginTransaction();
            session.update(nsx);
            transaction.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            transaction.rollback();
            return false;
        }
    }
   public String xoa(NSX nsx,String ten) {
        Transaction tr = null;
        String check = "";
        try (Session s = HibernateUtil.getSessionFactory().openSession();) {
            tr = s.beginTransaction();

            NSX nsx1 = new NSX(nsx.getTen());
            s.delete(nsx);
            check = "Xóa thành công";
            tr.commit();

        } catch (Exception e) {
            e.printStackTrace();
            check = "Xóa thất bại";
        }
        return check;
    }
    
}
