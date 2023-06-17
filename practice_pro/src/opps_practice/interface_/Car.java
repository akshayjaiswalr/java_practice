package opps_practice.interface_;

public class Car implements Vehicle{

    int gear,speed;

    public Car(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }
public String getState(){


    return "speed:"+speed+"gear: "+gear;
}
    @Override
    public void changeGear(int changeBy) {
    this.gear+=changeBy;

    }

    @Override
    public void accelerate(int speed) {
    this.speed+=speed;
    }

    @Override
    public void brake() {

    }
}
