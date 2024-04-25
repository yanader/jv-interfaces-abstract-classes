public class Frog extends Animal implements Jumpable{



    @Override
    void makeSound() {
        System.out.println("Frog says ribbit!");
    }

    @Override
    public void jump() {
        System.out.println("The frog hops");
    }
}
