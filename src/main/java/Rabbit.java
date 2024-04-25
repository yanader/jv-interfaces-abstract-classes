public class Rabbit extends Animal implements Jumpable{
    @Override
    void makeSound() {
        System.out.println("The rabbit makes no noise");
    }

    @Override
    public void jump() {
        System.out.println("The rabbit jumps");
    }
}
