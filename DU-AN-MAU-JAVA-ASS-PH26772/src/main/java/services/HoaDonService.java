/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import domainModels.HoaDon;
import customModels.HoaDonCustom;
import customModels.ViewModelsHoaDon;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Acer
 */
public interface HoaDonService {

    List<HoaDonCustom> getList();

    HoaDon getHoaDonById(String ma);

    void Insert(HoaDon hd);

    void Update(HoaDon hd, UUID id);

    void Delete(UUID id);

    public List<ViewModelsHoaDon> getAll();

    public boolean updateTrangThai(UUID id);

    public void them(HoaDonCustom qlhd);

    public void sua(HoaDonCustom qlhd);

    public void xoa(UUID id);

}
