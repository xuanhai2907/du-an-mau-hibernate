package Repositories;


import DomainModels.CuaHang;
import Utilities.HibernateUtil;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author asus
 */
public class CuaHangRepository {

    public List<CuaHang> getAll() {
        try ( Session s =HibernateUtil.getSessionFactory().openSession();) {
            Query q = s.createQuery("From CuaHang");
            List<CuaHang> list = q.getResultList();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public CuaHang them(CuaHang ch) {
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.save(ch);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                ch = null;
            }
        } finally {
            return ch;
        }
    }

    public boolean sua(CuaHang ch) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();
            session.update(ch);
            transaction.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            transaction.rollback();
            return false;
        }
    }

    public String xoa(CuaHang ch, String ma) {
        Transaction tr = null;
        String check = "";
        try ( Session s = HibernateUtil.getSessionFactory().openSession();) {
            tr = s.beginTransaction();

            CuaHang ch1 = new CuaHang(ch.getMa());
            s.delete(ch);
            check = "Xóa thành công";
            tr.commit();

        } catch (Exception e) {
            e.printStackTrace();
            check = "Xóa thất bại";
        }
        return check;
    }
}
