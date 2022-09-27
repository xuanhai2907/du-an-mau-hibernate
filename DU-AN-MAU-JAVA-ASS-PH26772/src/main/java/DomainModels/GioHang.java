/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serializable;
import java.sql.Date;
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
@Table(name = "GioHang")
public class GioHang implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private UUID id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdKH", insertable = false, updatable = false)
    private KhachHang idKH;

    @Column(name = "idNV")
    private NhanVien idNV;

    @Column(name = "Ma", length = 20)
    private String ma;

    @Column(name = "NgayTao")
    private Date ngayTao;

    @Column(name = "NgayThanhToan")
    private Date ngayThanhToan;

    @Column(name = "TenNguoiNhan", length = 50)
    private String tenNguoiNhan;

    @Column(name = "DiaChi", length = 100)
    private String diaChhi;

    @Column(name = "Sdt", length = 30)
    private String sdt;

    @Column(name = "TinhTrang")
    private int tinhTrang;

    @OneToMany(mappedBy = "idGioHang", fetch = FetchType.LAZY)
    private List<GioHangChiTiet> listGHCT;
}
