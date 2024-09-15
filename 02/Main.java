import java.util.Scanner;

class Person {

    String name;
    int age;

    // Method to display name and age
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
}

class Car {

    String brand;
    String model;
    int year;

    // Method to display car details
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
public class Main {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int numPersons = 2;
    int numCars = 2;

    //Create arrays to hold person and Car objects
    Person[] persons = new Person[numPersons];
    Car[] cars = new Car[numCars];

    //Input and store Person objects
    for (int i = 0; i < numPersons; i++) {

        persons[i] = new Person();
        System.out.println("Enter name for person " + (i + 1) + " name: ");
        persons[i].name = sc.nextLine();
        System.out.println("Enter age for person " + (i + 1) + " age: ");
        persons[i].age = sc.nextInt();
        sc.nextLine(); // Clear the newline

    }

    //Input and store Car objects
    for (int i = 0; i < numCars; i++) {

        cars[i] = new Car();
        System.out.println("Enter brand for car " + (i + 1) + " brand: ");
        cars[i].brand = sc.nextLine();
        System.out.println("Enter model for car " + (i + 1) + " model: ");
        cars[i].model = sc.nextLine();
        System.out.println("Enter year for car " + (i + 1) + " year: ");
        cars[i].year = sc.nextInt();
        sc.nextLine(); // Clear the newline
        
      }

      //Display details of all Person objects
      System.out.println("Person Details:");
      for (Person person : persons) {

        person.display();

      }

      //Display details of all Car objects
      System.out.println("Car Details:");
      for (Car car : cars) {

        car.display();
      }

      sc.close();
 }

}