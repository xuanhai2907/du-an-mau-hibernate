/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import domainModels.HoaDon;
import utilities.HibernateUtil;
import customModels.HoaDonCustom;
import customModels.ViewModelsHoaDon;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Acer
 */
public class HoaDonRepository {

    public HoaDon getHoaDonById(String ma) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        HoaDon hd = session.find(HoaDon.class, ma);
        return hd;
    }

    public List<HoaDonCustom> getList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("select hd From HoaDon hd");
        List<HoaDonCustom> list = query.getResultList();
        session.close();
        return list;
    }

    public void Insert(HoaDon hoaDon) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(hoaDon);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }

    }

    public void Update(HoaDon hoaDon, UUID id) {
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

    public void Delete(UUID id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        HoaDon hd = session.get(HoaDon.class, id);
        session.getTransaction().begin();
        session.delete(hd);
        session.getTransaction().commit();
        session.close();

    }

    public boolean updateTrangThai(UUID id) {
        Transaction transaction = null;
        String hql = "UPDATE HoaDon set tinhTrang = 2 where id = :id";
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery(hql);
            query.setParameter("id", id);
            query.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        }
    }

    public List<ViewModelsHoaDon> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        javax.persistence.Query query = session.createQuery("select "
                + " new ViewModels.ViewModelsHoaDon("
                + " m.id,"
                + " m.ma as maHoaDon,"
                + " m.ngayTao as ngayTao,"
                + " m.idNhanVien.ten as tenNhanVien,"
                + " m.tinhTrang as tinhTrang) "
                + " from DomainModels.HoaDon m ORDER BY m.ngayTao DESC");
        List<ViewModelsHoaDon> list = query.getResultList();
        session.close();
        return list;
    }

    public String them(HoaDon hoaDon) {
        Transaction t = null;
        String check;
        try ( Session session = new HibernateUtil().getSessionFactory().openSession();) {
            t = session.beginTransaction();
            session.save(hoaDon);
            t.commit();
            check = "Thêm thành công";
        } catch (Exception e) {
            e.printStackTrace();
            t.rollback(); //hoàn lại kết quả
            check = "Thêm thất bại";
        }
        return check;
    }

    public void sua(HoaDon hoaDon) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        s.update(hoaDon);
        t.commit();
        s.close();
    }

    public void xoa(UUID id) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        HoaDon hd = s.find(HoaDon.class, id);
        s.delete(hd);
        t.commit();
        s.close();
    }

}
