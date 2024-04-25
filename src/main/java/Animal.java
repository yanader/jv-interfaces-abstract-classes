public abstract class Animal {
    int speed;
    int[] position = {0, 0};
    Direction direction = Direction.NORTH;

    public Animal(){
        this.speed = 5;
    }

    public Animal(int speed) {
        this.speed = speed;
    }

    abstract void makeSound();
}
