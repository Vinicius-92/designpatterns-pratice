package creational.abstractfactory.model.iphone;

import creational.abstractfactory.factory.abstractfactory.CountryRulesAbstractFactory;

public abstract class IPhone {

    CountryRulesAbstractFactory factory;

    public IPhone(CountryRulesAbstractFactory rules) {
        this.factory = rules;
    }
    public abstract void getHardware();

    public void assemble() {
        System.out.println("Assembling hardware");
    }

    public void certificates() {
        System.out.println("Testing certificates");
        System.out.println("  *  " + factory.getCertificate().certify());
    }

    public void pack() {
        System.out.println("Packing the device");
        System.out.println("  *  " + factory.getPack().pack());
    }
}
