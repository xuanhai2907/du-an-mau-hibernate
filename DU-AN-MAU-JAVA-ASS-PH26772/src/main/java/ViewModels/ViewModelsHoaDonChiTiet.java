/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import static Utilities.XDate.formatter;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author window
 */
@Getter
@Setter
@Builder
public class ViewModelsHoaDonChiTiet {

    private String ma;
    private Date ngayTao;
    private String ten;
    private int soLuong;
    private BigDecimal donGia;
    private UUID idHoaDon;
    private UUID idChiTietSP;

    public BigDecimal getThanhTien() {
        return donGia.multiply(BigDecimal.valueOf(soLuong));
    }

    public String getTongTien(int a, BigDecimal b) {
        return formatter.format(a * b.doubleValue());
    }

    public ViewModelsHoaDonChiTiet(String ma, Date ngayTao, String ten, int soLuong, UUID idHoaDon, UUID idChiTietSP) {
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.ten = ten;
        this.soLuong = soLuong;
        this.idHoaDon = idHoaDon;
        this.idChiTietSP = idChiTietSP;
    }

    public ViewModelsHoaDonChiTiet(String ma, Date ngayTao, String ten, int soLuong, BigDecimal donGia, UUID idHoaDon, UUID idChiTietSP) {
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.idHoaDon = idHoaDon;
        this.idChiTietSP = idChiTietSP;
    }

    public ViewModelsHoaDonChiTiet(String ma, String ten, int soLuong, BigDecimal donGia, UUID idHoaDon, UUID idChiTietSP) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.idHoaDon = idHoaDon;
        this.idChiTietSP = idChiTietSP;
    }
    
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getDonGia() {
        return donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }

    public UUID getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(UUID idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public UUID getIdChiTietSP() {
        return idChiTietSP;
    }

    public void setIdChiTietSP(UUID idChiTietSP) {
        this.idChiTietSP = idChiTietSP;
    }
    
    
    

    
}
