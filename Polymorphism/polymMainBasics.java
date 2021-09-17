
public class polymMainBasics {
    public static void main(String[] args) {
        Car c = new Car();
        Bicycle b = new Bicycle();
        Truck t = new Truck();

        Vehicle[] racers = { c, b, t };

        for (Vehicle x : racers) {
            x.Go();
        }
    }

}
