class Vehicle {
    protected String regnNumber;
    protected int speed;
     protected String color;
    protected String ownerName;

    public Vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
         this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    public void showData() {
        System.out.println("This is a vehicle class");
    }
}

class Bus extends Vehicle {
    private int routeNumber;

    public Bus(String regnNumber, int speed, String color, String ownerName, int routeNumber) {
         super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    @Override
    public void showData() {
         super.showData();

        System.out.println("Vehicle Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
         System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
         System.out.println("Route Number: " + routeNumber);
    }
}


class Car extends Vehicle {
    private String manufacturerName;

    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Vehicle Registration Number: " + regnNumber);
         System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
         System.out.println("Manufacturer Name: " + manufacturerName);
    }
}



public class assg2_que10 {
    public static void main(String[] args) {
        Bus bus = new Bus("mp09as4567", 30, "blue", "om bhai", 45);
        System.out.println("Bus Details ");
        bus.showData();

        Car car = new Car("mp10ms6789", 160, "Red", "om bhai", "Toyota");
        System.out.println("Car Details ");
        car.showData();
    }
}


