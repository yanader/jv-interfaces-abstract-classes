import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Entities {
    List<Movable> movables;
    List<Environment<?>> environments;

    public Entities() {
        this.movables = new ArrayList<>();
        this.environments = new ArrayList<>();
    }

    void tick() {
        for (Movable movable: movables) {
//            movable.position
            if (movable.getDirection() == Direction.NORTH) {
                movable.setPosition(0, movable.getSpeed());
            } else if (movable.getDirection() == Direction.SOUTH) {
                movable.setPosition(0, -1 * movable.getSpeed());
            } else if (movable.getDirection() == Direction.EAST) {
                movable.setPosition(movable.getSpeed(), 0);
            } else if (movable.getDirection() == Direction.WEST) {
                movable.setPosition(-1 * movable.getSpeed(), 0);
            }

            System.out.println(Arrays.toString(movable.getPosition()));
        }
    }
}
