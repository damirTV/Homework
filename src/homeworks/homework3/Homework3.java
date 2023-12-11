package homeworks.homework3;

public class Homework3 {
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
        trees[0] = new Tree.Birch(1, true);
        trees[1] = new Tree.Pine(2);
        trees[2] = new Tree.Fir(1);
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
        Pyramid3.Pyramid1 pyramid1 = new Pyramid3.Pyramid1();
        pyramid1.print();
    }
}
