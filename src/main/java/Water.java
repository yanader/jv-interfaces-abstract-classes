public class Water extends Environment<Swimmable>{


    @Override
    public void checkTraffic() {
        for (Swimmable s : this.traffic) {
            System.out.println(s.getClass().getSimpleName() + " is swimming!");
        }
    }
}
