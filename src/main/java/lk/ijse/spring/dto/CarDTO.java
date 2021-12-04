package lk.ijse.spring.dto;


public class CarDTO {

    private String id;
    private String model;
    private String type;
    private String fule;
    private String freemileage;
    private String regno;
    private String noOfPassengers;
    private String colour;
    private String formonth;
    private String forday;
    private CarSheduleDTO carSheduleDTO;

    public CarDTO() {
    }

    public CarDTO(String id, String model, String type, String fule, String freemileage, String regno, String noOfPassengers, String colour, String formonth, String forday, CarSheduleDTO carSheduleDTO) {
        this.id = id;
        this.model = model;
        this.type = type;
        this.fule = fule;
        this.freemileage = freemileage;
        this.regno = regno;
        this.noOfPassengers = noOfPassengers;
        this.colour = colour;
        this.formonth = formonth;
        this.forday = forday;
        this.carSheduleDTO = carSheduleDTO;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", fule='" + fule + '\'' +
                ", freemileage='" + freemileage + '\'' +
                ", regno='" + regno + '\'' +
                ", noOfPassengers='" + noOfPassengers + '\'' +
                ", colour='" + colour + '\'' +
                ", formonth='" + formonth + '\'' +
                ", forday='" + forday + '\'' +
                ", carSheduleDTO=" + carSheduleDTO +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFule() {
        return fule;
    }

    public void setFule(String fule) {
        this.fule = fule;
    }

    public String getFreemileage() {
        return freemileage;
    }

    public void setFreemileage(String freemileage) {
        this.freemileage = freemileage;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(String noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFormonth() {
        return formonth;
    }

    public void setFormonth(String formonth) {
        this.formonth = formonth;
    }

    public String getForday() {
        return forday;
    }

    public void setForday(String forday) {
        this.forday = forday;
    }

    public CarSheduleDTO getCarSheduleDTO() {
        return carSheduleDTO;
    }

    public void setCarSheduleDTO(CarSheduleDTO carSheduleDTO) {
        this.carSheduleDTO = carSheduleDTO;
    }
}