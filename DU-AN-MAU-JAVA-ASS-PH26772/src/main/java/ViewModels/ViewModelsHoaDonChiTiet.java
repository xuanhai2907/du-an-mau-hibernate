/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.util.Date;
import lombok.Data;
 
@Data
public class ViewModelsHoaDonChiTiet {
    private String maHoaDon;
    private Date ngayTao;
    private String tenNhanVien;
    private int tinhTrang;

    public ViewModelsHoaDonChiTiet(String maHoaDon, Date ngayTao, String tenNhanVien, int tinhTrang) {
        this.maHoaDon = maHoaDon;
        this.ngayTao = ngayTao;
        this.tenNhanVien = tenNhanVien;
        this.tinhTrang = tinhTrang;
    }

    public ViewModelsHoaDonChiTiet() {
    }
    
}
