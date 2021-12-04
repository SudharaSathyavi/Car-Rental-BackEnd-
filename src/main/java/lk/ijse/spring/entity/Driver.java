package lk.ijse.spring.entity;

import javax.persistence.*;

@Entity
public class Driver {
    @Id
    private String id;
    private String name;
    private String address;
    private double salary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Dsid", referencedColumnName = "id")
    private DriverShedule driverShedule;

    public Driver() {
    }

    public Driver(String id, String name, String address, double salary, DriverShedule driverShedule) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.driverShedule = driverShedule;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", driverShedule=" + driverShedule +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public DriverShedule getDriverShedule() {
        return driverShedule;
    }

    public void setDriverShedule(DriverShedule driverShedule) {
        this.driverShedule = driverShedule;
    }
}