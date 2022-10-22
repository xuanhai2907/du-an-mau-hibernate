package services.serviceImpl;

import domainModels.CuaHang;
import repositories.CuaHangRepository;
import services.CuaHangSerivce;
import customModels.CuaHangCustom;
import java.util.ArrayList;

import java.util.List;
import java.util.UUID;

/**
 *
 * @author asus
 */
public class CuaHangServiceImpl implements CuaHangSerivce {

    private CuaHangRepository rp = new CuaHangRepository();

    @Override
    public List<CuaHangCustom> getAll() {
        List<CuaHangCustom> listQLCH = new ArrayList<>();
        for (CuaHang cuaHang : rp.getAll()) {
            CuaHangCustom qlch = new CuaHangCustom(cuaHang.getId(), cuaHang.getMa(), cuaHang.getTen(), cuaHang.getDiaChi(), cuaHang.getThanhPho(), cuaHang.getQuocGia());
            listQLCH.add(qlch);
        }
        return listQLCH;
    }

    @Override
    public void them(CuaHangCustom qlch) {
        CuaHang ch = new CuaHang(qlch.getMa(), qlch.getTen(), qlch.getDiaChi(), qlch.getThanhPho(), qlch.getQuocGia());
        rp.them(ch);
    }

    @Override
    public void sua(CuaHangCustom qlch) {
        CuaHang ch = new CuaHang(qlch.getId(), qlch.getMa(), qlch.getTen(), qlch.getDiaChi(), qlch.getThanhPho(), qlch.getQuocGia());
        rp.sua(ch);
    }

    @Override
    public void xoa(UUID id) {
        rp.xoa(id);
    }

    @Override
    public CuaHang finId(UUID id) {
        return rp.finId(id);
    }

}
