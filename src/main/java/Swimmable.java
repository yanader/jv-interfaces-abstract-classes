public interface Swimmable extends Movable {

    default void swim() {
        System.out.println(this.getClass().getSimpleName() + " is swimming!");
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

