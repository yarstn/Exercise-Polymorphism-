import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> rentedVehicles = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice;
        do {
            displayMenu();
            choice = input.nextInt();
            input.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    rentCar(input, rentedVehicles);
                    viewRentedVehicles( rentedVehicles);
                    break;
                case 2:
                    rentBike(input, rentedVehicles);
                    break;
                case 3:
                    rentTruck(input, rentedVehicles);
                    break;
                case 4:
                    viewRentedVehicles( rentedVehicles);
                    break;
                case 5:
                    System.out.println("Thank you see you soon..");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        } while (choice != 5);
    }

private static void displayMenu() {
    System.out.println("Vehicle Rental System");
    System.out.println("1. Rent a Car");
    System.out.println("2. Rent a Bike");
    System.out.println("3. Rent a Truck");
    System.out.println("4. View Rented Vehicles");
    System.out.println("5. Exit");
    System.out.print("Enter your choice: ");
}
    private static void rentCar(Scanner scanner, List<Vehicle> rentedVehicles) {
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        System.out.print("Enter rental days: ");
        int days = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Vehicle car = new Car(model, days);
        rentedVehicles.add(car);
        System.out.println("Car rented successfully!");
    }
    private static void rentBike(Scanner scanner, List<Vehicle> rentedVehicles) {
        System.out.print("Enter bike brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter rental hours: ");
        int hours = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Vehicle bike = new Bike(brand, hours);
        rentedVehicles.add(bike);
        System.out.println("Bike rented successfully!");
    }

    private static void rentTruck(Scanner scanner, List<Vehicle> rentedVehicles) {
        System.out.print("Enter truck type: ");
        String type = scanner.nextLine();
        System.out.print("Enter rental weeks: ");
        int weeks = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Vehicle truck = new Truck(type, weeks);
        rentedVehicles.add(truck);
        System.out.println("Truck rented successfully!");
    }

    private static void viewRentedVehicles(List<Vehicle> rentedVehicles) {
        if (rentedVehicles.isEmpty()) {
            System.out.println("No rented vehicles found.");
        } else {
            System.out.println("***************************************");
            System.out.println("Rented Vehicles:");
            for (Vehicle vehicle : rentedVehicles) {
                vehicle.displayDetails();
                System.out.println();
            }
        }
    }}