package homeworks.homework3;

//Создать фабрику, которая заполняет созданный телефон деталями
//При создании телефона в нем нет комплектующих, как будто пустой пластиковый каркас,
//но при этом модель телефона уже есть.

//На фабрике должно быть два публичных метода с одним названием:
//один будет собирать iphone, второй будет собирать samsung.
//В данном методе создать два телефона, собрать их, распечатать.

//При печати телефона должны показываться все свойства телефона и вложенных объектов.
//1 тип: Samsung galaxy. Имеет операционную систему Android, плату j-108(размер (ширина Х длина Х высота) 10х12х13),
//камеру Samsung(20x zoom).
//2 Тип: Iphone 15. Имеет операционную систему Ios, плату 7uik(размер 15х12х13),
//камеру iphone(15x zoom, есть вспышка).

class PhoneFabric {

    public void createPhone(SamsungGalaxy samsungGalaxy) {
        samsungGalaxy.setOperationSystem("Android");
        samsungGalaxy.setBoard("j-108");
        samsungGalaxy.setBoardSize(new int[]{10, 21, 13});
    }

    public void createPhone(Iphone15 iphone15) {
        iphone15.setOperationSystem("iPhone 15");
        iphone15.setBoard("7uik");
        iphone15.setBoardSize(new int[]{15, 12, 13});
    }
}
