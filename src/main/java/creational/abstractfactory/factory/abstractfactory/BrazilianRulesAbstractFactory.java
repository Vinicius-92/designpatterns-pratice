package creational.abstractfactory.factory.abstractfactory;

import creational.abstractfactory.model.certificate.BrazilianCertify;
import creational.abstractfactory.model.certificate.Certify;
import creational.abstractfactory.model.packing.BrazilianPacking;
import creational.abstractfactory.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {
    @Override
    public Certify getCertificate() {
        return new BrazilianCertify();
    }

    @Override
    public Packing getPack() {
        return new BrazilianPacking();
    }
}
