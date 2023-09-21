package ru.vsu.cp.vvp2023.g91.kravtsovid.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double EPS = 1e-14;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите координаты от и радиус первой окружности в формате 'x y r': ");
        double x1 = scan.nextInt();
        double y1 = scan.nextInt();
        double r1 = scan.nextDouble();
        System.out.print("Введите координаты и радиус второй окружности в формате 'x y r': ");
        double x2 = scan.nextInt();
        double y2 = scan.nextInt();
        double r2 = scan.nextDouble();
        double x = Math.abs(x1 - x2);
        double y = Math.abs(y1 - y2);
        double dist = Math.sqrt(x * x + y * y);
        if (r1 <= 0 || r2 <= 0) {
            System.out.println("Радиус должен быть положительным.");
        } else if ((r1 + r2 < dist) || (Math.max(r1, r2) > (Math.min(r1, r2) + dist))) {
            System.out.println("Окружности не пересекаются.");
        } else if (Math.abs((r1 + r2) - dist) < EPS || Math.abs(Math.max(r1, r2) - (Math.min(r1, r2) + dist)) < EPS) {
            System.out.println("Окружности пересекаются в одной точке.");
        } else {
            System.out.println("Окружности пересекаются в 2-ух точках.");
        }
    }
}