package opps_practice.abstraction;

public class Circle extends Shape{

    private double radius;

    @Override
    public double area() {
        double area=Math.PI*radius*radius;
        return area;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
