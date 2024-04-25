public class Aeroplane extends Vehicle implements Flyable{

    @Override
    void move() {
        System.out.println("The plane is flying/moving!");
    }

//    @Override
//    public void fly() {
//        System.out.println("This is flying from inside the class");
//    }
}
