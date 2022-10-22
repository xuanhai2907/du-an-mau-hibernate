/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainModels;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "NhanVien")
@Setter
@Getter
public class NhanVien implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private UUID id;

    @Column(name = "Ma", length = 20)
    private String ma;

    @Column(name = "Ten", length = 30)
    private String ten;

    @Column(name = "TenDem", length = 30)
    private String tenDem;

    @Column(name = "Ho", length = 30)
    private String ho;

    @Column(name = "GioiTinh", length = 10)
    private String gioiTinh;

    @Column(name = "NgaySinh")
    private Date ngaySinh;

    @Column(name = "Sdt", length = 30)
    private String sdt;

    @Column(name = "MatKhau")
    private String matKhau;

    @Column(name = "DiaChi")
    private String diaChi;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdCH")
    private CuaHang idCH;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdCV")
    private ChucVu idCV;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdGuiBC")
    private NhanVien idGuiBC;

    @Column(name = "TrangThai")
    private int trangThai;

    public NhanVien(UUID id, String ma, String ten, String tenDem, String ho, String gioiTinh, Date ngaySinh, String sdt, String matKhau, String diaChi, CuaHang idCH, ChucVu idCV, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.tenDem = tenDem;
        this.ho = ho;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.matKhau = matKhau;
        this.diaChi = diaChi;
        this.idCH = idCH;
        this.idCV = idCV;
        this.trangThai = trangThai;
    }

    public NhanVien(String ma, String ten, String tenDem, String ho, String gioiTinh, Date ngaySinh, String sdt, String matKhau, String diaChi, CuaHang idCH, ChucVu idCV, int trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.tenDem = tenDem;
        this.ho = ho;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.matKhau = matKhau;
        this.diaChi = diaChi;
        this.idCH = idCH;
        this.idCV = idCV;
        this.trangThai = trangThai;
    }

    public NhanVien() {
    }

    public NhanVien(String ma, String ten, String tenDem, String ho, String gioiTinh, Date ngaySinh, String sdt, String matKhau, String diaChi, int trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.tenDem = tenDem;
        this.ho = ho;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.matKhau = matKhau;
        this.diaChi = diaChi;
        this.idCH = idCH;
        this.idCV = idCV;
        this.trangThai = trangThai;
    }

    public NhanVien(UUID id, String ma, String ten, String tenDem, String ho, String gioiTinh, Date ngaySinh, String sdt, String matKhau, String diaChi, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.tenDem = tenDem;
        this.ho = ho;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.matKhau = matKhau;
        this.diaChi = diaChi;
        this.idCH = idCH;
        this.idCV = idCV;
        this.trangThai = trangThai;
    }

}
