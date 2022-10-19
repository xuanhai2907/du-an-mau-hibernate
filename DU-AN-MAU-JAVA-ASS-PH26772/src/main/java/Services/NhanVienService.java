/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.NhanVien;
import ViewModels.QLNhanVien;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author window
 */
public interface NhanVienService {

//    public NhanVien getNhanVienById(String ma);
    public NhanVien getNhanVienByMa(String ma);

    public NhanVien getNhanVienById(String ma);

    public List<QLNhanVien> getList();

    public void them(QLNhanVien qlnv);

    public void sua(QLNhanVien qlnv);

    public void xoa(UUID id);

    public NhanVien finID(UUID id);

}
