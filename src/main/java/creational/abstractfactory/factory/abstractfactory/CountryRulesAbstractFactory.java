package creational.abstractfactory.factory.abstractfactory;

import creational.abstractfactory.model.certificate.Certify;
import creational.abstractfactory.model.packing.Packing;

public interface CountryRulesAbstractFactory {
    Certify getCertificate();
    Packing getPack();
}
