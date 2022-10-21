/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.SanPham;
import ViewModels.QLSanPham;
import java.util.List;
import java.util.UUID;


public interface SanPhamService {

    List<QLSanPham> getAll();

    public void them(QLSanPham sp);


    public void sua(QLSanPham sp);

    public void xoa(UUID id);
    
    public SanPham findId(UUID id);
}
