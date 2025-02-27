import java.util.List;

public class CarComparator {

    public Car getBestCar(List<Car> carsList) {
        Car bestCar = null;
        for (Car car : carsList) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }

}
