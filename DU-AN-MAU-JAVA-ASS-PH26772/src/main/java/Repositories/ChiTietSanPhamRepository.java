package Repositories;

import DomainModels.ChiTietSP;
import Utilities.HibernateUtil;
import ViewModels.ViewModelsChiTietSanPham;
import ViewModels.ViewModelsHoaDonChiTiet;
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

    public List<ChiTietSP> getList() {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("From ChiTietSP");
        List<ChiTietSP> ls = query.getResultList();
        return ls;
    }

    public List<ChiTietSP> getAll() {
        try ( Session s = HibernateUtil.getSessionFactory().openSession();) {
            Query q = s.createQuery("From ChiTietSP", ChiTietSP.class);//HQL 
            List<ChiTietSP> list = q.getResultList();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ChiTietSP them(ChiTietSP ctSP) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.save(ctSP);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                ctSP = null;
            }
        } finally {
            return ctSP;

        }
    }

    public boolean sua(ChiTietSP ctSP) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(ctSP);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        }
    }

    public String xoa(UUID id) {
        Transaction tr = null;
        String check = "";
        try ( Session s = HibernateUtil.getSessionFactory().openSession();) {
            tr = s.beginTransaction();
            ChiTietSP ct = s.find(ChiTietSP.class, id);
            s.delete(ct);
            check = "Xóa thành công";
            tr.commit();

        } catch (Exception e) {
            e.printStackTrace();
            check = "Xóa thất bại";
        }
        return check;
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
