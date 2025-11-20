public class Train {
    //for user input
    Scanner input = new Scanner(System.in);

    //train number of cars
    private int numCars;
    //train name
    private String name;
    //list of train cars
    private ArrayList<TrainCar> cars = new ArrayList<TrainCar>();

    //constructor
    private Train(String name, int size){
        this.numCars = size;
        this.name = name;

        //add cars in base of the user ammount to the list
        for (int i = 0; i < size; i++) {
            System.out.print("Add car type (engine/freight/caboose): ");
            String type = input.nextLine();
            switch (type) {
                case "engine":
                    cars.add(TrainEngine.create());
                    break;
                case "freight":
                    cars.add(FreightCar.create());
                    break;
                case "caboose":
                    cars.add(Caboose.create());
                    break;
                default:
                    System.out.print("Add a valid car type (engine/freight/caboose): ");
                    type = input.nextLine();
            }
        }
    }

    //create method for user input and instance it win the constructor
    public static Train create() {   
        //for user input
        Scanner input = new Scanner(System.in);

        //train name
        System.out.print("Enter train name: ");
        String name = input.nextLine();
        //validation
        boolean Confirmation = false;
        while (!Confirmation) {
            if (name.isBlank()) {
               System.out.print("Enter a valid train name: ");
               name = input.nextLine();
            } else {
               Confirmation = true;
            }
        }

        //number of cars
        System.out.print("Enter number of cars: ");
        int size = input.nextInt();
        //validation
        Confirmation = false;
        while (!Confirmation) {
            if (size <= 0) {
               System.out.print("Enter a valid size: ");
               size = input.nextInt();
            } else {
               Confirmation = true;
            }
        }
        return new Train(name, size);
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        for (TrainCar car : cars) {
            totalWeight += car.getWeight();
        }
        return totalWeight;
    }

    public double getTime100kph() {
        double totalWeight = 0;
        double totalPower = 0;
        for (TrainCar car : cars) {
            totalWeight += car.getWeight();
            if (car instanceof TrainEngine) {
                totalPower += ((TrainEngine) car).getDescription();
            }
        }
        return (totalWeight / totalPower) * 400;
    }

    public void applyBrake(double deceleration) {
        //Create message
        String message = "";

        //validate input
        if (deceleration > 0 || deceleration < 1) {
            for (TrainCar car : cars) {
                System.out.println(car.brake(deceleration));
                System.out.println(car.toString());
            }
        } else {
            message = "Invalid value";
        }
    }
    //Convert values to string
    @Override
    public String toString() {
        return "Train " + name + " with " + numCars + " cars.";
    }
}