public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
private double chieuCao;
    public HinhChuNhat(double chieuRong, double chieuDai, double chieuCao) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        this.chieuCao = chieuCao;
    }

    public double tinhDienTich() {
        double dienTich = chieuDai * chieuRong;
        return dienTich;
    }

    public double tinhChuVi() {
        double chuVi = (chieuDai + chieuRong) * 2;
        return chuVi;
    }
public double tinhTheTich(){
        double theTich = chieuDai * chieuRong * chieuCao;
        return theTich;
}
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat(7, 10, 8);
        double ketqua = hinhChuNhat.tinhDienTich();
        System.out.print(ketqua);
    }
}
