public class Bicycle implements Vehicle {

    @Override
    public void start() {
        System.out.println("I am starting to ride my bicycle");
    }

    @Override
    public void stop() {
        System.out.println("I am stopping on my bicycle");
    }

    @Override
    public void accelerate(double speed) {
        System.out.println("Im accelerating to " + speed + "mph");
    }

    @Override
    public void brake() {
        System.out.println("Im braking on my bicycle");
    }
    
}
