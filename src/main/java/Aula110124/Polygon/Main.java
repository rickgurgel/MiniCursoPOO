package Aula110124.Polygon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- ---Give me the radius, I shall give you answers...--- -----");
        Circle circle = new Circle();
        circle.setRadius(sc.nextDouble());

        System.out.println("----- ----------------------------------------------------- -----");
        System.out.println("----- ---You gave me: " + circle.getRadius() + "... And this shall be your return: -----");
        System.out.println("Area = " + circle.calculateArea(circle.getRadius()));
        System.out.println("Perimeter = "+ circle.calculatePerimeter(circle.getRadius()));

        sc.close();
    }
}
