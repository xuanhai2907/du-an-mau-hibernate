package Services;

import DomainModels.CuaHang;
import DomainModels.CuaHang;
import java.util.List;

public interface CuaHangSerivce {

    List<CuaHang> getAll();

    CuaHang them(CuaHang ch);

    String sua(CuaHang ch);

    String xoa(CuaHang ch, String ma);
}
