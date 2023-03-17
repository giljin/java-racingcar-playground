package car;

import java.util.*;

public class RacingGame {
    private final int playCount;
    private final List<Car> carList = new ArrayList<>();

    public RacingGame(int playCount) {
        if( playCount < 1 ){
            throw new IllegalArgumentException("1회이상 작동해야합니다");
        }
        this.playCount = playCount;
    }

    public void join(Car oh) {
        if( containCar(oh.getName()) ){
            return;
        }
        carList.add(oh);
    }

    public boolean containCar(CarName carName) {
        return carList.stream()
                .map(Car::getName)
                .anyMatch(name -> name.equals(carName));
    }

    public List<Car> findWinners() {
        Distance maxDistance = new Distance(0);
        for (Car car : carList) {
            Distance carDistance = car.getDistance();
            if( maxDistance.compare(carDistance) < 1 ){
                maxDistance = carDistance;
            }
        }

        List<Car> result = new ArrayList<>();
        for (Car car : carList){
            if( car.getDistance().equals(maxDistance) ){
                result.add(car);
            }
        }

        return result;
    }

    public void play() {

        for (int i = 0; i < playCount; i++) {
            goAllCar();
        }
    }

    private void goAllCar(){
        Random random = new Random();
        for (Car car : carList) {
            car.go(random.nextInt(10));
            System.out.println(car.moveView());
        }
        System.out.println();
    }
}
