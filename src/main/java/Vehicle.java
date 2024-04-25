public abstract class Vehicle {
    int speed;
    int[] position = {0, 0};
    Direction direction = Direction.NORTH;

    public Vehicle() {
        this.speed = 30;
    }

    public Vehicle(int speed) {
        this.speed = speed;
    }

    abstract void move();

}
