public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts");
    }

    @Override
    public void stop() {
        System.out.println("Car turns off");
    }

    @Override
    public void accelerate(double speed) {
        System.out.println("car in now accelerating to " + speed + "mph");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking");
    }
    
}
