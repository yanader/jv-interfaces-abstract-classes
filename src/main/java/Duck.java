public class Duck extends Bird implements Swimmable, Floatable{

    public Duck() {
    }

    public Duck(int speed) {
        super(speed);
    }

    @Override
    void makeSound() {
        System.out.println("Quack Quack!");
    }

    @Override
    public void floating() {
        System.out.println("Duck in pond");
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int[] getPosition() {
        return this.position;
    }

    @Override
    public Direction getDirection() {
        return this.direction;
    }

    @Override
    public void setPosition(int xOffset, int yOffset) {
        this.position[0] += xOffset;
        this.position[1] += yOffset;
    }
}
