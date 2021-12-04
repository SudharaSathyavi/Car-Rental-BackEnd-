package lk.ijse.spring.dto;

public class FinalPaymentDTO {

    private String fid;
    private String date;
    private double payment;

    public FinalPaymentDTO() {
    }

    public FinalPaymentDTO(String fid, String date, double payment) {
        this.fid = fid;
        this.date = date;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "FinalPaymentDTO{" +
                "fid='" + fid + '\'' +
                ", date='" + date + '\'' +
                ", payment=" + payment +
                '}';
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
}