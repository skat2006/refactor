public class Main {
    public static void main(String[] args) {
        WheelTransportInterface[] wheelTransport = new WheelTransportInterface[]{
                new Bicycle("Велосипед1", 3), //бывают же трехколесные, да?
                new Bicycle("Велосипед2", 2),
                new Car("Авто1", 4), //можно сразу в конструкторе написать 4 колеса, но бывает и 3 и 6 колес
                new Car("Авто2", 4),
                new Truck("Грузовик1", 6),
                new Truck("Грузовик2", 8),
        };

        for (WheelTransportInterface transport : wheelTransport) {
            transport.checkTransport();
        }
    }
}