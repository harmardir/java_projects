import java.math.BigDecimal;
/**
 * 
 */

public class Car {

    public static int count = 0;

    private String make;
    private String model;
    private String color;
    private double price;
    private int year;
    /**
     * 
     * @param make
     * @param model
     * @param color
     * @param price
     * @param year
     */
    

    public Car(String make, String model, String color, double price, int year) {
    this.make = make;
    this.model = model;
    this.color = color;
    this.price = price;
    this.year = year;
    count++;
}



    /**
     * 
     */

    public Car() {
        this.make = "Undefiend";
        this.model = "Undefiend";
        this.color = "Undefiend";
        this.price = 0;
        count++;
}



    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



    @Override
    public String toString() {
        return "Car [color=" + color + ", make=" + make + ", model=" + model + ", price=" + price + ", year=" + year
                + "]";
    }
    

    
    
}
