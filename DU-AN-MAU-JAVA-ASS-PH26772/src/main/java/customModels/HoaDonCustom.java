package customModels;

import domainModels.KhachHang;
import domainModels.NhanVien;
import services.HoaDonService;
import java.sql.Date;
import java.util.UUID;

public class HoaDonCustom {

    private UUID id;
    private String ma;
    private String diaChi;
    private String sdt;
    private String tenNguoiNhan;
    private Date ngayNhan;
    private Date ngayShip;
    private Date ngayTao;
    private Date ngayThanhToan;
    private int tinhTrang;
    private KhachHang idKH;
    private NhanVien idNV;

    public HoaDonCustom() {
    }

    public HoaDonCustom(UUID id, String ma, String diaChi, String sdt, String tenNguoiNhan, Date ngayNhan, Date ngayShip, Date ngayTao, Date ngayThanhToan, int tinhTrang, KhachHang idKH, NhanVien idNV) {
        this.id = id;
        this.ma = ma;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.tenNguoiNhan = tenNguoiNhan;
        this.ngayNhan = ngayNhan;
        this.ngayShip = ngayShip;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.tinhTrang = tinhTrang;
        this.idKH = idKH;
        this.idNV = idNV;
    }

    public HoaDonCustom(String ma, String diaChi, String sdt, String tenNguoiNhan, Date ngayNhan, Date ngayShip, Date ngayTao, Date ngayThanhToan, int tinhTrang, KhachHang idKH, NhanVien idNV) {
        this.ma = ma;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.tenNguoiNhan = tenNguoiNhan;
        this.ngayNhan = ngayNhan;
        this.ngayShip = ngayShip;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.tinhTrang = tinhTrang;
        this.idKH = idKH;
        this.idNV = idNV;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTenNguoiNhan() {
        return tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
    }

    public Date getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(Date ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public Date getNgayShip() {
        return ngayShip;
    }

    public void setNgayShip(Date ngayShip) {
        this.ngayShip = ngayShip;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public KhachHang getIdKH() {
        return idKH;
    }

    public void setIdKH(KhachHang idKH) {
        this.idKH = idKH;
    }

    public NhanVien getIdNV() {
        return idNV;
    }

    public void setIdNV(NhanVien idNV) {
        this.idNV = idNV;
    }

    @Override
    public String toString() {
        return "QLHoaDon{" + "id=" + id + ", ma=" + ma + ", diaChi=" + diaChi + ", sdt=" + sdt + ", tenNguoiNhan=" + tenNguoiNhan + ", ngayNhan=" + ngayNhan + ", ngayShip=" + ngayShip + ", ngayTao=" + ngayTao + ", ngayThanhToan=" + ngayThanhToan + ", tinhTrang=" + tinhTrang + ", idKH=" + idKH + ", idNV=" + idNV + '}';
    }

    public Object[] toRowData() {
        return new Object[]{id, ma, diaChi, sdt, tenNguoiNhan, ngayNhan, ngayShip, ngayTao, ngayThanhToan, tinhTrang, idKH.getTen(), idNV.getTen()};
    }

}
