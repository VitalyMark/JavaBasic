package by.epam.homework.unit01;

import java.util.Scanner;
import static java.lang.Math.pow;
/**
 * Created by Vitali_Markusheusky on 3/20/2019.
 */
public class ex07 {
    /*
    Программа вводит два числа a и b, если а > b, то программа вводит третье число с и находит сумму b+c. Если а=b,
    то программа печатает слово «Конец». Если а<b, то программа вводит третье число с, находит сумму a+b+c, выводит на экран сумму a+b+c и слова «Новый год!».
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 'a': ");
        double a = in.nextDouble();
        System.out.println("вы ввели a: " + a);
        System.out.println("Введите b: ");
        double b = in.nextDouble();
        System.out.println("вы ввели b: " + b);

        if (a>b ){
            System.out.println("Введите c: ");
            double c = in.nextDouble();
            System.out.println("вы ввели c: " + c);
            System.out.println("b+c = " + (b+c));
        }
        else if (a==b){
            System.out.println("«Конец»");
        }
        else {
            System.out.println("Введите c: ");
            double c = in.nextDouble();
            System.out.println("вы ввели c: " + c);
            System.out.println("a+b+c =" + (a+b+c));
            System.out.println("«Новый год!»");
        }


    }
}