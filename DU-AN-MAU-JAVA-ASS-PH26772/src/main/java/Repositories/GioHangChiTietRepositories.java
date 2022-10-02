/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChiTietSP;
import DomainModels.GioHangChiTiet;
import DomainModels.GioHangChiTietId;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Services.GioHangChiTietService;

/**
 *
 * @author admin
 */
public class GioHangChiTietRepositories {

    public List<GioHangChiTiet> getList() {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("From GioHangChiTiet");
        List<GioHangChiTiet> ls = query.getResultList();
        return ls;
    }


    public void Insert(GioHangChiTiet ghct) {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.save(ghct);
        trans.commit();
        session.close();
    }

    public void Update(GioHangChiTiet ghct) {
                Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        
        session.update(ghct);
        trans.commit();
        session.close();
    }

    public void Delete(GioHangChiTiet ghct) {
                        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        
        session.delete(ghct);
        trans.commit();
        session.close();
    }
    
}
