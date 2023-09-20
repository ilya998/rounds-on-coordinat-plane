package ru.vsu.cp.vvp2023.g91.kravtsovid.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите координаты от и радиус первой окружности в формате 'x y r': ");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        double r1 = scan.nextDouble();
        System.out.print("Введите координаты и радиус второй окружности в формате 'x y r': ");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        double r2 = scan.nextDouble();
        int x = Math.abs(x1 - x2);
        int y = Math.abs(y1 - y2);
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