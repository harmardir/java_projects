public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car();
        //car1.setMake("Ford");
        
        System.out.println("Count of objects = " + (Car.count));

        System.out.println();

        Car car2 = new Car("Chevvy", "Corvette", "Red", 25090.5, 2020);

        System.out.println("Car2: " + car2);
       
    }
       
}
