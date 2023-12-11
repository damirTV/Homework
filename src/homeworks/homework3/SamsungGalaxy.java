package homeworks.homework3;

//Создать 2 типа телефонов и комплектующих к ним.
//При печати телефона должны показываться все свойства телефона и вложенных объектов.
//1 тип: Samsung galaxy. Имеет операционную систему Android, плату j-108(размер (ширина Х длина Х высота) 10х12х13),
//камеру Samsung(20x zoom).
//2 Тип: Iphone 15. Имеет операционную систему Ios, плату 7uik(размер 15х12х13),
//камеру iphone(15x zoom, есть вспышка).

class SamsungGalaxy {
    private final String model;
    private String operationSystem;
    private String board;
    private int[] boardSize;
    private String[] camera;


    public SamsungGalaxy() {
        this.model = "Android";
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public void setBoardSize(int[] boardSize) {
        this.boardSize = boardSize;
    }

    public void setCamera(String[] camera) {
        this.camera = camera;
    }

    public void printSpec() {
        System.out.println("Модель: " + model);
        System.out.println("Операционная система: " + operationSystem);
        System.out.println("Материнская плата: " + board);
        System.out.printf("Размеры материнской платы: Ширина %s, Высота %s, Длина %s\n", boardSize[0], boardSize[1], boardSize[2]);
        System.out.printf("Камера: %s (%s)\n", camera[0], camera[1]);
    }
}

