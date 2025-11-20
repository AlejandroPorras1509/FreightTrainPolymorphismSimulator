//import scanner utility
import java.util.Scanner;

public class FreightCar extends TrainCar {
    //type of freight car
    private String type;

    //constructor
    private FreightCar(String name, String type, double weight){
        super(name, weight, 12);
        this.type = type;
    }

    //create method for user input and instance it win the constructor
    public static FreightCar create() {
        //for user input
        Scanner input = new Scanner(System.in);

        //Type of freight car
        System.out.print("Enter type of the freight car (boxcar, flatbed or tanker): ");
        String type = input.nextLine();
        boolean Confirmation = false;
        while (!Confirmation) {
            if (type.equalsIgnoreCase("boxcar") || type.equalsIgnoreCase("flatbed") || type.equalsIgnoreCase("tanker")) {
               Confirmation = true;
            } else{
               System.out.print("Enter a valid freight car name (boxcar, flatbed or tanker): ");
               type = input.nextLine();
            }
        }

        //Name of freight car
        System.out.print("Enter name of the freight car: ");
        String name = input.nextLine();
        Confirmation = false;
        while (!Confirmation) {
            if (name.isBlank()) {
               System.out.print("Enter a valid freight car name: ");
               name = input.nextLine();
            } else {
               Confirmation = true;
            }
        }

        //Ask freight car weight
        System.out.print("Enter freight car (1-130 tonnes): ");
        double weight = input.nextDouble();
        Confirmation = false;
        while (!Confirmation) {
            if (weight < 1 || weight > 130) {
               System.out.print("Enter a valid freight car weight (1-130): ");
               weight = input.nextDouble();
            } else {
               Confirmation = true;
            }
        }
        
        return new FreightCar(name, type, weight);
    }

    //Convert values to string
    @Override
    public String toString() {
        return "Freight Car name: " + super.getName() + ", Type: " + type + ", Weight: " + super.getWeight() + " Tonns.";
    }
}
