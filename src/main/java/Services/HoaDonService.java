/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.HoaDon;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Acer
 */
public interface HoaDonService {
    List<HoaDon> getList();
    HoaDon getHoaDonById(String ma);
    void Insert(HoaDon hd);
    void Update(HoaDon hd, UUID id);
    void Delete(UUID id);
    
}
