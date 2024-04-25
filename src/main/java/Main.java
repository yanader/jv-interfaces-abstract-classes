import java.util.List;

public class Main {

    public static void main(String[] args) {

        Entities entities = new Entities();
        entities.movables.add(new Car(45));
        entities.movables.add(new Lorry(50));
        entities.movables.add(new Duck(10));

        entities.tick();


    }

}