public class Car {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }

    private void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Start Electricity");
    }
    private void startCommand() {
        System.out.println("Start Command");
    }
    private void startFuelSystem() {
        System.out.println("Start Fuel System");
    }
}
