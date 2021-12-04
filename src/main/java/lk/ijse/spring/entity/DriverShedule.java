package lk.ijse.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class DriverShedule {
    @Id
    private String id;
    private String status;
    private Date date;

    @OneToOne(mappedBy = "driverShedule")
    private Driver driver;

    @Override
    public String toString() {
        return "DriverShedule{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", date=" + date +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public DriverShedule() {
    }

    public DriverShedule(String id, String status, Date date) {
        this.id = id;
        this.status = status;
        this.date = date;
    }
}