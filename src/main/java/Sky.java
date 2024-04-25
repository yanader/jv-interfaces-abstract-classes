public class Sky extends Environment<Flyable>{
    int speedLimit = 150;

    @Override
    public void checkTraffic() {
        for (Flyable f : this.traffic) {
            int speed = Math.min(this.speedLimit, f.getSpeed());
            System.out.println(f.getClass().getSimpleName() + " is flying at " + speed + "mph!");
        }
    }
}
