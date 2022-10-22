package customModels;

import domainModels.ChiTietSP;
import domainModels.HoaDon;
import java.math.BigDecimal;
import java.math.BigInteger;

public class HoaDonChiTietCustom {

    private ChiTietSP idChiTietSP;
    private HoaDon idHoaDon;
    private BigDecimal donGia;
    private int soLuong;

    public HoaDonChiTietCustom() {
    }

    public HoaDonChiTietCustom(ChiTietSP idChiTietSP, HoaDon idHoaDon, BigDecimal donGia, int soLuong) {
        this.idChiTietSP = idChiTietSP;
        this.idHoaDon = idHoaDon;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public ChiTietSP getIdChiTietSP() {
        return idChiTietSP;
    }

    public void setIdChiTietSP(ChiTietSP idChiTietSP) {
        this.idChiTietSP = idChiTietSP;
    }

    public HoaDon getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(HoaDon idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public BigDecimal getDonGia() {
        return donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float thanhTien() {
        float donGiaass = Float.valueOf(donGia.floatValue());
        return donGiaass * soLuong;
    }

    @Override
    public String toString() {
        return "QLHoaDonChiTiet{" + "idChiTietSP=" + idChiTietSP + ", idHoaDon=" + idHoaDon + ", donGia=" + donGia + ", soLuong=" + soLuong + '}';
    }

    public Object[] toRowData() {
        return new Object[]{idChiTietSP.getMoTa(), idHoaDon.getMa(), donGia, soLuong, thanhTien()};
    }
}
