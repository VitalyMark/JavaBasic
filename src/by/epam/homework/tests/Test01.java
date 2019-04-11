package by.epam.homework.tests;

/**
 * Created by Vitali_Markusheusky on 4/4/2019.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {
    public static void main(String[] args) throws Exception {
        task01();
        task02();
        task03();
       }

        private static void task01() {
//1. Приложение генерирует 100 случайных чисел. Найти наименьшее и наибольшее число из сгенерированных чисел, используя только один цикл.
// Примечание, генерируемые числа могут быть как положительные, так и отрицательные.
        // Вещественное число в интервале[ -100; +100)
        double a, x_min = 0;
        double x_max = 0;
        for (int i = 0; i < 99; i++) {
            a = Math.random() * 200 - 100;
            if (x_min > a) x_min = a;
            else if (x_max < a) x_max = a;
        }
        System.out.println("x_max= " + x_max + " x_min= " + x_min);
    }

//2. В текстовом хранятся строки, содержащие целые числа, разделенные пробелами. Вывести на консоль сумму каждой строки в следующем виде
    private static void writerFile()throws Exception{

      FileWriter fw = new FileWriter("src/by/epam/homework/tests/data.txt");
     for (int k=0; k<10; k++ ){
        for(int i = 0; i <= 15; i++) {
           int a = (int) (Math.random() * 1000) + 10;
        fw.write(a+" ");
        }
        fw.write("\n");
}
    fw.close();
}

    private static void task02() throws Exception {
        writerFile();
        Scanner sc = new Scanner(new File("src/by/epam/homework/tests/data.txt"));
        String str;
        while (sc.hasNextLine()) {
            int sum = 0;
            str = sc.nextLine();
  //первое решение
            Scanner scn = new Scanner(str);
            while (scn.hasNextInt()){
                int num=scn.nextInt();
                sum=sum+num;
            }
      /*
  // второе решение
            for (int i=0; i<str.split(" ").length; i++ ){
                int num = Integer.parseInt(str.split(" ")[i]);
                sum = sum + num;
            }
  // третье решение
            Pattern pattern = Pattern.compile("[0-9]+");
           Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                int num = Integer.parseInt(matcher.group());
                sum = sum + num;
            }
            */
            System.out.println("----------");
            System.out.println("|   "+sum+"   |");
        }
            System.out.println("----------");
        sc.close();
    }


    //   Посчитать общее количество дней во всех месяцах начиная с года X месяца x, заканчивая годом Y месяцем y.
    private static void task03() {
//первое решение
       /*LocalDate start = LocalDate.of( 2016 , 2 , 23 ) ;
        LocalDate stop = LocalDate.of( 2019 , 2 , 25 ) ;
        int daysBetween = (int) ChronoUnit.DAYS.between( start , stop );
        System.out.println(daysBetween);
        */
//второе решение
       int year_start, month_start;
       int year_stop, month_stop;
       year_start=2018; month_start=5;
       year_stop=2021; month_stop =5;

       int days;
       int sumdays=0;

        for (int year = year_start; year<=year_stop;  year++){
            int month_end=12;
            if (year != year_start) month_start=1;
            if (year == year_stop) month_end=month_stop;

            for(int month = month_start; month<=month_end; month++ ) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        days = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        days = 30;
                        break;
                    case 2:
                            if(year%4==0 && year%100!=0 || year%400==0)  days = 29;
                            else days =28;
                        break;
                    default:
                        days = -1;
                }
                sumdays=sumdays+days;
            }
        }
        System.out.println("Общее количество дней " +sumdays);





    }
}