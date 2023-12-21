package four;

import four.ex1.Bus;
import four.ex1.Car;
import four.ex1.Vehicle;
import four.ex1.Wash;
import four.ex2.Duck;
import four.ex2.FlyException;
import four.ex2.Flyable;
import four.ex2.Plane;
import four.ex3.Bird;
import four.ex3.Builder;
import four.ex3.Driver;
import four.ex3.Human;
import four.ex3.Sound;
import four.ex4.ChatException;
import four.ex4.Inbox;
import four.ex4.Outbox;
import four.ex4.User;
import java.util.Objects;
import java.util.Scanner;

public class Homework4 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m"; // Красный цвет для ошибок
    public static User[] user = new User[100]; // Для 4-го задания массив всех пользователей
    static int id = 1; // Для 4-го задания id пользователя
    static int idInbox = 0; // Для 4-го задания id входящего сообщения
    static int idOutbox = 0; // Для 4-го задания id исходящего сообщения
    public static Inbox[] inbox = new Inbox[100]; // Для 4-го задания массив входящих сообщений
    public static Outbox[] outbox = new Outbox[100]; // Для 4-го задания массив исходящих сообщений

    public static void main(String[] args) {
        System.out.println();
        ex1();

        System.out.println();
        ex2();

        System.out.println();
        ex3();

        System.out.println();
        ex4();
    }

    public static void ex1() {
        //Создать легковую машину (атрибуты: чистая/грязная, размеры(ширина,высота,длина), наличие круиз контроля)
        //Создать автобус (атрибуты: чистый/грязный, размеры(ширина,высота,длина), макс количество пассажиров)
        //Создать автомойку
        //Автомойка умеет мыть машину. Делает машину чистой. Возвращает стоимость помывки.
        //Автомойка умеет мыть машины. Делает машины чистыми. Возвращает стоимость помывки за все машины.
        //Категории автомобилей:
        //если длина > 6 или высота > 2.5 метра или ширина > 2, то машина считается крупной
        //иначе считается маломерной.
        //тариф 4000 - для крупных авто.
        //тариф 2000 - для маломерных.
        //В автомойку были отправлены грязные машины мэрии: 4 легковых(длина высота ширина) (5х2х1.8),
        //5 автобусов(12х3х2.3)
        //Посчитать, сколько мэрия заплатит денег за мойку машин.
        Vehicle[] vehicles = {
            new Car(false, new double[]{5, 2, 1.8}, true),
            new Car(false, new double[]{5, 2, 1.8}, true),
            new Car(false, new double[]{5, 2, 1.8}, false),
            new Car(false, new double[]{5, 2, 1.8}, true),
            new Bus(false, new double[]{12, 3, 2.3}, 10),
            new Bus(false, new double[]{12, 3, 2.3}, 12),
            new Bus(false, new double[]{12, 3, 2.3}, 10),
            new Bus(false, new double[]{12, 3, 2.3}, 8),
            new Bus(false, new double[]{12, 3, 2.3}, 8)
        };
        Wash wash1 = new Wash();
        System.out.println(wash1.washingVehicles(vehicles));
    }

    public static void ex2() {
        //Задача №2
        //1. Создать два класса, которые умеют летать: самолет и утка. Атрибут утки: isInjured (ранен),
        // атрибут самолета: countPassengers.
        //2. Создать интерфейс, который объединяет эти два класса.
        //3. Имплементировать его в двух классах
        //4. Реализовать метод летать:
        // Для утки:
        // Метод летать будет выкидывать ошибку FlyException (создать такой класс), если утка подстрелена,
        // иначе печатать на экран "утка летит"
        // Для самолета:
        // Метод летать будет выкидывать ошибку FlyException, если количество пассажиров меньше нуля.
        // Иначе печать "самолет летит"
        //5. Создать 1 утку не раненую, 1 утку раненую, 1 самолет с 10 пассажирами, 1 самолет с -1 пассажиром.
        //6. Вызвать у них метод летать
        // Перехватить исключения: вывести на экран текст
        // Ожидание:
        // утка летит
        // Ошибка: утка ранена
        // самолет летит
        // Ошибка: пассажиров в самолете меньше 0

        Duck duck1 = new Duck(false);
        Duck duck2 = new Duck(true);
        Plane plane1 = new Plane(10);
        Plane plane2 = new Plane(-1);
        Flyable[] flyable = {duck1, duck2, plane1, plane2};

        for (Flyable value : flyable) {
            try {
                value.fly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void ex3() {
        //Задача №3 - Звук вокруг
        //Человек умеет издавать звук: "Я человек." (возвращается строка и в след пунктах тоже)
        //Строитель умеет издавать звук: "Я строитель." + звук из человека
        //Водитель умеет издавать звук: "Я водитель." (имеет связь с человеком)
        //Птица умеет издавать звук: "Чирик"
        //Сделать так, чтобы они все могли быть представлены к единому типу.
        //Создать в этом методе человека, строителя, водителя и птицу. Заставить их издать звуки.
        //Изданные звуки распечатать.
        Sound human = new Human();
        Sound builder = new Builder(human);
        Sound driver = new Driver();
        Sound bird = new Bird();
        Sound[] sounds = {human, builder, driver, bird};

        for (Sound sound : sounds) {
            System.out.println(sound.makeSound());
        }
    }

    public static void ex4() {
        //Задача №4 (2 балла) - OneGramChat
        //Для считывания данных вам нужен new Scanner(), вызывать readLine();
        //Создать сообщение (текст, входящее/исходящее, кому/от кого)
        //Создать Пользователя(имя, пароль, список сообщений)
        //Необходимо создать класс OneGramChat, который позволяет:
        //Создать пользователя. Имя и пароль вводится из консоли. Список сообщений пустой (размерность 100).
        //
        //Войти пользователю. Ввести имя и пароль. Если есть такой пользователь,
        //он становится текущим пользователем в системе.
        //Если нет пользователя, то будет ошибка.
        //
        //Выйти пользователю, текущий пользователь становится пустым.
        //
        //Написать письмо: Вводится имя пользователя, вводится текст письма.
        //У текущего пользователя записывается в список сообщений как исходящий
        //У пользователя которому пишем, записывается в список сообщений как входящее
        //если такого пользователя нет, то возникает ошибка: такого пользователя нет
        //если текущего пользователя нет, то возникает ошибка: вы не авторизованы
        //
        //Прочитать письма:
        //Вывести все письма текущего пользователя.
        //Формат входящего: "письмо от {имя пользователя}: {текст сообщения}"
        //Формат исходящего: "письмо к {имя пользователя}: {текст сообщения}"
        //если текущего пользователя нет, то возникает ошибка: вы не авторизованы
        //
        //Функция запуска чата:
        //чат постоянно ожидает команд из консоли:
        //"войти" - запуск функции "войти пользователю"
        //"новый" - запуск функции "создать пользователя"
        //"выйти" - запуск функции "выйти пользователю"
        //"написать" - запуск функции "написать письмо"
        //"прочитать" - запуск функции "прочитать письмо"
        //"exit" - окончание работы программы
        //Ошибки в результате работы команд должны быть обработаны, и не должны заканчивать работу программы.

        user[0] = new User("", ""); // Создание текущего пользователя
        start(id);
    }

    public static void start(int id) {
        System.out.println("Добро пожаловать в OneGramChat!");
        startMenu();
        Scanner in = new Scanner(System.in);
        int number = 0;
        while (number != 7) {
            number = in.nextInt();
            switch (number) {
                case (1): {
                    try {
                        logonUser();
                    } catch (ChatException e) {
                        System.out.println(e.getMessage());
                    }
                    startMenu();
                    break;
                }
                case (2): {
                    createUser(id);
                    id++;
                    number = 0;
                    startMenu();
                    break;
                }
                case (3): {
                    logoffUser();
                    number = 0;
                    startMenu();
                    break;
                }
                case (4): {
                    try {
                        sendMessage();
                    } catch (ChatException e) {
                        System.out.println(e.getMessage());
                    }
                    startMenu();
                    break;
                }
                case (5): {
                    try {
                        readMessages();
                    } catch (ChatException e) {
                        System.out.println(e.getMessage());
                    }
                    startMenu();
                    break;
                }
                case (6): {
                    listUsers();
                    number = 0;
                    startMenu();
                    break;
                }
                default: {
                    System.out.println(ANSI_RED + "Выберите корректный вариант" + ANSI_RESET);
                    startMenu();
                }
            }
        }
        in.close();
    }

    public static void logonUser() throws ChatException {
        Scanner logonUser = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите имя пользователя: ");
        String name = logonUser.nextLine();
        System.out.print("Введите пароль пользователя: ");
        String pwd = logonUser.nextLine();
        for (int i = 1; i < user.length; i++) {
            if (user[i] == null) {
                break;
            } else if (Objects.equals(user[i].getNameUser(), name)) {
                user[0].setNameUser(name);
                user[0].setPwdUser(pwd);
                break;
            }
        }
        if (!Objects.equals(user[0].getNameUser(), name)) {
            throw new ChatException(ANSI_RED + "Ошибка! Такого пользователя не найдено" + ANSI_RESET);
        }
    }

    public static void createUser(int id) {
        Scanner newUser = new Scanner(System.in);
        System.out.println();
        System.out.println("Создание нового пользователя");
        System.out.println();
        System.out.print("Введите имя пользователя: ");
        String name = newUser.nextLine();
        System.out.print("Введите пароль пользователя: ");
        String pwd = newUser.nextLine();
        user[id] = new User(name, pwd);
        System.out.println("Создан новый пользователь: " + user[id].getNameUser());
        System.out.println();
    }

    public static void logoffUser() {
        user[0].setNameUser("");
        user[0].setPwdUser("");
        System.out.println();
        System.out.println("Пользователь вышел из системы");
    }

    public static void sendMessage() throws ChatException {
        if (Objects.equals(user[0].getNameUser(), "")) {
            throw new ChatException(ANSI_RED + "Ошибка! Вы не авторизованы" + ANSI_RESET);
        }
        Scanner sendMessage = new Scanner(System.in);
        System.out.println();
        System.out.println("Создать новое сообщение");
        System.out.print("Кому отправить сообщение: ");
        String nameUser = sendMessage.nextLine();
        System.out.print("Текст сообщения: ");
        String messageUser = sendMessage.nextLine();
        for (int i = 1; i < user.length; i++) {
            if (user[i] == null) {
                throw new ChatException(ANSI_RED + "Ошибка! Такого пользователя нет" + ANSI_RESET);
            } else if (Objects.equals(user[i].getNameUser(), nameUser)) {
                inbox[idInbox] = new Inbox(nameUser, messageUser, user[0].getNameUser());
                idInbox++;
                outbox[idOutbox] = new Outbox(user[0].getNameUser(), messageUser, nameUser);
                idOutbox++;
                break;
            }
        }
        System.out.println();
        System.out.println("Сообщение отправлено");
    }

    public static void readMessages() throws ChatException {
        if (Objects.equals(user[0].getNameUser(), "")) {
            throw new ChatException(ANSI_RED + "Ошибка! Вы не авторизованы" + ANSI_RESET);
        }
        System.out.println();
        System.out.println("Список всех сообщений текущего пользователя");
        String nameUser = user[0].getNameUser();

        System.out.println("Входящие сообщения:");
        int i = 0;
        while (inbox[i] != null) {
            if (Objects.equals(inbox[i].getNameUser(), nameUser)) {
                System.out.println(inbox[i].getFromUser() + ": " + inbox[i].getMessageUser());
            }
            i++;
        }

        System.out.println("Исходящие сообщения:");
        i = 0;
        while (outbox[i] != null) {
            if (Objects.equals(outbox[i].getNameUser(), nameUser)) {
                System.out.println(outbox[i].getToUser() + ": " + outbox[i].getMessageUser());
            }
            i++;
        }
    }

    public static void listUsers() {
        System.out.println();
        System.out.println("Список пользователей:");
        for (int i = 1; i < user.length; i++) {
            if (user[i] != null) {
                System.out.println(user[i].getNameUser());
            }
        }
    }

    public static void startMenu() {
        System.out.println();
        System.out.println("Текущий пользователь: " + user[0].getNameUser());
        System.out.println();
        System.out.println("Основное меню");
        System.out.println("1. Войти");
        System.out.println("2. Новый");
        System.out.println("3. Выйти");
        System.out.println("4. Написать");
        System.out.println("5. Прочитать");
        System.out.println("6. Список пользователей");
        System.out.println("7. Выход из программы");
        System.out.println("Выбери вариант меню (нажми цифру):");
    }
}



