}public class TestClass {
   public static void main(String[] args) {
      Train t = Train.create();
      t.applyBrake(0.5);
      System.out.printf("Time to reach 100kph: %.2f seconds\n", t.getTime100kph());
      if (t.getTime100kph() > 600)
         System.out.println("** Warning: Train is too heavy.");

 }
}