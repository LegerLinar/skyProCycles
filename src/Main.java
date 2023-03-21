public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        secondClassTask1();
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

    public static void task8(){
        System.out.println("Задача 8");

//       Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы
//       будете откладывать по 29 000 рублей «в банку».
//Выведите сумму накоплений за каждый месяц в консоль в формате:
// «Месяц …, сумма накоплений равна … рублей».

        int saving = 29000;
        int total = 0;

        for (int i = 0; i <= 12; i++){
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
            total = total + saving;
        }
    }

    public static void task9(){
        System.out.println("Задача 9");
//        Перепишите решение задачи выше при условии, что деньги вы
//        откладывать будете не «в банку», а в банк под проценты — 12% годовых.
//        Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …,
//        сумма накоплений равна … рублей».

        int saving = 29000;
        int total = 0;

        for(int i = 0; i<= 12; i++){
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
            total = total + total/100;
            total = total + saving;
        }
    }

    public static void task10(){
        System.out.println("Задача 10");
//        Напишите программу, которая выводит в консоль таблицу умножения на 2:
//2*1=2
//2*2=4
//2*3=6
//2*4=8
//2*5=10
//2*6=12
//2*7=14
//2*8=16
//2*9=18
//2*10=20

        for(int i = 1; i<= 10; i++){
            int multiplyBase = 2 * i;
            System.out.println("2*" + i + "=" + multiplyBase);
        }
    }

    public static void secondClassTask1(){
        System.out.println("Циклы 2. Задача 1");
//            Продолжите работать с кодом, который вы написали в предыдущем уроке — в задачах с накоплениями.
//С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
// что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
//Результат программы должен быть выведен в консоль с тем количеством месяцев,
// которое необходимо для накопления данной суммы. Формат сообщения: «Месяц …, сумма накоплений равна … рублей» .
        int total = 0;
        int salary = 15_000;
        int monthsCounter = 0;

        while(total <= 2_459_000){
//            total += total/100;
            monthsCounter++;
            total += salary;
                System.out.println("Месяц " + monthsCounter + ", сумма накоплений равна " + total + " рублей");
        }

    }

}