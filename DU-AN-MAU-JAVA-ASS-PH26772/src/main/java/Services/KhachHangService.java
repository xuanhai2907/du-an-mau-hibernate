/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.KhachHang;
import ViewModels.QLKhachHang;
import java.util.List;
import java.util.UUID;

public interface KhachHangService {

    public List<QLKhachHang> getList();

    public void them(QLKhachHang qlkh);

    public void sua(QLKhachHang qlkh);

    public void xoa(UUID id);

    public KhachHang finID(UUID id);

    public List<QLKhachHang> getListByDiaChi(String diaChi);
    
    public QLKhachHang findByMa(String ma);
    
    public boolean checkMa(String ma);
}
