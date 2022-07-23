public class Car extends WheelTransport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTransport() {
        System.out.println("Проверяем " + getModelName() + ":");
        updateTyre();
        checkEngine();
    }

    private void checkEngine() {
        System.out.println("- проверка двигателя");
    }


}