public class RentalTransaction {
    private Customer customer;
    private Car car;

    public RentalTransaction(Customer customer, Car car) {
        this.customer = customer;
        this.car = car;
    }

    public void processRental() {
        if (car.isAvailable()) {
            car.rentCar();
            System.out.println("Customer " + customer.getName() + " rented " + car.getModel());
        } else {
            System.out.println("Car already rented.");
        }
    }

    public void processReturn() {
        car.returnCar();
        System.out.println("Customer " + customer.getName() + " returned " + car.getModel());
    }
}

