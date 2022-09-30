/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

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
public class SanPhamRepository {
    public List<SanPham> getAll() {
        try ( Session s = HibernateUtil.getSessionFactory().openSession();) {

            Query q = s.createQuery("From SanPham");
            List<SanPham> list = q.getResultList();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public SanPham them(SanPham sp) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
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
        } finally {
            return sp;
        }
    }

//    public String xoa(SanPham sp) {
//        Transaction t = null;
//        String check = "";
//        try ( Session s = Hibernate.getFACTORY().openSession();) {
//
//            t = s.beginTransaction();
//            s.delete(sp);
//            check = "Xoa thanh cong";
//            t.commit(); // luu lai
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            check = "Xoa that bai";
//        }
//        return check;
//    }
    public boolean sua(SanPham sp ){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
           
            transaction = session.beginTransaction();
            session.update(sp);
            transaction.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            transaction.rollback();
            return false;
        }
    }
//    public SanPham tim(String ma){
//        SanPham sp = new SanPham();
//        try (Session session = Hibernate.getFACTORY().openSession()) {
//            sp = session.get(SanPham.class, ma);
//        } catch (Exception e) {
//            System.out.println(e.toString());
//            return null;
//        }
//        return  sp;
//    }
    

//    public String sua(SanPham sp) {
//        Transaction t = null;
//        String check = "";
//        try ( Session s = Hibernate.getFACTORY().openSession();) {
//
//            t = s.beginTransaction();
//            s.update(sp);
//            check = "Sua thanh cong";
//            t.commit(); // luu lai
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            check = "Sua that bai";
//        }
//        return check;
//    }
    
//    public long xoa(long id) {
//        try (Session session = Hibernate.getFACTORY().openSession()) {
//            Transaction trans = session.getTransaction();
//            trans.begin();
//            try {
//                String hql = "DELETE Product p WHERE p.id = :id";
//                Query query = session.createQuery(hql);
//                query.setParameter("id", id);
//                int result = query.executeUpdate();
//                if (result == 0) {
//                    id = 0;
//                }
//                trans.commit();
//            } catch (Exception e) {
//                id = -1;
//            }
//           
//        }
//        return id;
//    }
    public String xoa(SanPham sp,String ma) {
        Transaction tr = null;
        String check = "";
        try (Session s = HibernateUtil.getSessionFactory().openSession();) {
            tr = s.beginTransaction();

            SanPham sp1 = new SanPham(sp.getMa());
            s.delete(sp);
            check = "Xóa thành công";
            tr.commit();

        } catch (Exception e) {
            e.printStackTrace();
            check = "Xóa thất bại";
        }
        return check;
    }
}
