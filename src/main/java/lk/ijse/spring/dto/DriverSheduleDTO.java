package lk.ijse.spring.dto;

import java.util.Date;

public class DriverSheduleDTO {
    private String id;
    private String carid;
    private String status;
    private Date date;

    @Override
    public String toString() {
        return "DriverSheduleDTO{" +
                "id='" + id + '\'' +
                ", carid='" + carid + '\'' +
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

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
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

    public DriverSheduleDTO() {
    }

    public DriverSheduleDTO(String id, String carid, String status, Date date) {
        this.id = id;
        this.carid = carid;
        this.status = status;
        this.date = date;
    }
}
