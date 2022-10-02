/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.SanPham;
import java.util.List;

/**
 *
 * @author asus
 */
public interface SanPhamService {

    List<SanPham> getAll();

    SanPham them(SanPham sp);


    String sua(SanPham sp);

    String xoa(SanPham sp,String ma);
}
