package car;

public class Car {
    private final String name;
    private int distance = 0;
    public Car(String name) {
        this.name = name;
    }

    public void go(int number) {
        if( number >= 4 ){
            distance++;
        }
    }

    public int getDistance() {
        return this.distance;
    }
}
