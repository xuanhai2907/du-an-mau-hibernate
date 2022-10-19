package ViewModels;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.UUID;

public class ViewModelsChiTietSanPham {

    private DecimalFormat formatter = new DecimalFormat("###,###,##0");

    private UUID id;
    private String ma;
    private String ten;
    private int namBh;
    private String moTa;
    private int slSp;
    private BigDecimal giaNhap;
    private BigDecimal giaBan;

    public ViewModelsChiTietSanPham(UUID id, String ma, String ten, int namBh, String moTa, int slSp, BigDecimal giaNhap, BigDecimal giaBan) {
        this.id  = id;
        this.ma = ma;
        this.ten = ten;
        this.namBh = namBh;
        this.moTa = moTa;
        this.slSp = slSp;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ViewModelsChiTietSanPham() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamBh() {
        return namBh;
    }

    public void setNamBh(int namBh) {
        this.namBh = namBh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSlSp() {
        return slSp;
    }

    public void setSlSp(int slSp) {
        this.slSp = slSp;
    }

    public BigDecimal getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(BigDecimal giaNhap) {
        this.giaNhap = giaNhap;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }

    public String getTongTien(int a, BigDecimal b) {
        return formatter.format(a * b.doubleValue());
    }
   
}
