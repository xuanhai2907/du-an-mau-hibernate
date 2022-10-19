package Services;

import DomainModels.CuaHang;
import DomainModels.CuaHang;
import ViewModels.QLCuaHang;
import java.util.List;
import java.util.UUID;

public interface CuaHangSerivce {

    public List<QLCuaHang> getAll();

    public void them(QLCuaHang qlch);

    public void sua(QLCuaHang qlch);

    public void xoa(UUID id);
    
    public CuaHang finId(UUID id);
}
