package ViewModels;

import DomainModels.ChucVu;
import DomainModels.CuaHang;
import java.sql.Date;
import java.util.UUID;

public class QLNhanVien {

    private UUID id;
    private String ma;
    private String ten;
    private String tenDem;
    private String ho;
    private String gioiTinh;
    private Date ngaySinh;
    private String sdt;
    private String matkhau;
    private String diaChi;
    private CuaHang idCH;
    private ChucVu idCV;
    private int trangThai;

    public QLNhanVien() {
    }

    public QLNhanVien(UUID id, String ma, String ten, String tenDem, String ho, String gioiTinh, Date ngaySinh, String sdt, String matkhau, String diaChi, CuaHang idCH, ChucVu idCV, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.tenDem = tenDem;
        this.ho = ho;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.matkhau = matkhau;
        this.diaChi = diaChi;
        this.idCH = idCH;
        this.idCV = idCV;
        this.trangThai = trangThai;
    }

    public QLNhanVien(String ma, String ten, String tenDem, String ho, String gioiTinh, Date ngaySinh, String sdt, String matkhau, String diaChi, CuaHang idCH, ChucVu idCV, int trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.tenDem = tenDem;
        this.ho = ho;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.matkhau = matkhau;
        this.diaChi = diaChi;
        this.idCH = idCH;
        this.idCV = idCV;
        this.trangThai = trangThai;
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

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public CuaHang getIdCH() {
        return idCH;
    }

    public void setIdCH(CuaHang idCH) {
        this.idCH = idCH;
    }

    public ChucVu getIdCV() {
        return idCV;
    }

    public void setIdCV(ChucVu idCV) {
        this.idCV = idCV;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "QLNhanVien{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", tenDem=" + tenDem + ", ho=" + ho + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", sdt=" + sdt + ", matkhau=" + matkhau + ", diaChi=" + diaChi + ", idCH=" + idCH + ", idCV=" + idCV + ", trangThai=" + trangThai + '}';
    }

    public Object[] toRowData() {
        return new Object[]{id, ma, ho + " " + tenDem + " " + ten, gioiTinh, ngaySinh, sdt, diaChi, matkhau, idCH.getTen(), idCV.getTen(), (trangThai == 1 ? "Hoạt động" : "Nghỉ")};
    }
}
