package customModels;

import java.util.Date;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ViewModelsHoaDon {

    private UUID id;
    private String maHoaDon;
    private Date ngayTao;
    private String tenNhanVien;
    private int tinhTrang;

    public String getTinhTrangString() {
        return tinhTrang == 0 ? "Chưa thanh toán" : (tinhTrang == 1 ? "Đã hủy" : (tinhTrang == 2 ? "Đã thanh toán" : "Chịu"));
    }
}
