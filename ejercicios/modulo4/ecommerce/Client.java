package ejercicios.modulo4.ecommerce;

public class Client {
    private String name;
    private String direction;
    private String telephone;

    public Client (String name, String direction, String telephone) {
        this.name = name;
        this.direction = direction;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
