package ru.vsu.cp.vvp2023.g91.kravtsovid.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void inpt(Scanner scn) {
        try {
            global.x = scn.nextDouble();
            global.a -= 1;
        } catch (InputMismatchException e) {
            String err = scn.next();
            System.out.println('"' + err + '"' + " не является допустимым значением, пожалуста вводите только числа!");
        }
    }

    public static void main(String[] args) {
        double x1 = 0, y1 = 0, r1 = 0, x2 = 0, y2 = 0, r2 = 0;
        while (global.a != 0) {
            global.a = 3;
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите координаты и радиус первой окружности в формате 'x y r': ");
            inpt(scan);
            x1 = global.x;
            inpt(scan);
            y1 = global.x;
            inpt(scan);
            r1 = global.x;
        }
        global.a = 3;
        while (global.a != 0) {
            global.a = 3;
            Scanner scan1 = new Scanner(System.in);
            System.out.print("Введите координаты и радиус второй окружности в формате 'x y r': ");
            inpt(scan1);
            x2 = global.x;
            inpt(scan1);
            y2 = global.x;
            inpt(scan1);
            r2 = global.x;
        }
        double x = Math.abs(x1 - x2);
        double y = Math.abs(y1 - y2);
        double dist = Math.sqrt(x * x + y * y);
        if ((r1 + r2 < dist) || (Math.max(r1, r2) > (Math.min(r1, r2) + dist))) {
            System.out.println("Окружности не пересекаются.");
        } else if ((r1 + r2 == dist) || (Math.max(r1, r2) == Math.min(r1, r2) + dist)) {
            System.out.println("Окружности пересекаются в одной точке.");
        } else {
            System.out.println("Окружности пересекаются в 2-ух точках.");
        }
    }
}