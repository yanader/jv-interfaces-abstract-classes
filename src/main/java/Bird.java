public abstract class Bird extends Animal implements Flyable {

    public Bird() {

    }

    public Bird(int speed) {
        super(speed);
    }

    @Override
    public int[] getPosition() {
        return this.position;
    }

    @Override
    public Direction getDirection() {
        return this.direction;
    }
}
