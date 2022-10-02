/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChiTietSP;
import Utilities.HibernateUtil;
import ViewModels.ViewModelsChiTietSanPham;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author window
 */
public class ChiTietSanPhamRepository {

    public List<ViewModelsChiTietSanPham> getAll(String ten) {
        Session session = HibernateUtil.getSessionFactory().openSession();
//        String ten = "i";
        javax.persistence.Query query = session.createQuery("select "
                + " new ViewModels.ViewModelsChiTietSanPham("
                + " m.idSP.ma as ma,"
                + " m.idSP.ten as ten,"
                + " m.namBH as namBH,"
                + " m.moTa as moTa,"
                + " m.soLuongTon as slSp,"
                + " m.giaNhap as giaNhap,"
                + " m.giaBan as giaBan) "
                + " from DomainModels.ChiTietSP m where m.idSP.ten like CONCAT('%',:ten,'%')");
        query.setParameter("ten", ten);
        List<ViewModelsChiTietSanPham> list = query.getResultList();
        System.out.println(list.size());
        session.close();
        return list;
    }

    public List<ChiTietSP> getList() {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("From ChiTietSP");
        List<ChiTietSP> ls = query.getResultList();
        return ls;
    }
}
