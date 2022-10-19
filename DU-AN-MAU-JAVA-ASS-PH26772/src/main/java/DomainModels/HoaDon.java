/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@AllArgsConstructor
@Data
@Table(name = "HoaDon")
public class HoaDon implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private UUID id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdKH")
    private KhachHang idKH;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdNV")
    private NhanVien idNhanVien;

    @Column(name = "Ma", length = 20)
    private String ma;

    @Column(name = "NgayTao")
    private Date ngayTao;

    @Column(name = "NgayThanhToan")
    private Date ngayThanhToan;

    @Column(name = "NgayShip")
    private Date ngayShip;

    @Column(name = "NgayNhan")
    private Date ngayNhan;

    @Column(name = "TinhTang")
    private int tinhTrang;

    @Column(name = "TenNguoiNhan", length = 50)
    private String tenNguoiNhan;

    @Column(name = "DiaChi", length = 100)
    private String diaChhi;

    @Column(name = "Sdt", length = 30)
    private String sdt;

    @OneToMany(mappedBy = "idHoaDon", fetch = FetchType.LAZY)
    private List<HoaDonChiTiet> listHDCT;

    public HoaDon() {
    }

    public HoaDon(KhachHang idKH, NhanVien idNhanVien, String ma, Date ngayTao, Date ngayThanhToan, Date ngayShip, Date ngayNhan, int tinhTrang, String tenNguoiNhan, String diaChhi, String sdt) {
        this.idKH = idKH;
        this.idNhanVien = idNhanVien;
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayShip = ngayShip;
        this.ngayNhan = ngayNhan;
        this.tinhTrang = tinhTrang;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChhi = diaChhi;
        this.sdt = sdt;
    }

    public HoaDon(String ma, Date ngayTao, Date ngayThanhToan, Date ngayShip, Date ngayNhan, int tinhTrang, String tenNguoiNhan, String diaChhi, String sdt, KhachHang idKH, NhanVien idNhanVien) {
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayShip = ngayShip;
        this.ngayNhan = ngayNhan;
        this.tinhTrang = tinhTrang;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChhi = diaChhi;
        this.sdt = sdt;
        this.idKH = idKH;
        this.idNhanVien = idNhanVien;
    }

    public HoaDon(UUID id, String ma, Date ngayTao, Date ngayThanhToan, Date ngayShip, Date ngayNhan, int tinhTrang, String tenNguoiNhan, String diaChhi, String sdt) {
        this.id = id;
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayShip = ngayShip;
        this.ngayNhan = ngayNhan;
        this.tinhTrang = tinhTrang;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChhi = diaChhi;
        this.sdt = sdt;
    }

    public HoaDon(UUID id, String ma, Date ngayTao, Date ngayThanhToan, Date ngayShip, Date ngayNhan, int tinhTrang, String tenNguoiNhan, String diaChhi, String sdt, KhachHang idKH, NhanVien idNhanVien) {
        this.id = id;
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayShip = ngayShip;
        this.ngayNhan = ngayNhan;
        this.tinhTrang = tinhTrang;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChhi = diaChhi;
        this.sdt = sdt;
        this.idKH = idKH;
        this.idNhanVien = idNhanVien;
    }

    public HoaDon(String ma, String diaChi, String sdt, String tenNguoiNhan, java.sql.Date ngayNhan, java.sql.Date ngayShip, java.sql.Date ngayTao, java.sql.Date ngayThanhToan, int tinhTrang, KhachHang kh, NhanVien nv) {
        this.ma = ma;
        this.diaChhi = diaChi;
        this.sdt = sdt;
        this.tenNguoiNhan = tenNguoiNhan;
        this.ngayNhan = ngayNhan;
        this.ngayShip = ngayShip;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.tinhTrang = tinhTrang;
        this.idKH = kh;
        this.idNhanVien = nv;

    }

    public String getTinhTrangString() {
        return tinhTrang == 0 ? "Chưa thanh toán" : (tinhTrang == 1 ? "Đã hủy" : (tinhTrang == 2 ? "Đã thanh toán" : "Chịu"));
    }

}
