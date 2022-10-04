/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Utilities.HibernateUtil;
import ViewModels.ViewModelsHoaDonChiTiet;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author window
 */
public class HoaDonChiTietRepository {
        public List<ViewModelsHoaDonChiTiet> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        javax.persistence.Query query = session.createQuery("select "
                + " new ViewModels.ViewModelsHoaDonChiTiet("
                + " m.idHoaDon.ma as maHoaDon,"
                + " m.idHoaDon.ngayTao as ngayTao,"
                + " m.idHoaDon.idNhanVien.ten as tenNhanVien,"
                + " m.idHoaDon.tinhTrang as tinhTrang"
                + " )"
                + " from DomainModels.HoaDonChiTiet m");
        List<ViewModelsHoaDonChiTiet> list = query.getResultList();
        System.out.println(list.size());
        session.close();
        return list;
    }
}
