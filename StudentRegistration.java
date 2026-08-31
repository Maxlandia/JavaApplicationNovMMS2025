import java.util.*;
import java.time.LocalDate;
import java.time.Period;

// ==================== ENUMS ====================
enum Gender { MALE, FEMALE, OTHER }
enum Level { ND1, ND2, HND1, HND2, L100, L200, L300, L400 }
enum Role { STUDENT, TEACHER, ADMIN, ACCOUNTANT }
enum Grade { A, B, C, D, F }

// ==================== INTERFACES ====================
interface Payable {
    double calculatePayment();
}

interface Printable {
    void printDetails();
}

interface Loginable {
    boolean login(String username, String password);
}

// ==================== ABSTRACT PERSON ====================
abstract class Person implements Printable {
    protected String id;
    protected String firstName;
    protected String lastName;
    protected Gender gender;
    protected String phone;
    protected String email;

    public Person(String id, String firstName, String lastName, Gender gender, String phone, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public abstract Role getRole();
    public abstract void displayRole();

    @Override
    public void printDetails() {
        System.out.println("ID    : " + id);
        System.out.println("Name  : " + getFullName());
        System.out.println("Gender: " + gender);
        System.out.println("Phone : " + phone);
        System.out.println("Email : " + email);
    }
}

// ==================== STUDENT ====================
class Student extends Person implements Payable {
    private LocalDate dateOfBirth;
    private String department;
    private Level level;
    private double gpa;
    private List<Double> scores = new ArrayList<>();

    public Student(String id, String firstName, String lastName, Gender gender,
                   String phone, String email, LocalDate dob, String dept, Level level) {
        super(id, firstName, lastName, gender, phone, email);
        this.dateOfBirth = dob;
        this.department = dept;
        this.level = level;
    }

    public void addScore(double score) {
        if (score < 0 || score > 100) throw new InvalidScoreException("Score must be 0-100");
        scores.add(score);
        recalculateGPA();
    }

    private void recalculateGPA() {
        if (scores.isEmpty()) {
            gpa = 0;
            return;
        }
        double sum = 0;
        for (double s : scores) sum += s;
        gpa = sum / scores.size() / 25.0; // rough 4.0 scale
    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    @Override
    public Role getRole() { return Role.STUDENT; }

    @Override
    public void displayRole() {
        System.out.println("Role: Student | Dept: " + department + " | Level: " + level + " | GPA: " + String.format("%.2f", gpa));
    }

    @Override
    public double calculatePayment() {
        return 150000; // school fees
    }

    @Override
    public void printDetails() {
        super.printDetails();
        displayRole();
        System.out.println("Age: " + getAge());
    }

    public String getId() { return id; }
    public double getGpa() { return gpa; }
    public String getDepartment() { return department; }
}

// ==================== TEACHER ====================
class Teacher extends Person implements Payable {
    private String subject;
    private double salary;

    public Teacher(String id, String firstName, String lastName, Gender gender,
                   String phone, String email, String subject, double salary) {
        super(id, firstName, lastName, gender, phone, email);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public Role getRole() { return Role.TEACHER; }

    @Override
    public void displayRole() {
        System.out.println("Role: Teacher | Subject: " + subject + " | Salary: " + salary);
    }

    @Override
    public double calculatePayment() {
        return salary;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        displayRole();
    }
}

// ==================== ADMIN ====================
class Administrator extends Person {
    public Administrator(String id, String firstName, String lastName, Gender gender, String phone, String email) {
        super(id, firstName, lastName, gender, phone, email);
    }

    @Override
    public Role getRole() { return Role.ADMIN; }

    @Override
    public void displayRole() {
        System.out.println("Role: Administrator");
    }

    @Override
    public void printDetails() {
        super.printDetails();
        displayRole();
    }
}

// ==================== CUSTOM EXCEPTIONS ====================
class InvalidScoreException extends RuntimeException {
    public InvalidScoreException(String message) { super(message); }
}

class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) { super(message); }
}

// ==================== MAIN SYSTEM ====================
public class SchoolManagementSystem {

    private static Map<String, Student> studentMap = new HashMap<>();
    private static List<Teacher> teachers = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Seed some data
        seedData();

        System.out.println("===== SCHOOL MANAGEMENT SYSTEM (CORE FINISHED PRODUCT) =====");
        System.out.println("This covers OOP + Inheritance + Abstraction + Interfaces + Polymorphism");
        System.out.println("+ Enums + Collections + Exceptions\n");

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Add Score to Student");
            System.out.println("5. View Teachers");
            System.out.println("6. Polymorphism Demo");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1 -> addStudent();
                    case 2 -> viewAllStudents();
                    case 3 -> searchStudent();
                    case 4 -> addScore();
                    case 5 -> viewTeachers();
                    case 6 -> polymorphismDemo();
                    case 0 -> {
                        System.out.println("Goodbye.");
                        return;
                    }
                    default -> System.out.println("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void seedData() {
        Student s1 = new Student("S001", "Ada", "Lovelace", Gender.FEMALE, "08012345678",
                "ada@school.com", LocalDate.of(2004, 5, 12), "Computer Science", Level.HND2);
        s1.addScore(85);
        s1.addScore(78);
        studentMap.put(s1.getId(), s1);

        teachers.add(new Teacher("T001", "Alan", "Turing", Gender.MALE, "08098765432",
                "turing@school.com", "Algorithms", 450000));
    }

    private static void addStudent() {
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("First Name: ");
        String fn = sc.nextLine();
        System.out.print("Last Name: ");
        String ln = sc.nextLine();
        System.out.print("Department: ");
        String dept = sc.nextLine();

        Student s = new Student(id, fn, ln, Gender.OTHER, "N/A", "N/A",
                LocalDate.of(2005, 1, 1), dept, Level.ND1);
        studentMap.put(id, s);
        System.out.println("Student added.");
    }

    private static void viewAllStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No students.");
            return;
        }
        for (Student s : studentMap.values()) {
            s.printDetails();
            System.out.println("-----");
        }
    }

    private static void searchStudent() throws StudentNotFoundException {
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();
        Student s = studentMap.get(id);
        if (s == null) throw new StudentNotFoundException("Student " + id + " not found");
        s.printDetails();
    }

    private static void addScore() throws StudentNotFoundException {
        System.out.print("Student ID: ");
        String id = sc.nextLine();
        Student s = studentMap.get(id);
        if (s == null) throw new StudentNotFoundException("Student not found");
        System.out.print("Score: ");
        double score = sc.nextDouble();
        sc.nextLine();
        s.addScore(score);
        System.out.println("Score added. New GPA: " + s.getGpa());
    }

    private static void viewTeachers() {
        for (Teacher t : teachers) {
            t.printDetails();
            System.out.println("-----");
        }
    }

    private static void polymorphismDemo() {
        List<Person> people = new ArrayList<>();
        people.addAll(studentMap.values());
        people.addAll(teachers);
        people.add(new Administrator("A001", "Sarah", "Connor", Gender.FEMALE, "08000000000", "admin@school.com"));

        System.out.println("\n===== POLYMORPHISM DEMO =====");
        for (Person p : people) {
            p.displayRole();
            if (p instanceof Payable payable) {
                System.out.println("Payment: " + payable.calculatePayment());
            }
            System.out.println();
        }
    }
}