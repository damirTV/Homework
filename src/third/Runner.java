package third;

import java.util.Arrays;
import third.ex1.Birch;
import third.ex1.Fir;
import third.ex1.Pine;
import third.ex1.Tree;
import third.ex2.Iphone15;
import third.ex2.PhoneFabric;
import third.ex2.SamsungGalaxy;
import third.ex3.Pyramid1;
import third.ex4.Lottery;
import third.ex5.City;
import third.ex5.House;


public class Runner {
    public static void main(String[] args) {
        //В этом дз уже будет проверяться наличие корректных модификаторов доступа
        //у классов, атрибутов, методов
        System.out.println("Задание №1");
        ex1();
        System.out.println();
        System.out.println("Задание №2");
        ex2();
        System.out.println();
        System.out.println("Задание №3");
        ex3();
        System.out.println();
        System.out.println("Задание №4");
        ex4();
        System.out.println();
        System.out.println("Задание №5");
        ex5();
    }

    public static void ex1() {
        //Реализовать в Java следующую схему (в скобках свойства объектов)
        //У нас есть Дерево(возраст)
        //Деревья делятся на:
        //хвойные(имеют тип иголок)
        //лиственные(есть листья на дереве сейчас), умеют опадать (листья пропадают с дерева)
        //умеют цвести (листья появляются)
        //
        //Сосна и Ель являются хвойными.
        //Для сосны характерен тип иголок - крупный
        //Для ели характерен тип иголок - мелкий
        //
        //Береза является лиственным деревом.
        //Когда Береза цветет, помимо появления листьев, она источает аллергены (печать в консоль)
        //
        //Создать в методе ex1 сосну, березу, ель. Положить в массив.
        //Посчитать их средний возраст.

        Tree[] trees = new Tree[3];
        trees[0] = new Birch(1, true);
        trees[1] = new Pine(2);
        trees[2] = new Fir(1);
        double avgAge; // Средний возраст всех деревьев в массиве
        double sumAge = 0; // Сумма возрастов всех деревьев в массиве
        for (Tree element : trees) {
            sumAge = sumAge + element.getAge();
        }
        avgAge = sumAge / trees.length;
        System.out.println("Средний возраст всех деревьев: " + avgAge);
    }

    public static void ex2() {
        //Задача: Фабрика телефонов
        //Создать 2 типа телефонов и комплектующие к ним.
        //При печати телефона должны показываться все свойства телефона и вложенных объектов.
        //1 тип: Samsung galaxy. Имеет операционную систему Android, плату j-108(размер (ширина Х длина Х высота) 10х12х13),
        //камеру Samsung(20x zoom).
        //2 Тип: Iphone 15. Имеет операционную систему Ios, плату 7uik(размер 15х12х13),
        //камеру iphone(15x zoom, есть вспышка).
        //
        //Создать фабрику, которая заполняет созданный телефон деталями
        //При создании телефона в нем нет комплектующих, как будто пустой пластиковый каркас,
        //но при этом модель телефона уже есть.
        //
        //
        //На фабрике должно быть два публичных метода с одним названием:
        //один будет собирать iphone, второй будет собирать samsung.
        //В данном методе создать два телефона, собрать их, распечатать.

        PhoneFabric phoneFabric = new PhoneFabric();

        SamsungGalaxy samsungGalaxy = new SamsungGalaxy();
        phoneFabric.createPhone(samsungGalaxy);
        samsungGalaxy.printSpec();

        System.out.println();

        Iphone15 iphone15 = new Iphone15();
        phoneFabric.createPhone(iphone15);
        iphone15.printSpec();
    }

    public static void ex3() {
        //Задача: Пирамида наследования
        //Создать классы Pyramid1, Pyramid2, Pyramid3.
        //НЕОБХОДИМО НАСЛЕДОВАНИЕ С ИСПОЛЬЗОВАНИЕМ РОДИТЕЛЬСКИХ МЕТОДОВ!
        // Создать метод print, который будет выводить следующий текст:
        // M <- из Pyramid1
        // MM <- из Pyramid2
        // MMM <- из Pyramid3

        //Т.е. при вызове pyramid1.print выведется:
        // M
        // MM
        // MMM

        //при вызове pyramid2.print выведется:
        // MM
        // MMM

        //при вызове pyramid3.print выведется:
        // MMM

        //создать здесь pyramid1 и вызвать print
        Pyramid1 pyramid1 = new Pyramid1();
        pyramid1.print();
    }

    public static void ex4() {
        //Задача со звездочкой!: Лотерейный билет
        //Создать класс лотерейный билет (у объекта не может быть атрибутов)
        //создать метод проверить удачу (не принимает в себя аргументов!):
        //каждый десятый билет дает 100 руб.
        //каждый сотый - 5_000,
        //иначе 0
        //Если совпало что билет одновременно десятый и сотый выбор в пользу сотого.
        //
        //Создать здесь 110 билетов, и проверить по каждому удачу.
        //Итоговая сумма выигрыша после проверки удачи 110 билетов должна составить 6_000.

        int prize = 0; // Размер выигрыша
        int ticketQty = 110; // Количество билетов

        for (int i = 1; i <= ticketQty; i++) {
            Lottery lottery = new Lottery();
            prize = prize + lottery.checkTicket();
        }

        System.out.println("Количество билетов: " + ticketQty);
        System.out.println("Итоговая сумма выигрыша: " + prize);
    }

    public static void ex5() {
        //Задача со звездочкой: иммутабельность города.
        //Иммутабельность - невозможность поменять свойства объекта и всех его вложенных объектов.
        //
        //Создать класс House (наименование улицы, номер дома) - создать сеттеры! и геттеры на него.
        //Переопределить вывод в текст - вывод улицы и номера дома
        //Создать иммутабельный класс City (наименование города, и массив домов).
        //Переопределить вывод в текст - чтобы выводило имя города, и все дома
        //
        //Создать два дома, создать город с массивом созданных домов
        //При получении домов из массива, и изменении данных (например замена улицы) у дома,
        //у домов внутри city ничего не поменяется. Т.е. при вызове toString, будут старые имена улицы
        House house1 = new House("Yashmak", 12);
        System.out.println("Создан дом-1: " + house1);
        House house2 = new House("Spillover", 22);
        System.out.println("Создан дом-2: " + house2);

        City city1 = new City("Kazan", new House[]{house1, house2});
        System.out.println("Создан город: " + city1);

        house1.setStreet("NewStreet");
        System.out.println("Новый адрес дом-1: " + house1);
        System.out.println("Адреса домов в городе: " + Arrays.toString(city1.getHouses()));
    }
}