public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
//        С помощью цикла for выведите в консоль все числа от 1 до 10.

        for (int i = 1; i <= 10; i++) {
            System.out.println("Число " + i);
        }
    }


    public static void task2() {
        System.out.println("Задача 2");
//        С помощью цикла for выведите в консоль все числа от 10 до 1.

        for (int i = 10; i > 0; i--) {
            System.out.println("Число " + i);
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
//        Выведите в консоль все четные числа от 0 до 17.

        for (int i = 0; i <= 17; i++) {
            if (i != 0 && i % 2 == 0) {
                System.out.println("Четное число " + i);
            }
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
//        Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.

        for (int i = 10; i >= -10; i--) {
            System.out.println("Число " + i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
//        Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
//        В консоль результат должен выводиться в формате: «… год является високосным».

        for (int i = 1904; i <= 2096; i = i + 4) {
            if (i % 100 == 0 && i % 400 != 0) {
                System.out.println(i + " год не високосный");
            } else {
                System.out.println(i + " год является високосным");
            }
        }
    }

    public static void task6(){
        System.out.println("Задача 6");
//        Напишите программу, которая выводит в консоль последовательность чисел:
//7 14 21 28 35 42 49 56 63 70 77 84 91 98

        for(int i = 7; i <= 98; i = i + 7){
            System.out.println( i );
        }
    }

    public static void task7(){
        System.out.println("Задача 7");
//        Напишите программу, которая выводит в консоль последовательность чисел:
//1 2 4 8 16 32 64 128 256 512

        for(int i = 2; i <=512; i = i * 2){
            System.out.println(i);
        }
    }

}