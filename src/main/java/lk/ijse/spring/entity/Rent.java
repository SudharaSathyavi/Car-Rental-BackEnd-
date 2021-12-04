package lk.ijse.spring.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Rent {
    @Id
    private String Id;
    private Date date;
    private String time;
    private String Discription;
    private String status;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Cusid", referencedColumnName = "id")
    private Customer customer1;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "carId", referencedColumnName = "id")
    private Car car;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rpid", referencedColumnName = "PID")
    private RentPayment rentPayment;

    public Rent() {
    }

    public Rent(String id, Date date, String time, String discription, String status, Customer customer1, Car car, RentPayment rentPayment) {
        Id = id;
        this.date = date;
        this.time = time;
        Discription = discription;
        this.status = status;
        this.customer1 = customer1;
        this.car = car;
        this.rentPayment = rentPayment;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDiscription() {
        return Discription;
    }

    public void setDiscription(String discription) {
        Discription = discription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer1() {
        return customer1;
    }

    public void setCustomer1(Customer customer1) {
        this.customer1 = customer1;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public RentPayment getRentPayment() {
        return rentPayment;
    }

    public void setRentPayment(RentPayment rentPayment) {
        this.rentPayment = rentPayment;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "Id='" + Id + '\'' +
                ", date=" + date +
                ", time='" + time + '\'' +
                ", Discription='" + Discription + '\'' +
                ", status='" + status + '\'' +
                ", customer1=" + customer1 +
                ", car=" + car +
                ", rentPayment=" + rentPayment +
                '}';
    }
}