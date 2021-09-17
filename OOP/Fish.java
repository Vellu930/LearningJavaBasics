
public class Fish implements Predator, Prey {

    @Override
    public void hunt() {
        System.out.println("Large fish is hunting smaller fish!");
    }

    @Override
    public void flee() {
        System.out.println("Small fish is fleeing.");
    }

}
