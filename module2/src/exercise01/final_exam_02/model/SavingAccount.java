package exercise01.final_exam_02.model;

public class SavingAccount extends Account{
    private double soTienGui;
    private String ngayGui;
    private double laiXuat;
    private int kiHan;

    public SavingAccount() {
    }

    public SavingAccount(double soTienGui, String ngayGui, double laiXuat, int kiHan) {
        this.soTienGui = soTienGui;
        this.ngayGui = ngayGui;
        this.laiXuat = laiXuat;
        this.kiHan = kiHan;
    }

    public SavingAccount(int id, String code, String name, String date, double soTienGui, String ngayGui, double laiXuat, int kiHan) {
        super(id, code, name, date);
        this.soTienGui = soTienGui;
        this.ngayGui = ngayGui;
        this.laiXuat = laiXuat;
        this.kiHan = kiHan;
    }

    public double getSoTienGui() {
        return soTienGui;
    }

    public void setSoTienGui(double soTienGui) {
        this.soTienGui = soTienGui;
    }

    public String getNgayGui() {
        return ngayGui;
    }

    public void setNgayGui(String ngayGui) {
        this.ngayGui = ngayGui;
    }

    public double getLaiXuat() {
        return laiXuat;
    }

    public void setLaiXuat(double laiXuat) {
        this.laiXuat = laiXuat;
    }

    public int getKiHan() {
        return kiHan;
    }

    public void setKiHan(int kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return super.toString() + "," + soTienGui +"," + ngayGui + "," + laiXuat +"," + kiHan;
    }

//    @Override
//    public String toString() {
//        return super.toString() + "SavingAccount{" +
//                "soTienGui=" + soTienGui +
//                ", ngayGui='" + ngayGui + '\'' +
//                ", laiXuat=" + laiXuat +
//                ", kiHan=" + kiHan +
//                '}';
//    }
}
