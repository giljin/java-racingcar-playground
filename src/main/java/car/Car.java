package car;

public class Car {

    private final int FORWORD_NUMBER = 4;

    private final CarName name;
    private final Distance distance;
    public Car(String name) {
        this.distance = new Distance();
        this.name = new CarName(name);
    }

    public void go(int randomNumber) {
        if( randomNumber >= FORWORD_NUMBER ){
            distance.add();
        }
    }
    public CarName getName() {
        return name;
    }

    public Distance getDistance() { return this.distance; }

    public String moveView(){
        StringBuilder result = new StringBuilder(this.name + " : ");
        for (int i = 0; distance.compare(new Distance(i)) > 0; i++) {
            result.append("-");
        }
        return result.toString();
    }
}
