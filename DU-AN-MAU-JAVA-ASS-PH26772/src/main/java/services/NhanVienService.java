/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domainModels.NhanVien;
import customModels.NhanVienCustom;
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

    public List<NhanVienCustom> getList();

    public void them(NhanVienCustom qlnv);

    public void sua(NhanVienCustom qlnv);

    public void xoa(UUID id);

    public NhanVien finID(UUID id);

    public boolean checkMa(String ma);

    public List<NhanVienCustom> getListBySdt(String sdt);

    public List<NhanVienCustom> getListByMa1(String ma);

    public List<NhanVienCustom> getListByGioiTinh(String gt);
}
