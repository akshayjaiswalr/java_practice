import opps_practice.abstraction.Circle;
import opps_practice.abstraction.Square;
import opps_practice.encapsulation.Vehicle;

public class Main {
    public static void main(String[] args) {
            Vehicle car=new Vehicle();
            car.setCompany("tata");
            car.setSeats("5");
            car.setType("manual");
            System.out.println(car.getCompany());
            System.out.println(car.getType());
            System.out.println(car.getSeats());
        Circle circle=new Circle();
        circle.setRadius(2.4);
        System.out.println(circle.area());
        Square square=new Square();
        square.setSide(3.5);
        System.out.println(square.area());
    }

}
