package repositories;

import domainModels.ChiTietSP;
import utilities.HibernateUtil;
import customModels.ChiTietSPCustom;
import customModels.ViewModelsChiTietSanPham;
import customModels.ViewModelsHoaDonChiTiet;
import java.util.ArrayList;
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
public class ChiTietSanPhamRepository {

    public List<ViewModelsChiTietSanPham> getAll(String ten) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        javax.persistence.Query query = session.createQuery("select "
                + " new ViewModels.ViewModelsChiTietSanPham("
                + " m.id,"
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

    public List<ChiTietSPCustom> getList() {
        try ( Session s = HibernateUtil.getSessionFactory().openSession();) {
            Query q = s.createQuery("select "
                    + " new ViewModels.QLChiTietSP("
                    + " m.id,"
                    + " m.namBH as namBH,"
                    + " m.moTa as moTa,"
                    + " m.soLuongTon as soLuongTon,"
                    + " m.giaNhap as giaNhap "
                    + " )"
                    + " from DomainModels.ChiTietSP m ");//HQL 
            List<ChiTietSPCustom> list = q.getResultList();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<ChiTietSPCustom> getListByNamBH(int namBH) {
        try ( Session s = HibernateUtil.getSessionFactory().openSession();) {
            Query q = s.createQuery("select "
                    + " new ViewModels.QLChiTietSP("
                    + " m.id,"
                    + " m.namBH as namBH,"
                    + " m.moTa as moTa,"
                    + " m.soLuongTon as soLuongTon,"
                    + " m.giaNhap as giaNhap "
                    + " )"
                    + " from DomainModels.ChiTietSP m where m.namBH = :namBH");//HQL 
            q.setParameter("namBH", namBH);
            List<ChiTietSPCustom> list = q.getResultList();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void them(ChiTietSP chiTietSP) {
        Transaction t = null;
        String check;
        try ( Session session = new HibernateUtil().getSessionFactory().openSession();) {
            t = session.beginTransaction();
            session.save(chiTietSP);
            t.commit();
        } catch (Exception e) {
            e.printStackTrace();
            t.rollback(); //hoàn lại kết quả
        }
    }

    public void sua(ChiTietSP chiTietSP) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        s.update(chiTietSP);
        t.commit();
        s.close();
    }

    public void xoa(UUID id) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        ChiTietSP chiTietSP = s.find(ChiTietSP.class, id);
        s.delete(chiTietSP);
        t.commit();
        s.close();
    }

    public ChiTietSP findId(UUID id) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        ChiTietSP ct = s.find(ChiTietSP.class, id);
        t.commit();
        s.close();
        return ct;
    }

    public boolean updateSoLuong(Map<UUID, ViewModelsChiTietSanPham> listMap) {
        Transaction transaction = null;
        String hql = "UPDATE ChiTietSP SET SoLuongTon = (SoLuongTon - :soLuong) where id = :id";

        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {

            Query query = session.createQuery(hql);
            for (Map.Entry<UUID, ViewModelsChiTietSanPham> entry : listMap.entrySet()) {
                transaction = session.beginTransaction();
                ViewModelsChiTietSanPham value = entry.getValue();
                query.setParameter("soLuong", value.getSlSp());
                System.out.println(value.getSlSp());
                query.setParameter("id", entry.getKey());
                query.executeUpdate();

                transaction.commit();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        }
    }
}
