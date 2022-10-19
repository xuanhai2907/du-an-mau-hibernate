package Services.ServiceImpl;

import DomainModels.CuaHang;
import Repositories.CuaHangRepository;
import Services.CuaHangSerivce;
import ViewModels.QLCuaHang;
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
    public List<QLCuaHang> getAll() {
        List<QLCuaHang> listQLCH = new ArrayList<>();
        for (CuaHang cuaHang : rp.getAll()) {
            QLCuaHang qlch = new QLCuaHang(cuaHang.getId(), cuaHang.getMa(), cuaHang.getTen(), cuaHang.getDiaChi(), cuaHang.getThanhPho(), cuaHang.getQuocGia());
            listQLCH.add(qlch);
        }
        return listQLCH;
    }

    @Override
    public void them(QLCuaHang qlch) {
        CuaHang ch = new CuaHang(qlch.getMa(), qlch.getTen(), qlch.getDiaChi(), qlch.getThanhPho(), qlch.getQuocGia());
        rp.them(ch);
    }

    @Override
    public void sua(QLCuaHang qlch) {
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
