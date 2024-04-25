public class Space extends Environment<Floatable>{


    @Override
    public void checkTraffic() {

    }

    @Override
    public void checkVehicles() {
        for (Floatable floatable : this.traffic) {
            floatable.floating();
        }
    }
}
