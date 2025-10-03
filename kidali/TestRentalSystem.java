public class TestRentalSystem {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        Car c1 = new Car("KDD123", "Toyota");
        Car c2 = new Car("KDA456", "Honda");
        agency.addCar(c1);
        agency.addCar(c2);

        Customer cust1 = new Customer("Janet", "C001");

        agency.listCars();
        RentalTransaction t1 = new RentalTransaction(cust1, c1);
        t1.processRental();

        agency.listCars();
        t1.processReturn();
        agency.listCars();
    }
}

