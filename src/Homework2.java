import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        ex1(); // Выполняем задание №1
        ex2(); // Выполняем задание №2
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
        //С левого нижнего угла к верхнему правому
        int element = 0;
        int leftUpToRightDownSum = 0;
        int leftDownToRightUpSum = 0;
        for (int[] row : arrayOfNumbers) {
            leftUpToRightDownSum += row[element];
            leftDownToRightUpSum += row[row.length-element-1];
            element++;
        }
        System.out.println("Сумма всех элементов диагонали с левого верхнего угла к нижнему правому: " + leftUpToRightDownSum);
        System.out.println("Сумма всех элементов диагонали с левого нижнего угла к верхнему правому: " + leftDownToRightUpSum);

    }
    public static void ex2() {
        System.out.println("\nЗадание №2");
        // Перевернуть массив(без сторонних классов), не создавая новый массив. Вывести на экран.
        // "Перевернуть" - значит последние элементы становятся первыми и наоборот.
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Исходное содержимое массива: " + Arrays.toString(numbers));
        int number;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != numbers[numbers.length-i-1]) {
                number = numbers[i];
                numbers[i] = numbers[numbers.length-i-1];
                numbers[numbers.length-i-1] = number;
            } else break;
        }
        System.out.println("Новое содержимое массива после переворачивания: " + Arrays.toString(numbers));
    }
}
