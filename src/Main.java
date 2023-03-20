public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("Задача 1");
//        С помощью цикла for выведите в консоль все числа от 1 до 10.

        for(int i = 1; i < 11; i++) {
            System.out.println("Число " + i);
        }
    }


    public static void task2 () {
        System.out.println("Задача 2");
//        С помощью цикла for выведите в консоль все числа от 10 до 1.

        for(int i = 10; i > 0; i--) {
            System.out.println("Число " + i);
        }

    }
}