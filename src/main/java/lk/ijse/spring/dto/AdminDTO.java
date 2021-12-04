package lk.ijse.spring.dto;

public class AdminDTO {
    private String id;
    private String name;
    private String Password;

    public AdminDTO() {
    }

    public AdminDTO(String id, String name, String password) {
        this.id = id;
        this.name = name;
        Password = password;
    }

    @Override
    public String toString() {
        return "AdminDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Password='" + Password + '\'' +
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

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}