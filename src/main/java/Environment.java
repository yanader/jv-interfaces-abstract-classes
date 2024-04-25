import java.util.ArrayList;
import java.util.List;

public abstract class Environment<T> {

    protected List<T> traffic = new ArrayList<>();

    public abstract void checkTraffic();

    public void checkVehicles() {
        for (T t : this.traffic)
            if (t instanceof Vehicle vehicle) {
                vehicle.move();
            }
    }

    public void addTraffic(T traffic) {
        this.traffic.add(traffic);
    }
}
