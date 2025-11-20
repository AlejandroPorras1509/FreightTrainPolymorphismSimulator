import java.util.Scanner;

public class Caboose extends AdminCar {
    //constructor
    private Caboose(double weight){
        super("Caboose", weight, 8, 2);
    }

    //create method for user input and instance it win the constructor
    public static Caboose create() {
        //for user input   
        Scanner input = new Scanner(System.in);

        //Ask caboose weight
        System.out.print("Enter caboose weight (15-30 tonnes): ");
        double weight = input.nextDouble();
        //validation
        boolean Confirmation = false;
        while (!Confirmation) {
            if (weight < 15 || weight > 30) {
               System.out.print("Enter a valid caboose weight (15-30): ");
               weight = input.nextDouble();
            } else {
               Confirmation = true;
            }
        }
        return new Caboose(weight);
    }   

    //Convert values to string
    @Override
    public String toString() {
        return "Caboose weigths " + super.getWeight() + " tonns.";
    }
} 