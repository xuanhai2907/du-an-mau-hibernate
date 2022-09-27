/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author vinhnv
 */
@Entity
@Data
@Table(name = "GioHangChiTiet")
@IdClass(GioHangChiTietId.class)
public class GioHangChiTiet implements Serializable {
    
    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdGioHang", insertable = false, updatable = false)
    private GioHang idGioHang;
    
    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdChiTietSP",insertable=false, updatable=false)
    private ChiTietSP idChiTietSP;

    @Column(name = "SoLuong")
    private int soLuong;

    @Column(name = "DonGia")
    private BigDecimal donGia;

    @Column(name = "DonGiaKhiGiam")
    private BigDecimal donGiaKhiGiam;
}
