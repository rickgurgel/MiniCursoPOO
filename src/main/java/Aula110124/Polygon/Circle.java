package Aula110124.Polygon;

public class Circle {

    Double pi = 3.14;

    Double radius;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double calculateArea(Double radius){
        return 2 * pi * Math.pow(radius, 2);
    }

    public Double calculatePerimeter(Double radius){
        return 2 * pi * radius;
    }
}
