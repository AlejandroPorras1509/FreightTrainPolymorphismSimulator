public class TrainEngine extends TrainCar implements EngineLimits {
    //description of engine
    private String description;
    //power of engine
    private double power;

    //constructor
    private TrainEngine(String name, String description, double weight, int wheels, double power){
        super(name, weight, wheels);
        this.description = description;
        this.power = power;
    }
    
    //create method for user input and instance it win the constructor
    public static TrainEngine create() {
        //for input
        Scanner input = new Scanner(System.in);

        //Ask Name of engine
        System.out.print("Enter engine name: ");
        String name = input.nextLine();
        //validation
        boolean Confirmation = false;
        while (!Confirmation) {
            if (name.isBlank()) {
               System.out.print("Enter a valid engine name: ");
               name = input.nextLine();
            } else {
               Confirmation = true;
            }
        }

        //Ask Engine description
        System.out.print("Enter engine description: ");
        String description = input.nextLine();
        //validation
        Confirmation = false;
        while (!Confirmation) {
            if (description.isBlank()) {
               System.out.print("Enter a valid engine name: ");
               description = input.nextLine();
            } else {
               Confirmation = true;
            }
        }

        //Ask Engine weight
        System.out.print("Enter engine weight (100-250 tonnes): ");
        double weight = input.nextDouble();
        //validation
        Confirmation = false;
        while (!Confirmation) {
            if (weight < 100 || weight > 250) {
               System.out.print("Enter a valid engine weight (100-250): ");
               weight = input.nextDouble();
            } else {
               Confirmation = true;
            }
        }

        //Ask Engine wheels
        System.out.print("Enter number of wheels (8 or 12): ");
        int wheels = input.nextInt();
        //validation
        Confirmation = false;
        while (!Confirmation) {
            if (wheels == 8 || wheels == 12) {
                Confirmation = true;
            } else {
                System.out.print("Enter a valid ammount of wheels (8 or 12): ");
                wheels = input.nextInt();
            }
        }

        //Ask Engine power
        System.out.print("Enter engine power (600-3000 KW): ");
        double power = input.nextDouble();
        //validation
        Confirmation = false;
        while (!Confirmation) {
            if (power < 600 || power > 3000) {
               System.out.print("Enter a valid engine power (600-3000 KW): ");
               power = input.nextDouble();
            } else {
               Confirmation = true;
            }
        }
        return new TrainEngine(name, description, weight, wheels, power);
    }

    public double getDescription() {
        return power;
    }

    //calculate time to 100 kph
    @Override
    public double getTime100kph(double weight) {
        return weight / power * 400; 
    }
    
    //Convert values to string
    @Override
    public String toString() {
        return "Engine " + super.getName() + " with description " + description + ", weighs " + super.getWeight() + " tonnes, and a power of " + power + " KW.";
    }
}
