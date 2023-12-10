package homeworks.homework3;

public class Iphone15 {
    private final String model;
    private String operationSystem;
    private String board;
    private int[] boardSize;

    public Iphone15() {
        this.model = "iPhone15";
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

    public void printSpec() {
        System.out.println("Модель: " + model);
        System.out.println("Операционная система: " + operationSystem);
        System.out.println("Материнская плата: " + board);
        System.out.printf("Размеры материнской платы: Ширина %s, Высота %s, Длина %s\n", boardSize[0], boardSize[1], boardSize[2]);
    }
}
