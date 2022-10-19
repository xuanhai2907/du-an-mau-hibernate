/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.HoaDon;
import ViewModels.QLHoaDon;
import ViewModels.ViewModelsHoaDon;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Acer
 */
public interface HoaDonService {

    List<QLHoaDon> getList();

    HoaDon getHoaDonById(String ma);

    void Insert(HoaDon hd);

    void Update(HoaDon hd, UUID id);

    void Delete(UUID id);

    public List<ViewModelsHoaDon> getAll();

    public boolean updateTrangThai(UUID id);

    public void them(QLHoaDon qlhd);

    public void sua(QLHoaDon qlhd);

    public void xoa(UUID id);

}
