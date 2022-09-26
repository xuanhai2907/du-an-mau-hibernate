
package Services;

import java.util.List;
import java.util.UUID;
import DomainModels.KhachHang;

/**
 *
 * @author admin
 */
public interface KhachHangInterface {
    public List<KhachHang> getList();
    public void insert(KhachHang kh);
    public void update(UUID vitri, KhachHang kh);
    public void delete(UUID vitri);
}