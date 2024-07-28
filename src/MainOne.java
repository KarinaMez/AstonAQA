import java.util.Arrays;

public class MainOne {

    public static void main(String[] args) {
        System.out.println("Задание 1: \n");
        printThreeWords();
        System.out.println("\n");
        System.out.println("Задание 2: \n");
        checkSumSign();
        System.out.println("\n");
        System.out.println("Задание 3: \n");
        printColor();
        System.out.println("\n");
        System.out.println("Задание 4: \n");
        compareNumbers();
        System.out.println("\n");
        System.out.println("Задание 5: \n");
        // Примеры вызова метода
        System.out.println(isSumInRange(5, 5));
        System.out.println(isSumInRange(10, 5));
        System.out.println(isSumInRange(15, 5));
        System.out.println(isSumInRange(10, 11));
        System.out.println("\n");
        System.out.println("Задание 6: \n");
        checkNumberSign(10);
        checkNumberSign(-5);
        checkNumberSign(0);
        System.out.println("\n");
        System.out.println("Задание 7: \n");
        System.out.println(isNegative(-5));
        System.out.println(isNegative(10));
        System.out.println(isNegative(0)+ "\n");
        System.out.println("Задание 8: \n");
        printStringMultipleRepet("Привет!", 3);
        System.out.println("\n");
        System.out.println("Задание 9: \n");
        System.out.println(isLeapYear(2001));
        System.out.println(isLeapYear(2024)+ "\n");
        System.out.println("Задание 10: \n");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(args);
        System.out.println(Arrays.toString(arr)+ "\n");
        System.out.println("Задание 11: \n");
        int[] arr1 = new int[100];
        arrayTwo(arr1);
        System.out.println(Arrays.toString(arr1)+ "\n");
        System.out.println("Задание 12: \n");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        arrayThree(arr3);
        System.out.println(Arrays.toString(arr3)+ "\n");
        System.out.println("Задание 13: \n");
        diagonalM(args);
        System.out.println(Arrays.toString(args) + "\n");
        System.out.println("Задание 14: \n");
        printArray(retLen(10, 5));

    }


/* 1. Создайте метод printThreeWords(),который при вызове должен
отпечатать в столбец три слова: Orange, Banana, Apple.
*/

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

/* 2. Создайте метод checkSumSign(), в теле которого объявите две
int переменные a и b, и инициализируйте их любыми значениями,
которыми захотите. Далее метод должен просуммировать эти переменные
и если их сумма больше или равна 0, то вывести в консоль сообщение.
“Сумма положительная”,в противном случае - “Сумма отрицательная”;
*/

    public static void checkSumSign() {
        int a = 35;
        int b = -10;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

/* 3. Создайте метод printColor() в теле которого задайте int переменную value
и инициализируйте ее любым значением. Если value меньше 0 (0 включительно),
то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах
от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
если больше 100 (100 исключительно) - “Зеленый”;
*/

    public static void printColor() {
        int value = 38;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

/* 4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b,
то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
*/

    public static void compareNumbers() {
        int a = 100;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

/* 5. Напишите метод, принимающий на вход два целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,в противном случае – false.
*/


    public static boolean isSumInRange(int a, int b) {

        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

/* 6. Напишите метод, которому в качестве параметра передается целое число,
метод должен напечатать в консоль, положительное ли число передали или отрицательное.
Замечание: ноль считаем положительным числом.
*/

    public static void checkNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

/* 7. Напишите метод, которому в качестве параметра передается целое число.
Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
Замечание: ноль считаем положительным числом.
*/

    public static boolean isNegative(int number) {
        return number <= 0;
    }

/* 8. Напишите метод, которому в качестве аргументов передается строка и число,
метод должен отпечатать в консоль указанную строку, указанное количество раз;
*/

    public static void printStringMultipleRepet(String text, int repet) {
        // проверяем, чтобы количество повторений было не отрицательным
        if (repet < 0) {
            System.out.println("Количество повторений не может быть отрицательным.");
            return;
        }
        // печатаем строку указанное количество раз
        for (int i = 0; i < repet; i++) {
            System.out.println(text);
        }
    }

    /*  9. Напишите метод, который определяет, является ли год високосным,
     и возвращает boolean (високосный - true, не високосный - false).
     Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    public static boolean isLeapYear(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else
                    return false;
            }
            return true;
        } else
            return false;
    }

    /* 10. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void invertArray(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i]++;
            else
                arr[i]--;
        }

    }

// 11. Задать пустой целочисленный массив длиной 100.
// С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;

    public static void arrayTwo(int[] arr1) {

        int[] arr = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }

    }

// 12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
// и числа меньшие 6 умножить на 2;

    public static void arrayThree(int[] arr) {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

// 13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу:
// индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];

    public static void diagonalM(String[] args) {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

// 14. Написать метод, принимающий на вход два аргумента: len и initialValue,
// и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.

    public static void printArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
    public static int[] retLen(int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
}
