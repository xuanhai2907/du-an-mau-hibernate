package services;

import domainModels.CuaHang;
import domainModels.CuaHang;
import customModels.CuaHangCustom;
import java.util.List;
import java.util.UUID;

public interface CuaHangSerivce {

    public List<CuaHangCustom> getAll();

    public void them(CuaHangCustom qlch);

    public void sua(CuaHangCustom qlch);

    public void xoa(UUID id);
    
    public CuaHang finId(UUID id);
}
