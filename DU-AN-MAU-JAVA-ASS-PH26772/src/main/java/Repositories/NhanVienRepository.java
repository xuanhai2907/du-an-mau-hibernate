/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.NhanVien;
import Utilities.HibernateUtil;
import java.util.List;
import java.util.UUID;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author window
 */
public class NhanVienRepository {


//    public NhanVien getNhanVienById(String id){
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        NhanVien nv = session.find(NhanVien.class, id);
//        return nv;
//    }
    public NhanVien getNhanVienByMa(String ma) {
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        javax.persistence.Query query = session1.createQuery("From NhanVien where Ma = :ma");// truy vấn trên entity(HQL)
        query.setParameter("ma", ma);
        List<NhanVien> list = query.getResultList();
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    public NhanVien getNhanVienById(String ma) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        NhanVien nv = session.find(NhanVien.class, ma);
        return nv;
    }

    public List<NhanVien> getList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        javax.persistence.Query query = session.createQuery("From NhanVien");
        List<NhanVien> list = query.getResultList();
        session.close();
        return list;

    }
}
