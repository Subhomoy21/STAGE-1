    class Car {
    private String make;
    private String model;
    private int year;

    // Default constructor
    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    // Constructor with parameters
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter and Setter methods
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class lab {
    public static void main(String[] args) {
        // Creating an instance of the Car class using the default constructor
        Car car1 = new Car();

        // Creating an instance of the Car class using the constructor with parameters
        Car car2 = new Car("Toyota", "Camry", 2021);

        // Outputting the values of the car1 object
        System.out.println("Car 1 make: " + car1.getMake());
        System.out.println("Car 1 model: " + car1.getModel());
        System.out.println("Car 1 year: " + car1.getYear());

        // Outputting the values of the car2 object
        System.out.println("Car 2 make: " + car2.getMake());
        System.out.println("Car 2 model: " + car2.getModel());
        System.out.println("Car 2 year: " + car2.getYear());
    }

}
