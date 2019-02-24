package by.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение начала отрезка 'а': ");
        int a = sc.nextInt();
        int b;
        do {
            System.out.println("Введите конечное значение отрезка 'b', оно должно быть больше и не равно 'а':");
            b = sc.nextInt();
        } while (b <= a);
        System.out.println("Введите параметр u:");
        int u = sc.nextInt();
        System.out.println("Заданные параметры: отрезок [" + a + ";" + b + "]; параметр u = " + u);

        System.out.println("Введите параметр 'х':");
        double x = sc.nextDouble();
        double result;
        if (x < a) {
             result = fn1(x);
        } else if (a <= x && x <= b) {
            result = fn2(x, u);
        } else {
            result = fn3(x);
        }
        System.out.println("Результат = " + result);
        sc.close();
    }

    public static double fn1(double x) {
        return Math.cos(x + Math.log(x)) + Math.exp(x);
    }

    public static double fn2(double x, int u) {
        if ((u - Math.pow(x, 2))<0) {
            throw new IllegalArgumentException("Подкоренное выражение меньше нуля, расчет невозможен");
        }
        return Math.sqrt(u - Math.pow(x, 2));
    }

    public static double fn3(double x) {
        if (Math.round(Math.tan(Math.PI * x) * 100000 ) / 100000==0){
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        return (x + 5) / Math.tan(Math.PI * x);
    }
}
