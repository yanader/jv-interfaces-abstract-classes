public class Car extends Vehicle implements Drivable{


    @Override
    void move() {
        System.out.println("The car is driving!");
    }
}
