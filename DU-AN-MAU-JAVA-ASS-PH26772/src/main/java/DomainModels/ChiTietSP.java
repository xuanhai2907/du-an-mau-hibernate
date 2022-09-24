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

/**
 *
 * @author vinhnv
 */
@Entity
@Data
@Table(name = "ChiTietSP")
public class ChiTietSP implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private UUID id;

    @ManyToOne(fetch = FetchType.EAGER )
    @JoinColumn(name = "id" ,insertable=false, updatable=false)
    private SanPham idSP;  
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id",insertable=false, updatable=false)
    private NSX idNsx;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id",insertable=false, updatable=false)
    private MauSac idMauSac;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id",insertable=false, updatable=false)
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

    @OneToMany(mappedBy = "chiTietSP",  fetch = FetchType.LAZY)
    private List<GioHangChiTiet> listGHCT;
    
    @OneToMany(mappedBy = "chiTietSP", fetch = FetchType.LAZY)
    private List<HoaDonChiTiet> listHDCT;
    

}
