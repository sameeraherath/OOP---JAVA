import java.util.ArrayList;
import java.util.Scanner;

// student class
 class Student{
    int id;
    String name;
    String grade;

    // constructor
    public Student(int id,String name,String grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString(){

        return "student[ID=" + id + ", Name=" + name + ", Grade=" + grade + "]";

    }


}

class Teacher {
    int id;
    String name;
    String subject;

    public Teacher(int id,String name,String subject){
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    // toString method
    @Override
    public String toString(){
        return "teacher[ID=" + id + ", Name=" + name + ", Subject=" + subject + "]";
    }
}

class ClassRoom {
    String className;
    Teacher teacher;
    ArrayList<Student> students = new ArrayList<>(); // List of students in the class
    
    // constructor
    public ClassRoom(String className,Teacher teacher){
        this.className = className;
        this.teacher = teacher;
    }

    // Add a student to the class
    public void addStudent(Student student){
        students.add(student);
    }

    // Displays information about the classroom
    public void display(){
        System.out.println("Classroom: " + className);
        System.out.println("Teacher: " + teacher.name + " (" + teacher.subject + ")");
        System.out.println("Students:");

        for(Student student : students){
            System.out.println("- " + student.name + " (" + student.grade + ")");
        }
    }  

}

// Represents the school with students, teachers, and classrooms
class School{
    ArrayList<Student> students = new ArrayList<>(); // List of students in the school
    ArrayList<Teacher> teachers = new ArrayList<>(); // List of teachers in the school
    ArrayList<ClassRoom> classrooms = new ArrayList<>(); // List of classrooms in the school

    // Adds a student to the school
    public void addStudent(Student student){
        students.add(student);
    }

    // Adds a teacher to the school
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    // Adds a classroom to the school
    public void addClassroom(ClassRoom classroom){
        classrooms.add(classroom);
    }

    // Displays information about the school
    public void displayAllStudents(){
        System.out.println("All Students:");
        for(Student student : students){
            System.out.println("- " + student.toString());
        }
    }

    // Displays all teachers in the school
    public void displayAllTeachers(){
        System.out.println("All Teachers:");
        for(Teacher teacher : teachers){
            System.out.println("- " + teacher.toString());
        }
    }

    // Displays all classrooms and their details
    public void displayAllClassrooms(){
        System.out.println("All Classrooms:");
        for(ClassRoom classroom : classrooms){
            classroom.display();
        }
    }
}

// Main class to run the school management system
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        // Create a school object
        School school = new School();
        // Adding sample teachers

        Teacher teacher1 = new Teacher(1,"John Doe","Maths");
        Teacher teacher2 = new Teacher(2,"Jane Doe","Science");
        school.addTeacher(teacher1);
        school.addTeacher(teacher2);

        // Adding sample students
        Student student1 = new Student(1,"Alice","A");
        Student student2 = new Student(2,"Bob","B");
        Student student3 = new Student(3,"Charlie","C");
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        // Adding classrooms with teachers and students
        ClassRoom class1 = new ClassRoom("Grade 10", teacher1);
        class1.addStudent(student1);
        class1.addStudent(student2);
        school.addClassroom(class1);

        ClassRoom class2 = new ClassRoom("Grade 11", teacher2);
        class2.addStudent(student3);
        school.addClassroom(class2);

        // Menu to interact with the system
        while(true){
            System.out.println("\nSchool Management System");
            System.out.println("1. Display All Students");
            System.out.println("2. Display All Teachers");
            System.out.println("3. Display All Classes");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    school.displayAllStudents(); 
                    break;
                case 2:
                    school.displayAllTeachers();
                    break;
                case 3:
                    school.displayAllClassrooms();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

    }
}