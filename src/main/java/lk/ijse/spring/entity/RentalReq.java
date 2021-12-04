package lk.ijse.spring.entity;

import javax.persistence.*;

@Entity
public class RentalReq {

    @Id
    private String rentalid;
    private String Payment;
    private String TimeRange;
    private String CarId;
    private String LDWPayemnt;
    private String Date;
    private String status;

    @OneToOne
    @JoinColumn(name = "Cusid", referencedColumnName = "id")
    private Customer customer;

    public RentalReq() {
    }

    public RentalReq(String rentalid, String payment, String timeRange, String carId, String LDWPayemnt, String date, String status, Customer customer) {
        this.rentalid = rentalid;
        Payment = payment;
        TimeRange = timeRange;
        CarId = carId;
        this.LDWPayemnt = LDWPayemnt;
        Date = date;
        this.status = status;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "RentalReq{" +
                "rentalid='" + rentalid + '\'' +
                ", Payment='" + Payment + '\'' +
                ", TimeRange='" + TimeRange + '\'' +
                ", CarId='" + CarId + '\'' +
                ", LDWPayemnt='" + LDWPayemnt + '\'' +
                ", Date='" + Date + '\'' +
                ", status='" + status + '\'' +
                ", customer=" + customer +
                '}';
    }

    public String getRentalid() {
        return rentalid;
    }

    public void setRentalid(String rentalid) {
        this.rentalid = rentalid;
    }

    public String getPayment() {
        return Payment;
    }

    public void setPayment(String payment) {
        Payment = payment;
    }

    public String getTimeRange() {
        return TimeRange;
    }

    public void setTimeRange(String timeRange) {
        TimeRange = timeRange;
    }

    public String getCarId() {
        return CarId;
    }

    public void setCarId(String carId) {
        CarId = carId;
    }

    public String getLDWPayemnt() {
        return LDWPayemnt;
    }

    public void setLDWPayemnt(String LDWPayemnt) {
        this.LDWPayemnt = LDWPayemnt;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}