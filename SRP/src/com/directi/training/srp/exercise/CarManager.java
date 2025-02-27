import java.util.List;

public class CarManager {
    private CarRepository carRepository;
    private CarFormatter carFormatter;
    private CarComparator carComparator;

    public CarManager(CarRepository carRepository, CarFormatter carFormatter, CarComparator carComparator) {
        this.carRepository = carRepository;
        this.carFormatter = carFormatter;
        this.carComparator = carComparator;
    }

    public String getCarsNames() {
        List<Car> carsList = carRepository.getAllCars();
        return carFormatter.getCarsNames(carsList);
    }

    public Car getBestCar() {
        List<Car> carsList = carRepository.getAllCars();
        return carComparator.getBestCar(carsList);
    }

    public Car getById(String carId) {
        return carRepository.getById(carId);
    }
}