/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serializable;
import java.math.BigDecimal;
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
import lombok.Data;

@Entity
@Data
@Table(name = "ChiTietSP")
public class ChiTietSP implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Id", columnDefinition = "uniqueidentifier")
    private UUID id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdSP", nullable = false)
    private SanPham idSP;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdNsx", nullable = false)
    private NSX idNsx;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdMauSac", nullable = false)
    private MauSac idMauSac;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdDongSP", nullable = false)
    private DongSP idDongSP;

    @Column(name = "NamBH")
    private int namBH;

    @Column(name = "Mota", length = 50)
    private String moTa;

    @Column(name = "SoLuongTon")
    private int soLuongTon;

    @Column(name = "GiaNhap")
    private BigDecimal giaNhap;

    @Column(name = "GiaBan")
    private BigDecimal giaBan;

    @OneToMany(mappedBy = "idChiTietSP", fetch = FetchType.LAZY)
    private List<GioHangChiTiet> listGHCT;

    @OneToMany(mappedBy = "idChiTietSP", fetch = FetchType.LAZY)
    private List<HoaDonChiTiet> listHDCT;

    public ChiTietSP(String moTa) {
        this.moTa = moTa;
    }

    public ChiTietSP() {
    }

    public ChiTietSP(UUID id, SanPham idSP, NSX idNsx, MauSac idMauSac, DongSP idDongSP, int namBH, String moTa, int soLuongTon, BigDecimal giaNhap, BigDecimal giaBan) {
        this.id = id;
        this.idSP = idSP;
        this.idNsx = idNsx;
        this.idMauSac = idMauSac;
        this.idDongSP = idDongSP;
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public ChiTietSP(BigDecimal giaBan, BigDecimal giaNhap, String moTa, int namBH, int soLuongTon, DongSP idDongSP, MauSac idMauSac, NSX idNsx, SanPham idSP) {
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

    public Object[] toRowData() {
        return new Object[]{id, giaBan, giaNhap, moTa, namBH, soLuongTon, idDongSP.getTen(), idMauSac.getTen(), idNsx.getTen(), idSP.getTen()};
    }

}
