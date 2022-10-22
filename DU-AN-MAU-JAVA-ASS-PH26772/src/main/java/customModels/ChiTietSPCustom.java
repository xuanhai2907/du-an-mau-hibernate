package customModels;

import domainModels.DongSP;
import domainModels.MauSac;
import domainModels.NSX;
import domainModels.SanPham;
import java.math.BigDecimal;
import java.util.UUID;

public class ChiTietSPCustom {

    private UUID id;
    private BigDecimal giaBan;
    private BigDecimal giaNhap;
    private String moTa;
    private int namBH;
    private int soLuongTon;
    private DongSP idDongSP;
    private MauSac idMauSac;
    private NSX idNsx;
    private SanPham idSP;

    public ChiTietSPCustom() {
    }

    public ChiTietSPCustom(UUID id, BigDecimal giaBan, BigDecimal giaNhap, String moTa, int namBH, int soLuongTon, DongSP idDongSP, MauSac idMauSac, NSX idNsx, SanPham idSP) {
        this.id = id;
        this.giaBan = giaBan;
        this.giaNhap = giaNhap;
        this.moTa = moTa;
        this.namBH = namBH;
        this.soLuongTon = soLuongTon;
        this.idDongSP = idDongSP;
        this.idMauSac = idMauSac;
        this.idNsx = idNsx;
        this.idSP = idSP;
    }

    public ChiTietSPCustom(BigDecimal giaBan, BigDecimal giaNhap, String moTa, int namBH, int soLuongTon, DongSP idDongSP, MauSac idMauSac, NSX idNsx, SanPham idSP) {
        this.giaBan = giaBan;
        this.giaNhap = giaNhap;
        this.moTa = moTa;
        this.namBH = namBH;
        this.soLuongTon = soLuongTon;
        this.idDongSP = idDongSP;
        this.idMauSac = idMauSac;
        this.idNsx = idNsx;
        this.idSP = idSP;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }

    public BigDecimal getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(BigDecimal giaNhap) {
        this.giaNhap = giaNhap;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getNamBH() {
        return namBH;
    }

    public void setNamBH(int namBH) {
        this.namBH = namBH;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public DongSP getIdDongSP() {
        return idDongSP;
    }

    public void setIdDongSP(DongSP idDongSP) {
        this.idDongSP = idDongSP;
    }

    public MauSac getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(MauSac idMauSac) {
        this.idMauSac = idMauSac;
    }

    public NSX getIdNsx() {
        return idNsx;
    }

    public void setIdNsx(NSX idNsx) {
        this.idNsx = idNsx;
    }

    public SanPham getIdSP() {
        return idSP;
    }

    public void setIdSP(SanPham idSP) {
        this.idSP = idSP;
    }

    public ChiTietSPCustom(UUID id, int namBH, String moTa, int soLuongTon, BigDecimal giaNhap) {
        this.id = id;
        this.namBH = namBH;
        this.moTa = moTa;
        this.giaNhap = giaNhap;
        this.soLuongTon = soLuongTon;
    }

    public ChiTietSPCustom(int namBH, String moTa, int soLuongTon, BigDecimal giaNhap) {
        this.namBH = namBH;
        this.moTa = moTa;
        this.giaNhap = giaNhap;
        this.soLuongTon = soLuongTon;
    }

    @Override
    public String toString() {
        return "QLChiTietSP{" + "id=" + id + ", giaBan=" + giaBan + ", giaNhap=" + giaNhap + ", moTa=" + moTa + ", namBH=" + namBH + ", soLuongTon=" + soLuongTon + ", idDongSP=" + idDongSP + ", idMauSac=" + idMauSac + ", idNsx=" + idNsx + ", idSP=" + idSP + '}';
    }

    public Object[] toRowData() {
        return new Object[]{id, giaBan, giaNhap, moTa, namBH, soLuongTon, idDongSP.getTen(), idMauSac.getTen(), idNsx.getTen(), idSP.getTen()};
    }

    public Object[] toRowData1() {
        return new Object[]{id, namBH, moTa, soLuongTon, giaNhap, soLuongTon > 900 ? "Nhiều sp" : "Ít sp"};
    }
}
