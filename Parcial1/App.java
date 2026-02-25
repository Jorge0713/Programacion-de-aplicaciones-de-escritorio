package Parcial1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Digite el lado 1:");
        double s1 = key.nextDouble();
        System.out.println("Digite el lado 2:");
        double s2 = key.nextDouble();
        System.out.println("Digite el lado 3:");
        double s3 = key.nextDouble();
        Triangle triangulo;
        try {
            triangulo = new Triangle(s1, s2, s3);
            System.out.println("Escriba el color del triangulo");
            triangulo.setColor(key.nextLine());
            System.out.println("¿El triangulo esta relleno? ");
            triangulo.setFilled(key.nextBoolean());
            System.out.println("color del triangulo: " +triangulo.getColor());
            System.out.println(triangulo.toString());
            System.out.println("Area del triangulo: "+triangulo.getArea());
            System.out.println("Perimetro del triangulo: " + triangulo.getPerimeter());

        } catch (IllegalTriangleException e) {
            e.printStackTrace();

        }
        
    }
}
