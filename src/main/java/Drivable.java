public interface Drivable extends Movable {


    default void drive() {
        System.out.println(this.getClass().getSimpleName() + " is driving!");
    }

    @Override
    default int[] getPosition() {
        return new int[0];
    }

    @Override
    default Direction getDirection() {
        return null;
    }
}
