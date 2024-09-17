// Car class
class Car {

    private String brand;
    private String model;
    private int year;

    // Constructor to initialize fields

    public Car (String brand, String model, int year) {

        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getter and Setter method (encapsulation) 

    public String getBrand() {

        return brand; 
    }

    public void setBrand(String brand) {

        this.brand = brand;
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

    // Method to display car details

    public void displayCarDetails() {

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}



// using inheritance
class ElectricCar extends Car {

    private int batteryCapacity;

    // Constructor to initialize fields

    public ElectricCar (String brand, String model, int year, int batteryCapacity) {

        super(brand, model, year);
        this.batteryCapacity = batteryCapacity;

    }

    // Method overriding (polymorphism)

    @Override
    public void displayCarDetails() {

        super.displayCarDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

}

public class Main {

    public static void main(String[] args) {
        
        // Creating objects

        Car car = new Car("Toyota", "Camry", 2022);
        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 2020, 100);

        // Displaying car details
        System.out.println("Car Details: ");
        car.displayCarDetails();
        System.out.println("Electric Car Details: ");
        electricCar.displayCarDetails();


    }
}