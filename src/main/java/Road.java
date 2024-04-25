import java.util.List;

public class Road extends Environment<Drivable>{
    int speedLimit;

    public Road(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    @Override
    public void checkTraffic() {
        for (Drivable drivable : this.traffic) {
            int speed = Math.min(drivable.getSpeed(), this.speedLimit);
            System.out.println(drivable.getClass().getSimpleName() + " is driving at " + speed + "mph!");
        }
    }

    public void checkSpeeds() {
        for (Drivable drivable: this.traffic) {

            int speed = Math.min(drivable.getSpeed(), this.speedLimit);
            System.out.println(drivable.getClass().getSimpleName() + " driving at " + speed + "mph");
        }
    }

}
