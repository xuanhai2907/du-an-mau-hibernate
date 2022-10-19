/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.HoaDon;
import Utilities.HibernateUtil;
import ViewModels.ViewModelsHoaDon;
import ViewModels.ViewModelsHoaDonChiTiet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author window
 */
public class HoaDonChiTietRepository {

    public List<ViewModelsHoaDonChiTiet> getAll(UUID id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        javax.persistence.Query query = session.createQuery("select "
                + " new ViewModels.ViewModelsHoaDonChiTiet("
                + " m.idChiTietSP.idSP.ma as ma,"
                + " m.idHoaDon.ngayTao as ngayTao,"
                + " m.idHoaDon.idNhanVien.ten as tenNhanVien,"
                + " m.soLuong as soLuong,"
                + " m.donGia as donGia,"
                + " m.idHoaDon.id as idHoaDon,"
                + " m.idChiTietSP.id as idChiTietSP"
                + " )"
                + " from DomainModels.HoaDonChiTiet m WHERE m.idHoaDon.id = :maHoaDon");
        query.setParameter("maHoaDon", id);
        List<ViewModelsHoaDonChiTiet> list = query.getResultList();
        session.close();
        return list;
    }

    public boolean insertHoaDonChiTiet(Map<String, ViewModelsHoaDonChiTiet> listMapHoaDon){
        Transaction transaction = null;
        String hql = "INSERT INTO HoaDonChiTiet(donGia, soLuong, idHoaDon, idChiTietSP) values (?, ?, ?, ?)";
        
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createNativeQuery(hql);
            for (Map.Entry<String, ViewModelsHoaDonChiTiet> entry : listMapHoaDon.entrySet()) {
                ViewModelsHoaDonChiTiet value = entry.getValue();
                query.setParameter(1, value.getDonGia());
                query.setParameter(2, value.getSoLuong());
                query.setParameter(3, value.getIdHoaDon());
                query.setParameter(4, value.getIdChiTietSP());
                query.executeUpdate();
            }
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        }
    }

}
