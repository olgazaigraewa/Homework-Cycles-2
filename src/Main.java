public class Main {
    public static void main(String[] args) {
        //Циклы. Часть 2
        System.out.println("Циклы. Часть 2");
        // Домашнее задание 1
        System.out.println("         Домашнее задание 1");
        //Задание 1
        int cash = 15_000;
        double totalWithPercent = 0;
        int i = 0;
        while (totalWithPercent <= 2_459_000) {
            totalWithPercent = (totalWithPercent + cash) * 1.01;
            i++;
            System.out.println(" Месяц " + i + ", сумма накоплений равна " + totalWithPercent);
        }
        //Задание 2
        System.out.println("Задание 2 ");
        for (int a = 10; a >= 1; a--) {
            System.out.println(+a);
                    }
        System.out.println("    ");
        int start = 0;
        while (start < 10) {
            start++;
            System.out.println(start);
        }
        //Задание 3
        System.out.println("Задание 3 ");
        int populationSize = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int populationSizePerYear ;
        for (i = 1; i <= 10; i++) {
            populationSizePerYear = populationSize / 1000 * (fertility - mortality);
            populationSize += populationSizePerYear;
            System.out.println("Год  " + i + " численность населения составляет " + populationSize);
        }
        // Домашнее задание 2
        System.out.println("         Домашнее задание 2");
        //Задание 1
        System.out.println("Задание 1 ");
        int m = 1;
        int a = 15_000;
        double percent = a * 0.07;
        for (; a <= 12_000_000; m++) {
            a += percent;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + a + " рублей");
        }
        //Задание 2
        System.out.println("Задание 2 ");
        int month = 1;
        int vklad = 15_000;
        double sumPercent = vklad * 0.07;
        for (; vklad <= 12_000_000; month++) {
            vklad += sumPercent;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + vklad + " рублей");
            }

        }
        //Задание 3
        System.out.println("Задание 3 ");
        int sum = 15_000;
        double stavka = sum * 0.07;
        for (int q = 1; q <= 108; q++) {
            sum += stavka;
            if (q % 6 == 0) {
                System.out.println(" Месяц " + q + " , сумма накоплений равна " + sum + " рублей");
            }

        }
        //Задание 4
        System.out.println("Задание 4 ");
        int friday = 2;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday +=6;
            friday++;
        }

        // Домашнее задание 3
        System.out.println("         Домашнее задание 3");
        //Задание 1
        System.out.println("Задание 1 ");
        int year = 0;
        while (year< 2122) {
            if(year > 1822)
                System.out.println(year);
            year += 78;
            year++;
            }
        //Задание 2
        System.out.println("Задание 2 ");
        int w = 2;
        int r ;
        for (int j = 1; j<= 10; j++) {
        r= w * j;
            System.out.println(  w+ "*" + j+ "=" + r );
            }

        }


        }


























































