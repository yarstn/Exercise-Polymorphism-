public class Car implements Vehicle{
    private String model;
    private int days;
    @Override
    public double calculateRentalCost() {
        return 50*days;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }

    @Override
    public void displayDetails() {
        System.out.println("Vehicle Type: Car");
        System.out.println("Model: " + model);
        System.out.println("Rental Days: " + days);
        System.out.println("Rental Cost: $" + calculateRentalCost());
    }
}
