1.Star Pyramid.......StarPyramid
public class StarPyramid {
    public static void main(String[] args) {

        int n = 7; // number of rows

        System.out.println("Pyramid will look as follows:\n");

        for (int i = 1; i <= n; i++) {
            // print spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print stars for each row
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // move to the next line
            System.out.println();
        }

        // print your name and PRN at the end
        System.out.println("\nName: Pranjal Pankaj Padwal");
        System.out.println("PRN: 22458020115");
    }
}

2.Employee details.........Employee
class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    // Constructor
    Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    // Display employee details
    void display() {
        System.out.println("Employee details are:");
        System.out.println("Employee ID is: " + id);
        System.out.println("Employee name is: " + name);
        System.out.println("Employee designation is: " + designation);
        System.out.println("Employee salary is: " + salary);
    }

    // Main method
    public static void main(String[] args) {

        Employee e1 = new Employee(66, "Pranjal", "Cloud Engineer", 750000);

        e1.display();

        // Print your name and PRN at the end
        System.out.println("\nName: Pranjal Pankaj Padwal");
        System.out.println("PRN: 22458020115");
    }
}

3.Book with title auther.......Book
class Book {
    private String title;
    private String author;
    private double price;

    // Constructor
    Book(String t, String a, double p){
        title = t;
        author = a;
        price = p;
    }

    // Method to display book details
    void display(){
        System.out.println("Book details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("------------------");
    }

    public static void main(String[] args){
        // Creating two book objects
        Book b1 = new Book("Let us java", "Aman Ashraf", 69999.00);
        Book b2 = new Book("Animal", "Pranjal", 1000000.00);

        // Display book details
        b1.display();
        b2.display();

        // Print your name and PRN at the end
        System.out.println("Name: Pranjal Pankaj Padwal");
        System.out.println("PRN: 22458020115");
    }
}

4.Employee with data members encapsulated (updated salary).....Employee1
class Employee1 {
    private int empId;
    private String name;
    private double salary;

    Employee1(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    void display() {
        System.out.println("The employee ID is: " + empId);
        System.out.println("The employee name is: " + name);
        System.out.println("Employee salary is: Rs" + salary);
    }

    public static void main(String[] args) {
        Employee1 emp = new Employee1(66, "Pranjal Padwal", 750000);
        emp.display();

        emp.setSalary(755350); 
        System.out.println("The updated employee salary is: Rs" + emp.getSalary());

        // Print your name and PRN at the end
        System.out.println("\nName: Pranjal Pankaj Padwal");
        System.out.println("PRN: 22458020115");
    }
}

5.static and instance variables for diff datatypess.......DefaultValues
class DefaultValues {
    // Instance Variables
    int a;
    double b;
    boolean c;
    char d;
    String e;
    
    // Static Variables
    static int sa;
    static double sb;
    static boolean sc;
    static char sd;
    static String se;
    
    // Method to display default values of instance variables
    void displayInstanceVal() {
        System.out.println("Instance Variables:");
        System.out.println("int: " + a);
        System.out.println("double: " + b);
        System.out.println("boolean: " + c);
        System.out.println("char: " + d);
        System.out.println("String: " + e);
    }
    
    // Method to display default values of static variables
    static void displayStaticVal() {
        System.out.println("Static Variables:");
        System.out.println("int: " + sa);
        System.out.println("double: " + sb);
        System.out.println("boolean: " + sc);
        System.out.println("char: " + sd);
        System.out.println("String: " + se);
    }   
    
    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();
        
        // Display default values of instance variables
        obj.displayInstanceVal();
        
        // Display default values of static variables
        displayStaticVal();
        
        // Print your name and PRN at the end
        System.out.println("\nName: Pranjal Pankaj Padwal");
        System.out.println("PRN: 22458020115");
    } 
}

6.sample class for boxing and unboxing.... WrapperExample1 ........WrapperExample2
// Primitive to wrapper (int to Integer) boxing
class WrapperExample1 {
    public static void main(String args[]) {
        int a = 20;

        // Converting int to Integer
        Integer i = Integer.valueOf(a);

        // Autoboxing
        Integer j = a;

        System.out.println("Values: " + a + " " + i + " " + j);

        // Print your name and PRN at the end
        System.out.println("\nName: Pranjal Pankaj Padwal");
        System.out.println("PRN: 22458020115");
    }
}
//unboxing
class  WrapperExample2  {
    public static void main(String args[]) {
        Integer a = 66;

        // Unboxing
        int i = a.intValue();
        int j = a;

        System.out.println("Values: " + a + " " + i + " " + j);

        // Print your name and PRN at the end
        System.out.println("\nName: Pranjal Pankaj Padwal");
        System.out.println("PRN: 22458020115");
    }
}

7.demo app to show diff types of inheritance...............InheritanceDemo
class Vehicle {
	String brand;
	int speed;
	
