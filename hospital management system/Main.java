class Person {
    private int id;
    private String name;
    private int age;
    private String gender;

    // Constructor
    public Person(int id,String name,int age,String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class Patient extends Person {
    private String ailment;

    public Patient(int id,String name,int age,String gender,String ailment) {
        super(id,name,age,gender);
        this.ailment = ailment;
    }

    public String getAilment() {
        return ailment;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ailment: " + ailment);
    }
}

class Doctor extends Person {
    private String specialization;
    public Doctor(int id,String name,int age,String gender,String specialization) {
        super(id, name, age, gender);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}

// Appointment 
class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String date;

    public Appointment(Patient patient, Doctor doctor, String date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public void displayAppointmentDetails() {
        System.out.println("Appointment Details:");
        System.out.println("Patient :");
        patient.displayInfo();
        System.out.println("Doctor :");
        doctor.displayInfo();
        System.out.println("Date: " + date);
    }
}





public class Main {
    public static void main(String[] args) {
        
        Patient patient1 = new Patient(1,"John Doe", 25, "Male", "Cancer");
        Patient patient2 = new Patient(2,"Jane Doe", 30, "Female", "Flu");

        // Create doctors
        Doctor doctor1 = new Doctor(1,"Dr. Smith", 35, "Male", "Cardiology");
        Doctor doctor2 = new Doctor(2,"Dr. Johnson", 40, "Female", "Pediatrics");

        // Create appointments
        Appointment appointment1 = new Appointment(patient1, doctor1, "2023-08-15");
        Appointment appointment2 = new Appointment(patient2, doctor2, "2023-08-16");

        // Display Information
        appointment1.displayAppointmentDetails();
        System.out.println();
        appointment2.displayAppointmentDetails();
    }
}
