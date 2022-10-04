/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import Repositories.HoaDonChiTietRepository;
import Services.HoaDonChiTietService;
import ViewModels.ViewModelsHoaDonChiTiet;
import java.util.List;

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
    public List<ViewModelsHoaDonChiTiet> getAll() {
        return re.getAll();
    }

}
