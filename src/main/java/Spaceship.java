public class Spaceship extends Vehicle implements Flyable, Floatable{
    @Override
    public void floating() {
        System.out.println("The spaceship floats in space");
    }

    @Override
    public void fly() {
        System.out.println("The rocket takes off");
    }

    @Override
    void move() {
        System.out.println("The spaceship begins takeoff");
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
