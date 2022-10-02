/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChucVu;
import DomainModels.HoaDon;
import Utilities.HibernateUtil;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Acer
 */
public class HoaDonRepository {
    public HoaDon getHoaDonById(String ma){
        Session session = HibernateUtil.getSessionFactory().openSession();
        HoaDon hd = session.find(HoaDon.class, ma);
        return hd;
    }
    
    public List<HoaDon> getList(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query =session.createQuery("From HoaDon");
        List<HoaDon> list = query.getResultList();
        session.close();
        return list;
    }
    public void Insert(HoaDon hoaDon){
        HoaDon hd = new HoaDon();
         hd.setDiaChhi(hoaDon.getDiaChhi());
        hd.setMa(hoaDon.getMa());
        hd.setNgayNhan(hoaDon.getNgayNhan());
        hd.setIdKH(hoaDon.getIdKH());
        hd.setIdNhanVien(hoaDon.getIdNhanVien());
        hd.setNgayShip(hoaDon.getNgayShip());
        hd.setNgayTao(hoaDon.getNgayTao());
        hd.setNgayThanhToan(hoaDon.getNgayThanhToan());
        hd.setTinhTrang(hoaDon.getTinhTrang());
        hd.setSdt(hoaDon.getSdt());
        hd.setTenNguoiNhan(hoaDon.getTenNguoiNhan());
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(hd);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    public void Update(HoaDon hoaDon,UUID id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        HoaDon hd = session.get(HoaDon.class, id);
         hd.setDiaChhi(hoaDon.getDiaChhi());
        hd.setNgayNhan(hoaDon.getNgayNhan());
        hd.setIdKH(hoaDon.getIdKH());
        hd.setIdNhanVien(hoaDon.getIdNhanVien());
        hd.setNgayShip(hoaDon.getNgayShip());
        hd.setNgayTao(hoaDon.getNgayTao());
        hd.setNgayThanhToan(hoaDon.getNgayThanhToan());
        hd.setTinhTrang(hoaDon.getTinhTrang());
        hd.setSdt(hoaDon.getSdt());
        hd.setTenNguoiNhan(hoaDon.getTenNguoiNhan());
        session.getTransaction().begin();
        session.save(hd);
        session.getTransaction().commit();
        session.close();
        
    }
    
    public void Delete(UUID id ){
        Session session = HibernateUtil.getSessionFactory().openSession();
        HoaDon hd= session.get(HoaDon.class, id);
        session.getTransaction().begin();
        session.delete(hd);
        session.getTransaction().commit();
        session.close();
    
    }
}
