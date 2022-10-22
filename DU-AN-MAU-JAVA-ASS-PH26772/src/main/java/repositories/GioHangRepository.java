/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import domainModels.GioHang;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import services.GioHangService;

/**
 *
 * @author admin
 */
public class GioHangRepository{

    public List<GioHang> getList() {
        Session session = utilities.HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("From GioHang");
        List<GioHang> ls = query.getResultList();
        return ls;
    }

    public void insert(GioHang gh) {

        Session session = utilities.HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.save(gh);
        trans.commit();
        session.close();

    }

    public void update(GioHang gh, UUID viTri) {
        Session session = utilities.HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        gh.setId(viTri);
        session.update(gh);
        trans.commit();
        session.close();
    }

    public void delete(UUID viTri) {
        Session session = utilities.HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        GioHang giohang = session.get(GioHang.class, viTri);
        session.delete(giohang);
        trans.commit();
        session.close();
    }

}
