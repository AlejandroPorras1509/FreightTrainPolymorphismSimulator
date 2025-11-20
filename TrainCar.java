public abstract class TrainCar implements Coupler {
    //name of train car
    private String name;
    //weight of train car
    private double weight;
    //number of wheels on train car
    private int wheels;
    
    //constructor
    public TrainCar(String name, double weight, int wheels) {
        this.name = name;
        this.weight = weight;
        this.wheels = wheels;
    }

    //name getter
    public String getName() {
        return name;
    }

    //weight getter
    public double getWeight() {
        return weight;
    }

    //Brake method
    public String brake(double force) {
        //Create message
        String message = "";
        //validate input for
        if (force > 0 || force < 1) {
            message = "Brake Applied";
        } else {
            message = "Invalid force";
        }
        return message;
    }

    //Convert values to string
    @Override
    public String toString() {
        return "Train Car name: " + name + ", Weight: " + weight + " Tonns, Wheels: " + wheels + ".";
    }
}
