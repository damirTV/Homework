package third;

class Iphone15 {
    private final String model;
    private String operationSystem;
    private String board;
    private int[] boardSize;
    private String[] camera;

    public Iphone15() {
        this.model = "iPhone15";
    }

    void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    void setBoard(String board) {
        this.board = board;
    }

    void setBoardSize(int[] boardSize) {
        this.boardSize = boardSize;
    }

    void setCamera(String[] camera) {
        this.camera = camera;
    }

    void printSpec() {
        System.out.println("Модель: " + model);
        System.out.println("Операционная система: " + operationSystem);
        System.out.println("Материнская плата: " + board);
        System.out.printf("Размеры материнской платы: Ширина %s, Высота %s, Длина %s\n",
                boardSize[0], boardSize[1], boardSize[2]);
        System.out.printf("Камера: %s (%s, %s)\n", camera[0], camera[1], camera[2]);
    }
}
