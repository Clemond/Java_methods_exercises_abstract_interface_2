public class Main{
    public static void main(String[] args) {
        // Skapa ett interface som heter Vehicle med följande metoder:

        // void start();
        // void stop();
        // void accelerate(double speed)
        // void brake()

        // Skapa två nya klasser, Car och Bicycle som implementerar Vehicle-interfacet.
        // Implementera metoderna i varje klass så att de stämmer med Car och Bicycle.
        // I main, skapa två objekt av klasserna och kör metoderna.

        Car car1 = new Car();
        Bicycle bicycle1 = new Bicycle();

        car1.start();
        car1.accelerate(130);
        car1.brake();
        car1.stop();
        
        bicycle1.start();
        bicycle1.accelerate(25);
        bicycle1.brake();
        bicycle1.stop();

    }
}