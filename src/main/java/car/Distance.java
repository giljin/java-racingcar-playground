package car;

import java.util.Objects;

public class Distance {
    private int distance;

    public Distance(){
        this(0);
    }
    public Distance(int distance) {
        if (distance < 0){
            throw new IllegalArgumentException("0보다 작은수는 올 수 없습니다");
        }
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Distance distance1 = (Distance) o;
        return distance == distance1.distance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(distance);
    }

    public void add() {
        distance++;
    }


    public int compare(int number) {
        return Integer.compare(distance, number);
    }
}
