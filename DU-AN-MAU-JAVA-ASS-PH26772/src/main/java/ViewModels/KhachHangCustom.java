/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author window
 */
public class KhachHangCustom {
    public String ma;
    public String ten;
    public String dem;
    public String ho;
    public String diaChi;

    public KhachHangCustom(String ma, String ten, String dem, String ho, String diaChi) {
        this.ma = ma;
        this.ten = ten;
        this.dem = dem;
        this.ho = ho;
        this.diaChi = diaChi;
    }

    public KhachHangCustom() {
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

    public String getDem() {
        return dem;
    }

    public void setDem(String dem) {
        this.dem = dem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public String fullName(){
        return this.dem + "" + this.ten + "" + this.ho;
    }
}
