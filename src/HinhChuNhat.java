public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuRong, double chieuDai) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhDienTich() {
        double dienTich = chieuDai * chieuRong;
        return dienTich;
    }

    public double tinhChuVi() {
        double chuVi = (chieuDai + chieuRong) * 2;
        return chuVi;
    }

    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat(7, 8);
        double ketqua = hinhChuNhat.tinhDienTich();
        System.out.print(ketqua);
    }
}
