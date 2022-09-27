
package Repositories;

import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import DomainModels.KhachHang;
import Services.KhachHangInterface;
import org.hibernate.Session;


/**
 *
 * @author admin
 */
public class KhachHangRepository implements KhachHangInterface
{

    @Override
    public List<KhachHang> getList() {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("From KhachHang");
        List<KhachHang> ls = query.getResultList();
        return ls;
    }

    @Override
    public void insert(KhachHang kh) {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        session.save(kh);
        session.close();
    }

    @Override
    public void update( KhachHang kh,UUID vitri) {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        KhachHang khachhang = session.get(KhachHang.class, vitri);
        
        session.getTransaction().begin();
        session.update(khachhang);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(UUID vitri) {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        
         KhachHang kh = session.get(KhachHang.class, vitri);
         session.getTransaction().begin();
         session.delete(kh);
         session.getTransaction().commit();
         session.close();
    }
    
}