	public Vehicle(String brand,int speed) {
		this.brand = brand;
		this.speed = speed;
	}
	
	public void showDetails(){
		System.out.println("Brand: "+ brand + ", Speed: " + speed + "km/h");
	}
}

class Car extends Vehicle {
	int doors;
	
	public Car (String brand,int speed, int doors) {
		super(brand, speed);
		this.doors = doors;
	}
	
	public void showCarDetails(){
		showDetails();
		System.out.println("Doors: " +doors);
	}
}

class ElectricCar extends Car{
	int batteryCapacity;
	
	public ElectricCar (String brand,int speed, int doors, int batteryCapacity){
		super(brand,speed,doors);
		this.batteryCapacity = batteryCapacity;
	}
	
	public void showElectricCarDetails() {
		showCarDetails ();
		System.out.println("Battery Capacity:" +batteryCapacity + "kWh" );
	}
}

class Bike extends Vehicle {
	String type;
	
	public Bike (String brand,int speed,String type) {
		super(brand, speed);
		this.type = type;
	}
	public void showBikeDetails() {
		showDetails();
		System.out.println("Type: " +type);
	}
}

public class InheritanceDemo {
	public static void main(String[]args) {
		System.out.println("\n--- Single Inheritance ---");
		Car car = new Car("Thar", 250, 4);
		car.showCarDetails();
		
		System.out.println("\n---multilevel Inheritance ---");
		ElectricCar eCar = new ElectricCar("Tesla",150, 5, 300);
		eCar.showElectricCarDetails();
		
		System.out.println("\n--- Hierarchical Inheritance ---");
		Bike bike = new Bike ("Honda", 100, "Standard bike");
		bike.showBikeDetails();		
		// Print your name and PRN at the end
        System.out.println("\nName: Pranjal Pankaj Padwal");
        System.out.println("PRN: 22458020115");
	}
}

8.multilevel inheritance (creating diff folders)
a>first
package users;

public class User {
    protected String name;
    protected String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

b>second
package app;

import customers.Customer;

public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer("Srushti", "srushti@example.com", "C123");
        cust.showCustomerDetails();
    }
}
c>
package customers;

import users.User;

public class Customer extends User {
    private String customerId;

    public Customer(String name, String email, String customerId) {
        super(name, email);  // Call parent constructor
        this.customerId = customerId;
    }

    public void showCustomerDetails() {
        showDetails();  // Method from User class
        System.out.println("Customer ID: " + customerId);
    }
} 

9.array of employee class with diff employee objects.......Employee
public class Employee {
    private int employeeId;
    private String name;
    private String department;

    // Constructor
    public Employee(int employeeId, String name, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
    }

    // Getter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        // Declare and initialize an array of Employee objects
        Employee[] employees = new Employee[3];

        // Initialize array elements with different Employee objects
        employees[0] = new Employee(101, "Alice Johnson", "Human Resources");
        employees[1] = new Employee(102, "Bob Williams", "Engineering");
        employees[2] = new Employee(103, "Charlie Brown", "Marketing");

        // Iterate through the array and display each employee's details
        System.out.println("Employee List:");
        for (Employee emp : employees) {
            emp.displayEmployeeDetails();
        }
    }
}

10.//BankAccount.java (encapsulation using access modifiers)........AccessModifierDemo
//BankAccount.java (encapsulation using access modifiers)
class BankAccount {
	private String accountHolderName; //private
	private double balance; //private
	
	public BankAccount(String accountHolderName, double initialBalance){
	this.accountHolderName = accountHolderName;
	this.balance = initialBalance;
	}
	
	public void deposit(double amount) {//Public: Accesible from anywhere
	if (amount>0) {
	balance+=amount;
	System.out.println("Deposit successful. New balance:" +balance);
	}
     }
	
