public class Truck implements Vehicle{
    private String type;
    private int week;

    @Override
    public double calculateRentalCost() {
        return 500*week;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
    }

    @Override
    public void displayDetails() {
        System.out.println("Vehicle Type: Truck");
        System.out.println("Type: " + type);
        System.out.println("Rental Weeks: " + week);
        System.out.println("Rental Cost: $" + calculateRentalCost());
    }
}
