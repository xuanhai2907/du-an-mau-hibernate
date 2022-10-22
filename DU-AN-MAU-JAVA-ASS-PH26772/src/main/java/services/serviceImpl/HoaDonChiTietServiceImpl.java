/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.serviceImpl;

import domainModels.HoaDon;
import repositories.HoaDonChiTietRepository;
import services.HoaDonChiTietService;
import customModels.ViewModelsHoaDon;
import customModels.ViewModelsHoaDonChiTiet;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author window
 */
public class HoaDonChiTietServiceImpl implements HoaDonChiTietService {

    private HoaDonChiTietRepository re;

    public HoaDonChiTietServiceImpl() {
        this.re = new HoaDonChiTietRepository();
    }

    @Override
    public List<ViewModelsHoaDonChiTiet> getAll(UUID id) {
        return re.getAll(id);
    }

    @Override
    public boolean insertHoaDonChiTiet(Map<String, ViewModelsHoaDonChiTiet> mapHoaDonChiTiet) {
       return re.insertHoaDonChiTiet(mapHoaDonChiTiet);
    }

}
