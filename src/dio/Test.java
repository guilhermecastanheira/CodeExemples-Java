package dio;

public class Test {
    public static void main (String[] args) {
        //EXAMPLE - 1
        //create object car
        Car car = new Car("white", "VWGolf", 50);

        //print parameters of car
        System.out.println(car.getColor());
        System.out.println(car.getModel());
        System.out.println(car.getGastank_capacity());
        System.out.println(car.tankValue(6.54));


        //Upcast
        Vehicle vehicle_car = new Car();
        Vehicle vehicle_motorcycle = new Motorcycle();
        Vehicle vehicle_truck = new Truck();

        //Polymorphism
        Vehicle[] vehicles = new Vehicle[]{new Vehicle(), new Motorcycle(), new Car(), new Truck()};
         for(Vehicle vehicle: vehicles) {
             vehicle.wheels_number();
         }
        for(Vehicle vehicle: vehicles) {
            vehicle.motor();
        }


    }
}
