import com.inventory.list.*;


public class Main{


    public static void main(final String[] args) {

        Car car1 = new Car();

        car1.make = "Ford";
        System.out.println("Car1 make: " + car1.make);
        System.out.println("Count of objects: " + (++Car.count));

        System.out.println();
        
        Car car2 = new Car();
        car2.make = "Chevy";
        System.out.println("Car2 make: " + car2.make);
        System.out.println("Count of objects: " + (++Car.count));
    
    } 

}


    

