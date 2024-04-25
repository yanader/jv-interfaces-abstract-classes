public class Aeroplane extends Vehicle implements Flyable{

    @Override
    void move() {
        System.out.println("The plane is flying/moving!");
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
