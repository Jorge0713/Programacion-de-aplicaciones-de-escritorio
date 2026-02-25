package Parcial1;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    };

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        if (((side1 + side2)<=side3)||((side3 + side2)<=side1)||((side3 + side1)<=side2)){
            throw new IllegalTriangleException("ERROR: Ingrese lados correctamente");
        }
    }

    public double getArea() {
        double s = getPerimeter();
        double x = (s * (s - side1) * (s - side2) * (s - side3));
        double area = Math.sqrt(x);
        return area;
    };

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }

    @Override
    public String toString() {
        return "Triangulo: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
