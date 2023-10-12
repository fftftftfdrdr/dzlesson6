package ru.geekbrains.lesson6.srp2;

import ru.geekbrains.lesson6.srp1.SquareV2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleInput {

    private final Order order;
    public ConsoleInput(Order order) {
        this.order = order;
    }

    public void ConsoleInput() {
        order.setClientName();
        order.setProduct();
        order.setQnt();
        order.setPrice();

    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
