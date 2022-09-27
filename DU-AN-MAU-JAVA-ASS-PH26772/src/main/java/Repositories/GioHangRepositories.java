/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.GioHang;
import Services.GioHangInterface;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class GioHangRepositories implements GioHangInterface {

    @Override
    public List<GioHang> getList() {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("From GioHang");
        List<GioHang> ls = query.getResultList();
        return ls;
    }

    @Override
    public void insert(GioHang gh) {

        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        session.save(gh);
        session.close();
    }

    @Override
    public void update( GioHang gh,UUID viTri) {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        GioHang giohang = session.get(GioHang.class, viTri);
        session.getTransaction().begin();
        session.update(gh);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(UUID viTri) {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        GioHang giohang = session.get(GioHang.class, viTri);
        session.getTransaction().begin();
        session.delete(giohang);
        session.getTransaction().commit();
        session.close();        
    }

}
