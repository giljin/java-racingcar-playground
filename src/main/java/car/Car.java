package car;

public class Car {

    private final CarName name;
    private final Distance distance;
    public Car(String name) {
        this.distance = new Distance();
        this.name = new CarName(name);
    }

    public void go(int number) {
        if( number >= 4 ){
            distance.add();
        }
    }
    public CarName getName() {
        return name;
    }

    public Distance getDistance() { return this.distance; }

    public String moveView(){
        StringBuilder result = new StringBuilder(this.name + " : ");
        for (int i = 0; distance.compare(i) > 0; i++) {
            result.append("-");
        }
        return result.toString();
    }
}
