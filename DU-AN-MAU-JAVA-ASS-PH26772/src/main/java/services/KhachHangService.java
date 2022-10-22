/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import domainModels.KhachHang;
import customModels.KhachHangCustom;
import java.util.List;
import java.util.UUID;

public interface KhachHangService {

    public List<KhachHangCustom> getList();

    public void them(KhachHangCustom qlkh);

    public void sua(KhachHangCustom qlkh);

    public void xoa(UUID id);

    public KhachHang finID(UUID id);

    public List<KhachHangCustom> getListByDiaChi(String diaChi);
    
    public KhachHangCustom findByMa(String ma);
    
    public boolean checkMa(String ma);
}
