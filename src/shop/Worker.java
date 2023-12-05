package shop;

//Создать класс Worker (работник). У работника есть: имя, возраст, пол(М/Ж), набор вещей.
//Работник умеет хвастаться своими вещами: брать по очереди вещь, и кричать:
//{Имя работника}: смотрите какая у меня вещь - {имя вещи}.

public class Worker {
    public String name; // Публичное имя для использования в других пакетах
    int age;
    char gender;
    Item[] items;

    public Worker(String name, int age, char gender, Item[] items) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.items = items;
    }

    public void workerSay(String name) {
        for (Item item : items) {
            System.out.println(name + ": смотрите какая у меня вещь - " + item.name + ".");
        }
    }
}
