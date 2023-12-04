package shop;
//Создать класс Runner. В классе Runner:
//Создать 4 вещи: молот (1000гр), отвертка(50гр), тетрадь(30гр), ручка(10гр)
//Создать 2 работников:
//-Василий,30 лет, мужчина, обладатель молота и отвертки.
//-Марьяна,25 лет, женщина, обладательница тетради и ручки.
//Создать магазин с работниками выше.
//Вызвать у магазина печать.
//Вызвать у каждого работника магазина хвастовство его вещами (достать работника из магазина).

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        //Создать 4 вещи: молот (1000гр), отвертка(50гр), тетрадь(30гр), ручка(10гр)
        Item[] items1 = new Item[2];
        items1[0] = new Item("Молот", 1000);
        items1[1] = new Item("Отвертка", 50);
        Item[] items2 = new Item[2];
        items2[0] = new Item("Тетрадь", 30);
        items2[1] = new Item("Ручка", 10);
        //Создать 2 работников:
        //-Василий,30 лет, мужчина, обладатель молота и отвертки.
        //-Марьяна,25 лет, женщина, обладательница тетради и ручки.
        Worker[] workers = new Worker[2];
        workers[0] = new Worker("Василий", 30, 'М', items1);
        workers[1] = new Worker("Марьяна", 25, 'Ж', items2);
        Shop shop = new Shop(workers);
        shop.listOfWorkers();
        for (Worker worker : workers) {
            worker.workerSay(worker.name);
        }
    }
}


