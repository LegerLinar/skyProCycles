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
        secondClassTask2();
        secondClassTask3();
        secondClassTask4();
        secondClassTask5();
        secondClassTask6();
        secondClassTask7();
        secondClassTask8();
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
// которое необходимо для накопления данной суммы. Формат сообщения: «Месяц …, сумма накоплений равна … рублей».
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
    public static void secondClassTask2(){
        System.out.println("Циклы 2. Задача 2");
//        Задача 2
// выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
//На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
//Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
//Не забудьте выполнить переход на новую строку между двумя циклами.
//В результате программы вывод должен получиться следующий:
//1 2 3 4 5 6 7 8 9 10
//10 9 8 7 6 5 4 3 2 1

        int numberWhile = 0;

        while(numberWhile < 10) {
            numberWhile++;
            if (numberWhile == 10) {
                System.out.println(numberWhile);
            } else {
                System.out.print(numberWhile + " ");
            }
        }

        for (; numberWhile > 0; numberWhile--) {
            if (numberWhile == 1) {
                System.out.println(numberWhile + " ");

            } else {
            System.out.print(numberWhile + " ");
        }
        }
    }

    public static void secondClassTask3(){
        System.out.println("Циклы 2. Задача 3");

//        В стране Y население равно 12 миллионов человек.
//Рождаемость составляет 17 человек на 1000, смертность — 8 человек.
// Рассчитайте, какая численность населения будет через 10 лет,
// если показатели рождаемости и смертности постоянны.
//В консоль выведите результат операции на каждый год в формате:
// «Год …, численность населения составляет …»
        int countryYPopulation = 12_000_000;
//        double birthrate = 17 / 1000;
//        double mortality = 8 / 1000;
        int years = 0;

        while (years < 10){
            countryYPopulation+= 17 * countryYPopulation/1000;
            countryYPopulation+= 8 * countryYPopulation/1000;
            years++;
            System.out.println("Год " + years + " численность населения составляет " + countryYPopulation);
        }

    }
    public static void secondClassTask4(){
        System.out.println("Циклы 2. Задача 4");
//        Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада
//        добавляется еще 7%. Первоначальная сумма вклада — 15 тысяч рублей.
//Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму
// в 12 миллионов рублей при условии, что процент банка от накоплений не меняется, а всегда равен 7%.
//Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.

        int totalSavings = 15000;
        int savings = 15000;
        int monthsCounter = 0;

        while (totalSavings <= 12_000_000){
            totalSavings = totalSavings + 7 * totalSavings/100;
            totalSavings = totalSavings + savings;
            monthsCounter++;
            System.out.println("Месяц " + monthsCounter + " сумма накоплений " + totalSavings + " рублей");

        }

    }
    public static void secondClassTask5(){
        System.out.println("Циклы 2. Задача 5");
//        Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд,
//        а только каждый шестой.
//        Должны быть видны накопления за 6, 12, 18, 24-й и следующие месяцы.

        int totalSavings = 15000;
        int savings = 15000;
        int monthsCounter = 0;

        while (totalSavings <= 12_000_000){
            totalSavings = totalSavings + 7 * totalSavings/100;
            totalSavings = totalSavings + savings;
            monthsCounter++;
            if (monthsCounter % 6 == 0) {
                System.out.println("Месяц " + monthsCounter + " сумма накоплений " + totalSavings + " рублей");
            }
        }
    }

    public static void secondClassTask6(){
        System.out.println("Циклы 2. Задача 6");
//        Василий решил, что будет копить деньги ближайшие 9 лет.
//        Он хочет знать, какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
//Исходная сумма всё та же — 15 тысяч рублей, проценты банка – 7% ежемесячно.
//Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.

        int totalSavings = 15_000;
        int monthlySavings = 15_000;
        int monthsCounter = 0;
        int yearsPlans = 12 * 9;
        do{
            totalSavings += 7 * totalSavings/100;
            totalSavings += monthlySavings;
            monthsCounter++;
            if(monthsCounter % 6 == 0){
                System.out.println("Месяц " + monthsCounter + ", сумма накоплений равна " + totalSavings + " рублей.");
            }
        } while(monthsCounter <= yearsPlans);
    }

    public static void secondClassTask7(){
        System.out.println("Циклы 2. Задача 7");
//        В компании пятница — отчетный день.
//Нужно написать программу, которая считает дни месяца по датам, определяет, какой день пятница,
// и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
//Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
//Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
// «Сегодня пятница, ...-е число. Необходимо подготовить отчет».
//В нашем месяце 31 день. В результате у вас должно получиться от 4 до 5 сообщений с напоминаниями по разным датам.
   int firstFriday = 5;
   int monthDate = 1;

   while (monthDate <= 31){
       if(monthDate==firstFriday) {
       System.out.println("Сегодня пятница, " + firstFriday + "-е число");
           firstFriday += 7;
       }
       monthDate++;
   }
    }

    public static void secondClassTask8(){
        System.out.println("Циклы 2. Задача 8");
//        Нам нужно написать астрономическое приложение, которое считает, когда над Землей пролетает комета.
//Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
//В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий
// год ее появления (ближайшие 100 лет).
//Для вычисления периода можно создать две дополнительные переменные, которые содержат
// год за 200 лет до текущего (из созданной ранее переменной) в качестве старта и 100 лет после
// в качестве завершения периода расчета.
//В результате решения задачи в консоли должен получиться следующий результат:
//1896
//1975
//2054

        int cometArrival = 79;
        int arrivalYear = 0;
        int rangeStart = 1850;
        int rangeEnd = 2100;

        while(arrivalYear <= rangeEnd){
            arrivalYear += cometArrival;
            if(arrivalYear >= rangeStart && arrivalYear <= rangeEnd){
                System.out.println(arrivalYear);
            }
        }
    }
}