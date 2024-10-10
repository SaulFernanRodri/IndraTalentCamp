package ejercicios.modulo4.company;

import java.util.ArrayList;

public class Order {
    private String orderId;
    private ArrayList<String> orderDetails;
    private Client client;

    public Order(String orderId, Client client) {
        this.orderId = orderId;
        this.orderDetails = new ArrayList<>();
        this.client = client;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ArrayList<String> getOrderDetails() {
        return orderDetails;
    }

    public void addOrderDetail(String detail) {
        this.orderDetails.add(detail);
    }

    public void removeOrderDetail(String detail) {
        this.orderDetails.remove(detail);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void displayOrderInfo() {
        System.out.println("Order Info:");
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Details:");
        for (String detail : orderDetails) {
            System.out.println(" - " + detail);
        }
        System.out.println("Client Info:");
        client.displayInfo();
    }
}
