package creational.factory.model;

public abstract class IPhone {

    public abstract void getHardware();

    public void assemble() {
        System.out.println("Assembling hardware");
    }

    public void certificates() {
        System.out.println("Testing certificates");
    }

    public void pack() {
        System.out.println("Packing the device");
    }
}