	public double getBalance() {// Public getter to access private balance
	return balance;
	}
}
	
	//Main class to test acces modifiers
	public class AccessModifierDemo{
		public static void main(String[]args){
		BankAccount account = new BankAccount("Alice",5000);
		
			//account.balance = 10000;//Error:balance is private
			//System.out.println(account.accountHolderName); //Error:Private field
			
			//using public methods to access private fields
			account.deposit(2000);
			System.out.println("Current Balance:" + account.getBalance());
			}
	}

11.vehicle class hierarchy...........VehicleDemo
import java.util.Scanner;
// Base Class
class Vehicle {
    void start() {
        System.out.println("The vehicle is starting.");
    }
}
// Subclass 1 - Car
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("The car starts with a key or push button.");
    }
}
// Subclass 2 - Bike
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("The bike starts with a self-start or kick.");
    }
}
// subclass 1 - Truck
class Truck extends Vehicle {
    @Override
    void start() {
        System.out.println("The truck starts with a heavy-duty ignition system.");
    }
}

// Main Class
public class VehicleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a vehicle type to start:");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Truck");
        System.out.print("Enter your choice (1-3): ");

        int choice = scanner.nextInt();
        Vehicle myVehicle; // Superclass reference
        switch (choice) {
            case 1:
                myVehicle = new Car();
                break;
            case 2:
                myVehicle = new Bike();
                break;
            case 3:
                myVehicle = new Truck();
                break;
            default:
                System.out.println("Invalid choice! Defaulting to a generic vehicle.");
                myVehicle = new Vehicle();
                break;
        }

        myVehicle.start(); // Calls overridden method based on object type
        scanner.close();
    }
}

12.wait notify, notifyAll methods.........WaitNotifyDemo
class Message { 
 private String content; 
 private boolean available = false; 
 public synchronized void produce(String msg) { 
 while (available) { // Wait if message is not yet consumed 
 try { 
 wait(); 
 } catch (InterruptedException e) { 
 e.printStackTrace(); 
 } 
 } 
 content = msg; 
 available = true; 
 System.out.println("Produced: " + msg); 
 notify(); // Notify one consumer 
 } 
 public synchronized void consume() { 
 while (!available) { // Wait if no message is available 
 try { 
 wait(); 
 } catch (InterruptedException e) { 
 e.printStackTrace(); 
 } 
 } 
 System.out.println("Consumed: " + content); 
 available = false;
 notifyAll(); // Notify all producers/consumers 
 } 
} 
class Producer extends Thread { 
 private Message msg; 
 Producer(Message m) { 
 msg = m; 
 } 
 public void run() { 
 for (int i = 1; i <= 5; i++) { 
 msg.produce("Message " + i); 
 } 
 } 
} 
class Consumer extends Thread { 
 private Message msg; 
 Consumer(Message m) { 
 msg = m; 
 } 
 public void run() { 
 for (int i = 1; i <= 5; i++) { 
 msg.consume(); 
 } 
 } 
} 
public class WaitNotifyDemo { 
 public static void main(String[] args) { 
 Message m = new Message(); 
 Producer p = new Producer(m); 
 Consumer c = new Consumer(m); 
 p.start(); 
 c.start(); 
 } 
}

13.checked and unchecked exceptions......CustomExceptionDemo
// User-defined Checked Exception 
class InvalidAgeException extends Exception { 
 public InvalidAgeException(String message) { 
 super(message); 
 } 
} 
// User-defined Unchecked Exception 
class NegativeNumberException extends RuntimeException { 
 public NegativeNumberException(String message) { 
 super(message); 
 } 
} 
public class CustomExceptionDemo { 
 // Method that throws Checked Exception 
 public static void checkAge(int age) throws InvalidAgeException { 
 if (age < 18) { 
 throw new InvalidAgeException("Age must be 18 or above!"); 
 } else { 
 System.out.println("Valid Age: " + age); 
 } 
 }
 // Method that throws Unchecked Exception 
 public static void checkNumber(int num) { 
 if (num < 0) { 
 throw new NegativeNumberException("Negative numbers are not allowed!"); 
 } else { 
 System.out.println("Valid Number: " + num); 
 } 
 } 
 public static void main(String[] args) { 
 try { 
 checkAge(15); // This will throw checked exception 
 } catch (InvalidAgeException e) { 
 System.out.println("Caught Checked Exception: " + e.getMessage()); 
 } 
 try { 
 checkNumber(-10); // This will throw unchecked exception 
 } catch (NegativeNumberException e) { 
 System.out.println("Caught Unchecked Exception: " + e.getMessage()); 
 } 
 System.out.println("Program continues..."); 
 } 
}
