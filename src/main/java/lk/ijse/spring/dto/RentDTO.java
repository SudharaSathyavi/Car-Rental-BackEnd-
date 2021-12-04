package lk.ijse.spring.dto;

import java.util.Date;


public class RentDTO {
    private String Id;
    private Date date;
    private String time;
    private String Discription;
    private String status;

    private CustomerDTO customerDTO;
    private CarDTO carDTO;
    private RentPaymentDTO rentPaymentDTO;

    public RentDTO() {
    }

    public RentDTO(String id, Date date, String time, String discription, String status, CustomerDTO customerDTO, CarDTO carDTO, RentPaymentDTO rentPaymentDTO) {
        Id = id;
        this.date = date;
        this.time = time;
        Discription = discription;
        this.status = status;
        this.customerDTO = customerDTO;
        this.carDTO = carDTO;
        this.rentPaymentDTO = rentPaymentDTO;
    }

    @Override
    public String toString() {
        return "RentDTO{" +
                "Id='" + Id + '\'' +
                ", date=" + date +
                ", time='" + time + '\'' +
                ", Discription='" + Discription + '\'' +
                ", status='" + status + '\'' +
                ", customerDTO=" + customerDTO +
                ", carDTO=" + carDTO +
                ", rentPaymentDTO=" + rentPaymentDTO +
                '}';
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

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    public CarDTO getCarDTO() {
        return carDTO;
    }

    public void setCarDTO(CarDTO carDTO) {
        this.carDTO = carDTO;
    }

    public RentPaymentDTO getRentPaymentDTO() {
        return rentPaymentDTO;
    }

    public void setRentPaymentDTO(RentPaymentDTO rentPaymentDTO) {
        this.rentPaymentDTO = rentPaymentDTO;
    }
}