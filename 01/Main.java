import java.util.Scanner;


class Person {

    String name;
    int age;

    //Method to display person's details
    public void display() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Car {

    String brand;
    String model;
    int year;

    //Method to display car's details
    public void displayCarInfo() {



        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);

    }
}

public class Main { 

    public static void main(String[] args) {

        //Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        //Create a Person object

        Person person1 = new Person();

        //Take input from the user
        System.out.println("Enter name: ");
        person1.name = sc.nextLine();

        //Take input from the user
        System.out.println("Enter age: ");
        person1.age = sc.nextInt();

        //Display the details
        System.out.println("Details: ");
        person1.display();

        //Create a Car object

        Car car1 = new Car();

        //Take input from the user
        System.out.println("Enter brand: ");
        car1.brand = sc.nextLine();
        System.out.println("Enter model: ");
        car1.model = sc.nextLine();
        System.out.println("Enter year: ");
        car1.year = sc.nextInt();

        //Display the details
        System.out.println("Car Details: ");
        car1.displayCarInfo();

        sc.close();
    }

    
}