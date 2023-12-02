import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        ex1(); // Выполняем задание №1
    }

    public static void ex1() {
        System.out.println("Задание №1");
        //Дан массив с массивом чисел внутри
        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 2, 3, 4, 5, 6, 7, 8, 9, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 3, 4, 5, 6, 7, 8, 93, 10};
        arrayOfNumbers[2] = new int[]{1, 2, 31, 4, 5, 6, 7, 81, 9, 10};
        arrayOfNumbers[3] = new int[]{1, 2, 3, 45, 5, 6, 77, 8, 9, 10};
        arrayOfNumbers[4] = new int[]{1, 2, 3, 4, 57, 67, 7, 8, 9, 10};
        arrayOfNumbers[5] = new int[]{1, 2, 3, 4, 533, 68, 7, 8, 9, 10};
        arrayOfNumbers[6] = new int[]{1, 2, 3, 40, 5, 6, 72, 8, 9, 10};
        arrayOfNumbers[7] = new int[]{1, 2, 30, 4, 5, 6, 7, 83, 9, 10};
        arrayOfNumbers[8] = new int[]{1, 20, 3, 4, 5, 6, 7, 8, 901, 10};
        arrayOfNumbers[9] = new int[]{10, 2, 3, 4, 5, 6, 7, 8, 9, 101};

        //Посчитать сумму каждой диагонали используя цикл(ы)
        //Вывести на экран

        //С левого верхнего угла к нижнему правому
        int element = 0;
        int leftUpToRightDownSum = 0;
        for (int[] row : arrayOfNumbers) {
            leftUpToRightDownSum = leftUpToRightDownSum + row[element];
            element++;
        }
        System.out.println("Сумма всех элементов диагонали с левого верхнего угла к нижнему правому: " + leftUpToRightDownSum);

        //С левого нижнего угла к верхнему правому
        int leftDownToRightUpSum = 0;
        element = arrayOfNumbers[0].length-1;
        for (int[] row : arrayOfNumbers) {
            leftDownToRightUpSum = leftDownToRightUpSum + row[element];
            element--;
        }
        System.out.println("Сумма всех элементов диагонали с левого нижнего угла к верхнему правому: " + leftDownToRightUpSum);

    }
}
