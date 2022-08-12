package exercise01.final_exam_02.model;

public class PaymentAccount extends Account{
    private String soThe;
    private double soTien;

    public PaymentAccount() {
    }

    public PaymentAccount(String soThe, double soTien) {
        this.soThe = soThe;
        this.soTien = soTien;
    }

    public PaymentAccount(int id, String code, String name, String date, String soThe, double soTien) {
        super(id, code, name, date);
        this.soThe = soThe;
        this.soTien = soTien;
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    @Override
    public String toString() {
        return super.toString() + "," + soThe + "," + soTien;
    }

//    @Override
//    public String toString() {
//        return super.toString() + "PaymentAccount{" +
//                "soThe='" + soThe + '\'' +
//                ", soTien=" + soTien +
//                '}';
//    }
}
