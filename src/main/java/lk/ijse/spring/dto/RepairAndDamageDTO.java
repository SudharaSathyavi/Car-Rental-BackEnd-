package lk.ijse.spring.dto;

import java.util.Date;


public class RepairAndDamageDTO {

    private String Id;
    private Date Date;
    private Double Cost;
    private String Status;

    public RepairAndDamageDTO() {
    }

    public RepairAndDamageDTO(String id, java.util.Date date, Double cost, String status) {
        Id = id;
        Date = date;
        Cost = cost;
        Status = status;
    }

    @Override
    public String toString() {
        return "RepairAndDamageDTO{" +
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
