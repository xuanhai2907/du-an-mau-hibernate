/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domainModels.SanPham;
import customModels.SanPhamCustom;
import java.util.List;
import java.util.UUID;


public interface SanPhamService {

    List<SanPhamCustom> getAll();

    public void them(SanPhamCustom sp);


    public void sua(SanPhamCustom sp);

    public void xoa(UUID id);
    
    public SanPham findId(UUID id);
}
