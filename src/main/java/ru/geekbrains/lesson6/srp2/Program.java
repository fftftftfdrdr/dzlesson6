package ru.geekbrains.lesson6.srp2;

import ru.geekbrains.lesson6.srp1.SquareDrawer;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        SaveToJson stg = new SaveToJson(order);
        ConsoleInput cimput = new ConsoleInput(order);
        cimput.ConsoleInput();
        stg.saveToJson();
        System.out.println("Заказ сохранен в файл order.json");

    }

}
