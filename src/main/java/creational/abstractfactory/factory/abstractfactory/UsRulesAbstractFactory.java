package creational.abstractfactory.factory.abstractfactory;

import creational.abstractfactory.model.certificate.Certify;
import creational.abstractfactory.model.certificate.UsCertify;
import creational.abstractfactory.model.packing.Packing;
import creational.abstractfactory.model.packing.UsPacking;

public class UsRulesAbstractFactory implements CountryRulesAbstractFactory {
    @Override
    public Certify getCertificate() {
        return new UsCertify();
    }

    @Override
    public Packing getPack() {
        return new UsPacking();
    }
}
