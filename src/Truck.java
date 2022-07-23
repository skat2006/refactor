public class Truck extends WheelTransport implements WheelTransportInterface {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTransport() {
        System.out.println("Проверяем " + getModelName() + ":");
        updateTyre();
        checkEngine();
        checkTrailer();
    }

    public void checkEngine() {
        System.out.println("- проверка двигателя");
    }

    private void checkTrailer() {
        System.out.println("- проверка прицепа");
    }
}