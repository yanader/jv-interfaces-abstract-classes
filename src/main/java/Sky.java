public class Sky extends Environment<Flyable>{


    @Override
    public void checkTraffic() {
        for (Flyable f : this.traffic) {
            System.out.println(f.getClass().getSimpleName() + " is flying!");
        }
    }
}
