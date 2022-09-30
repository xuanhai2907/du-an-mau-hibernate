/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.GioHang;
import java.util.List;
import java.util.UUID;


public interface GioHangService{

    public List<GioHang> getList();

    public void insert(GioHang gh);

    public void update(GioHang gh, UUID viTri);

    public void delete(UUID viTri);

}
