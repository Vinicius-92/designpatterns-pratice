package creational.abstractfactory.model.iphone;

import creational.abstractfactory.factory.abstractfactory.CountryRulesAbstractFactory;

public abstract class IPhone {

    CountryRulesAbstractFactory countryRules;

    public IPhone(CountryRulesAbstractFactory rules) {
        this.countryRules = rules;
    }
    public abstract void getHardware();

    public void assemble() {
        System.out.println("Assembling hardware");
    }

    public void certificates() {
        System.out.println("Testing certificates");
        System.out.println("  *  " + countryRules.getCertificate().certify());
    }

    public void pack() {
        System.out.println("Packing the device");
        System.out.println("  *  " + countryRules.getPack().pack());
    }
}
