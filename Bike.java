public class Bike implements Vehicle{
    private String brand;
    private int hour;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public Bike(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
    }

    @Override
    public double calculateRentalCost() {
        return 10*hour;
    }

    @Override
    public void displayDetails() {
        System.out.println("Vehicle Type: Bike");
        System.out.println("Brand: " + brand);
        System.out.println("Rental Hours: " + hour);
        System.out.println("Rental Cost: $" + calculateRentalCost());
    }
}
