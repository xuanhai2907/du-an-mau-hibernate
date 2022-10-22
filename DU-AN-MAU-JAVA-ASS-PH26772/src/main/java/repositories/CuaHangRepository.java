package repositories;

import domainModels.CuaHang;

import utilities.HibernateUtil;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CuaHangRepository {

    public List<CuaHang> getAll() {
        try ( Session session = new HibernateUtil().getSessionFactory().openSession();) {
            Query query = session.createQuery("From CuaHang");
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    

    public String them(CuaHang cuaHang) {
        Transaction t = null;
        String check;
        try ( Session session = HibernateUtil.getSessionFactory().openSession();) {
            t = session.beginTransaction();
            session.save(cuaHang);
            t.commit();
            check = "Thêm thành công";
        } catch (Exception e) {
            e.printStackTrace();
            t.rollback(); //hoàn lại kết quả
            check = "Thêm thất bại";
        }
        return check;
    }

    public void sua(CuaHang cuaHang) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        s.update(cuaHang);
        t.commit();
        s.close();
    }

    public void xoa(UUID id) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        CuaHang ch = s.find(CuaHang.class, id);
        s.delete(ch);
        t.commit();
        s.close();
    }

    public CuaHang finId(UUID id) {
        Session s = HibernateUtil.getSessionFactory().openSession();

        Transaction t = s.beginTransaction();
        CuaHang ch = s.find(CuaHang.class, id);
        t.commit();
        s.close();
        return ch;
    }

}
