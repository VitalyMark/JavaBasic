package by.epam.homework.unit01;

/**
 * Created by Vitali_Markusheusky on 3/20/2019.
 */
public class ex04 {
    private static double a; //катет прямоугольного треугольнка
    private static double b; //катет прямоугольного треугольнка

    public static void square() {
        a=2;
        b=3;
        System.out.println("Длина гипотенузы c=" + Math.sqrt((double)Math.pow(a,2)+ (double)Math.pow(b,2)));
        System.out.println("Площадь треугольника S=" + (a*b)/2);
    }
}

