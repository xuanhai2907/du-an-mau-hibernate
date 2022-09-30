/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.KhachHang;
import java.util.List;
import java.util.UUID;


public interface KhachHangService {
    public List<KhachHang> getList();
    public void insert(KhachHang kh);
    public void update( KhachHang kh,UUID vitri);
    public void delete(UUID vitri);
}
