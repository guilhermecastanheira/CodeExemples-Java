package dio;

/**
 * In this example we create a POO code
 */
public class Car {
    String color;
    String model;
    int    gastank_capacity;

    Car(){

    }

    Car(String color, String model, int gastank_capacity){
        this.color = color;
        this.model = model;
        this.gastank_capacity = gastank_capacity;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setGastank_capacity(int gastank_capacity) {
        this.gastank_capacity = gastank_capacity;
    }

    public int getGastank_capacity() {
        return gastank_capacity;
    }

    double tankValue(double gas_price_liter) {
        return gastank_capacity * gas_price_liter;
    }
}
