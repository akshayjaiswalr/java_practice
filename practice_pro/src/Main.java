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


    }

}
