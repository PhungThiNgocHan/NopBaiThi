package model;

/**
 *
 * Họ tên sinh viên: Phùng Thị Ngọc Hân
 */
public class KhachHang {
    private String maso;
    private String hoten;
    private int sonhankhau;
    private double chisocu;
    private double chisomoi;            

    //constructor
    public KhachHang() {
    }

    public KhachHang(String maso) {
        this.maso = maso;
    }

    public KhachHang(String maso, String hoten, int sonhankhau, double chisocu, double chisomoi) {
        this.maso = maso;
        this.hoten = hoten;
        this.sonhankhau = sonhankhau;
        this.chisocu = chisocu;
        this.chisomoi = chisomoi;
    }

    //setter và getter

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getSonhankhau() {
        return sonhankhau;
    }

    public void setSonhankhau(int sonhankhau) {
        this.sonhankhau = sonhankhau;
    }

    public double getChisocu() {
        return chisocu;
    }

    public void setChisocu(double chisocu) {
        this.chisocu = chisocu;
    }

    public double getChisomoi() {
        return chisomoi;
    }

    public void setChisomoi(double chisomoi) {
        this.chisomoi = chisomoi;
    }

     
    
    //phương thức tính toán    

    public double getTieuThu()
    {
      return chisomoi - chisocu;
    }
    
    public double getDinhMuc()
    {
       return sonhankhau *4;
    }
    
    
    public double tinhTienTra()
    {
       double tieuThu = getTieuThu();
       double dinhMuc = getDinhMuc();
       double giaDinhMuc = 6700;
       double giaVuot1 = 12900;
       double giaVuot2 = 14400;
       
       double giaBan;
       
       if (tieuThu <= dinhMuc){
           giaBan = tieuThu * giaDinhMuc;          
       } else {
           double vuotDinhMuc = tieuThu - dinhMuc;
           double tienTrongDinhMuc = dinhMuc * giaDinhMuc;
           
           if (vuotDinhMuc <= 2) {
               return tienTrongDinhMuc + (vuotDinhMuc * giaVuot1);
           } else {
               giaBan = tienTrongDinhMuc + (2 * giaVuot1) +((vuotDinhMuc - 2) * giaVuot2);
           }
       }
       double thueGTGT = 0.05 * giaBan;
       double phiTDVTN = 0.25 * giaBan;
       double thueTDVTN = 0.08 * phiTDVTN;
       
       return giaBan + thueGTGT + phiTDVTN + thueTDVTN;
    }         
}
