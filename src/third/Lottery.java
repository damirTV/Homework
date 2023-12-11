package third;

//Создать класс лотерейный билет (у объекта не может быть атрибутов)
//создать метод проверить удачу (не принимает в себя аргументов!):
//каждый десятый билет дает 100 руб,
//каждый сотый - 5_000,
//иначе 0
//Если совпало что билет одновременно десятый и сотый выбор в пользу сотого.

public class Lottery {
    private static int numberTicket = 0;

    public Lottery() {
        numberTicket++;
    }

    public int checkTicket() {
        if (numberTicket % 100 == 0) {
            return 5_000;
        } else if (numberTicket % 10 == 0) {
            return 100;
        } else {
            return 0;
        }
    }
}
