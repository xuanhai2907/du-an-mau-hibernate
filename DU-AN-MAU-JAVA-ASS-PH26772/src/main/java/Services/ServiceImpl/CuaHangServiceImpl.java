package Services.ServiceImpl;

import DomainModels.CuaHang;
import Repositories.CuaHangRepository;
import Services.CuaHangSerivce;


import java.util.List;

/**
 *
 * @author asus
 */
public class CuaHangServiceImpl implements CuaHangSerivce {

    private CuaHangRepository rp = new CuaHangRepository();

    @Override
    public List<CuaHang> getAll() {
        return rp.getAll();
    }

    @Override
    public CuaHang them(CuaHang ch) {
        return rp.them(ch);
    }

    @Override
    public String sua(CuaHang ch) {
        boolean test = rp.sua(ch);
        if (test) {
            return "Sửa thành công";
        } else {
            return "Sửa thất bại";
        }
    }

    @Override
    public String xoa(CuaHang ch, String ma) {
        return rp.xoa(ch, ma);
    }

}
