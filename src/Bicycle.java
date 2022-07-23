public class Bicycle extends WheelTransport implements WheelTransportInterface {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTransport() {
        System.out.println("Проверяем " + getModelName() + ":");
        updateTyre();
    }
}