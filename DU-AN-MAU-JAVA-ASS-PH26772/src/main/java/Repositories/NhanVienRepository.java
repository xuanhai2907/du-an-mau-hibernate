/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.NhanVien;
import Utilities.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author window
 */
public class NhanVienRepository {
    
    public NhanVien getNhanVienById(String ma){
        Session session = HibernateUtil.getSessionFactory().openSession();
        NhanVien nv = session.find(NhanVien.class, ma);
        return nv;
    }
}
