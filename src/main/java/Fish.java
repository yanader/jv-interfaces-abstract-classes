public class Fish extends Animal implements Swimmable{


    @Override
    void makeSound() {
        System.out.println("The fish makes no sound.");
    }
}
