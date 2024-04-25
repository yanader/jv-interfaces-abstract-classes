public class Road extends Environment<Drivable>{


    @Override
    public void checkTraffic() {
        for (Drivable drivable : this.traffic) {
            System.out.println(drivable.getClass().getSimpleName() + " is driving!");
        }
    }
}
