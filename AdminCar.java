public class AdminCar extends TrainCar {
    //total staff in admin car
    private int totalStaff;

    //constructor
    public AdminCar(String name, double weight, int wheels, int totalStaff) {
        super(name, weight, wheels);
        this.totalStaff = totalStaff;
    }

    //Convert values to string
    @Override
    public String toString() {
        return "Total staff " + totalStaff + ".";
    }
}
