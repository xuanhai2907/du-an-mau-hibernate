/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domainModels.HoaDon;
import customModels.ViewModelsHoaDon;
import customModels.ViewModelsHoaDonChiTiet;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author window
 */
public interface HoaDonChiTietService {

    public List<ViewModelsHoaDonChiTiet> getAll(UUID id);
    
    public boolean insertHoaDonChiTiet(Map<String, ViewModelsHoaDonChiTiet> mapHoaDonChiTiet);

}