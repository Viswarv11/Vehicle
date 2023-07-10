 class Vehilce{
    public void start(){
        System.out.println("Vehicle Started");
    }
    public void stop(){
        System.out.println("Vehicle Stopped");
    }
}
class Motorcycle extends Vehilce{
    public void start(){
        System.out.println("Motorcycle Started");
    }
    public void stop(){
        System.out.println("Motorcycle Stopped");
    }
}
class Car extends Vehilce{
    public void start(){
        System.out.println("Car Started");
    }
    public void stop(){
        System.out.println("Car Stopped");
    }
}
public class Main {
    public static void main(String[] args) {
        Motorcycle motorcycle=new Motorcycle();
        motorcycle.start();
        Car car=new Car();
        car.stop();
    }
}
