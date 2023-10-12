package ru.geekbrains.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {
    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }
    public String getProduct() {
        return product;
    }
    public int getQnt() {
        return qnt;
    }
    public double getPrice() {
        return price;
    }


    public void setClientName() {
        this.clientName = prompt("Client name: ");
    }

    public void setProduct() {
        this.product = prompt("Product: ");
    }

    public void setQnt() {
        this.qnt = Integer.parseInt(prompt("Quantity: "));
    }

    public void setPrice() {
        this.price = Integer.parseInt(prompt("Price: "));
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
