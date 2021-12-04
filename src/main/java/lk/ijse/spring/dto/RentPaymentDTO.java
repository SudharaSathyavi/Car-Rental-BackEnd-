package lk.ijse.spring.dto;

public class RentPaymentDTO {

    private String PID;
    private String date;
    private String payment;

    @Override
    public String toString() {
        return "RentPaymentDTO{" +
                "PID='" + PID + '\'' +
                ", date='" + date + '\'' +
                ", payment='" + payment + '\'' +
                '}';
    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public RentPaymentDTO() {
    }

    public RentPaymentDTO(String PID, String date, String payment) {
        this.PID = PID;
        this.date = date;
        this.payment = payment;
    }
}
