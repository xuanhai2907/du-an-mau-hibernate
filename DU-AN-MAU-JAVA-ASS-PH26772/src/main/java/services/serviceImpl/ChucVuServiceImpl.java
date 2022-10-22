/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.serviceImpl;

import domainModels.ChucVu;
import repositories.ChucVuRepository;
import java.util.List;
import java.util.UUID;
import services.ChucVuService;
import customModels.ChucVuCustom;
import customModels.ViewModelsChucVu;
import java.util.ArrayList;

public class ChucVuServiceImpl implements ChucVuService {

    private ChucVuRepository rp = new ChucVuRepository();

    @Override
    public List<ChucVuCustom> getAll() {
        return rp.getAll();
    }

    @Override
    public void them(ChucVuCustom qlcv) {
        ChucVu cv = new ChucVu(qlcv.getMa(), qlcv.getTen());
        rp.them(cv);
    }

    @Override
    public void sua(ChucVuCustom qlcv) {
        ChucVu cv = new ChucVu(qlcv.getId(), qlcv.getMa(), qlcv.getTen());
        rp.sua(cv);
    }

    @Override
    public void xoa(UUID id) {
        rp.xoa(id);
    }

    @Override
    public ChucVu findId(UUID id) {
        return rp.findId(id);
    }
}
