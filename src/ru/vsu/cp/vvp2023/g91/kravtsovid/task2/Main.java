package ru.vsu.cp.vvp2023.g91.kravtsovid.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void inpt(Scanner scn) {
        try {
            global.temp = scn.nextDouble();
            global.a -= 1;
        } catch (InputMismatchException e) {
            String err = scn.next();
            System.out.println('"' + err + '"' + " не является допустимым значением, пожалуста вводите только числа!");
        }
    }

    public static void main(String[] args) {
        final double EPS = 1e-14;
        double x1 = 0, y1 = 0, r1 = 0, x2 = 0, y2 = 0, r2 = 0;
        while (global.a != 0) {
            global.a = 3;
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите координаты и радиус первой окружности в формате 'x y r': ");
            inpt(scan);
            x1 = global.temp;
            inpt(scan);
            y1 = global.temp;
            inpt(scan);
            r1 = global.temp;
            if (r1 < 0) {
                global.a++;
                System.out.println("Первый радиус отрицательный, пожалуйста ввобдите только положительные значения дл радиуса.");
            } else if (r1 == 0) {
                global.a++;
                System.out.println("Радиус не может быть равен нулю, пожалйста вводите только положительные значения.");
            }
        }
        global.a = 3;
        while (global.a != 0) {
            global.a = 3;
            Scanner scan1 = new Scanner(System.in);
            System.out.print("Введите координаты и радиус второй окружности в формате 'x y r': ");
            inpt(scan1);
            x2 = global.temp;
            inpt(scan1);
            y2 = global.temp;
            inpt(scan1);
            r2 = global.temp;
            if (r2 < 0) {
                global.a++;
                System.out.println("Второй радиус отрицательный, пожалуйста ввобдите только положительные значения дл радиуса.");
            } else if (r2 == 0) {
                global.a++;
                System.out.println("Радиус не может быть равен нулю, пожалйста вводите только положительные значения.");
            }
        }
        if (x1 == x2 && y1 == y2 && r1 == r2) {
            System.out.println("Окружности идентичны и находятся в одной точке.");
        } else {
            double x = Math.abs(x1 - x2);
            double y = Math.abs(y1 - y2);
            double dist = Math.sqrt(x * x + y * y);
            if ((r1 + r2 < dist) || (Math.max(r1, r2) > (Math.min(r1, r2) + dist))) {
                System.out.println("Окружности не пересекаются.");
            } else if (Math.abs((r1 + r2) - dist) < EPS || Math.abs(Math.max(r1, r2) - (Math.min(r1, r2) + dist)) < EPS) {
                System.out.println("Окружности пересекаются в одной точке.");
            } else {
                System.out.println("Окружности пересекаются в 2-ух точках.");
            }
        }
    }
}