package lk.ijse.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class FinalPayment {
    @Id
    private String fid;
    private String date;
    private double payment;

    @OneToOne(mappedBy = "finalPayment")
    private HandOver handOver;

    public FinalPayment() {
    }

    public FinalPayment(String fid, String date, double payment) {
        this.fid = fid;
        this.date = date;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "FinalPayment{" +
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