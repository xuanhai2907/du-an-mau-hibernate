/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.NhanVien;
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

    public List<NhanVien> getList();

    public void Insert(NhanVien nhanVien);

    public void Update(NhanVien nhanVien);

    public void Delete(NhanVien id);

}
