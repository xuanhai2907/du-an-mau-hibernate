/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import domainModels.GioHangChiTiet;
import domainModels.GioHangChiTietId;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author admin
 */
public interface GioHangChiTietService {
    public List<GioHangChiTiet> getList();
    
    public void Insert(GioHangChiTiet ghct);
    
    public void Update(GioHangChiTiet ghct);
    
    public void Delete(GioHangChiTiet ghct);
}
