import java.util.ArrayList;

public class RentalAgency {
    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void listCars() {
        System.out.println("Cars Available:");
        for(Car car : cars) {
            System.out.println(car.getModel() + " (" + car.getRegNumber() + ") - " +
                               (car.isAvailable() ? "Available" : "Rented"));
        }
    }
}

