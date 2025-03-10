import java.util.List;

public class CarFormatter {

    public String getCarsNames(List<Car> carsList) {
        StringBuilder sb = new StringBuilder();
        for (Car car : carsList) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

}
