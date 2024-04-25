public interface Movable {

    int getSpeed();

    int[] getPosition();

    Direction getDirection();

    void setPosition(int xOffset, int yOffset);
}
