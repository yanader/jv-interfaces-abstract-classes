public interface Flyable extends Movable {

    default void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying!");
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
