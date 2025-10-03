public class Car {
    private String regNumber;
    private String model;
    private boolean isAvailable;

    public Car(String regNumber, String model) {
        this.regNumber = regNumber;
        this.model = model;
        this.isAvailable = true; // default
    }

    public String getRegNumber() { return regNumber; }
    public String getModel() { return model; }
    public boolean isAvailable() { return isAvailable; }

    public void rentCar() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(model + " rented successfully.");
        } else {
            System.out.println(model + " is not available.");
        }
    }

    public void returnCar() {
        isAvailable = true;
        System.out.println(model + " returned successfully.");
    }
}
