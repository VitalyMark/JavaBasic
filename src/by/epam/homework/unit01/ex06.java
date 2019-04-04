package by.epam.homework.unit01;

import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.log;
/*
Программа запрашивает у пользователя a,b,c ,вычислить значение выражения a2-(bc)2+ln(b2+1).
 */

public class ex06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите 'a': ");
        double a = in.nextDouble();
        System.out.println("вы ввели a: " +a);
        System.out.println("Введите b: ");
        double b = in.nextDouble();
        System.out.println("вы ввели b: " +b);
        System.out.println("Введите c: ");
        double c = in.nextDouble();
        System.out.println("вы ввели b: " +c);
        double res ;
        System.out.println("Ответ " + (pow(a,2)- pow((b*c),2)+ log(pow(b,2)+1)));
    }
}
