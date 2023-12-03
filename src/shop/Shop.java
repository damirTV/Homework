package shop;

import java.awt.*;
import java.util.Arrays;

//Создать класс Shop (магазин). У которого есть работники.
//Магазин умеет печатать своих работников:
//{Имя работника}: {возраст} лет, {мужчина или женщина}, список вещей: {набор вещей работника}
public class Shop {
    Worker[] workers;

    public Shop(Worker[] workers) {
        this.workers = workers;
    }

    public void listOfWorkers() { // Печать сотрудников магазина
        for (Worker worker : workers) {
            System.out.print(worker.name + ": " + worker.age + ", " +
                    worker.gender + ", список вещей: ");
            for (int i = 0; i < worker.items.length; i++) {
                System.out.print(worker.items[i].name);
                if (i != worker.items.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}

