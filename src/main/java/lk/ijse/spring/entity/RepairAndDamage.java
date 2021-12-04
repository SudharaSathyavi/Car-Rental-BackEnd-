package lk.ijse.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class RepairAndDamage {
    @Id
    private String Id;
    private Date Date;
    private Double Cost;
    private String Status;
    @OneToOne(mappedBy = "repairAndDamage")
    private HandOver handOver;

    public RepairAndDamage(String id, java.util.Date date, Double cost, String status) {
        Id = id;
        Date = date;
        Cost = cost;
        Status = status;
    }

    public RepairAndDamage() {
    }

    @Override
    public String toString() {
        return "RepairAndDamage{" +
                "Id='" + Id + '\'' +
                ", Date=" + Date +
                ", Cost=" + Cost +
                ", Status='" + Status + '\'' +
                '}';
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public Double getCost() {
        return Cost;
    }

    public void setCost(Double cost) {
        Cost = cost;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }


}
