package creational.abstractfactory;

import creational.abstractfactory.factory.IPhoneFactory;
import creational.abstractfactory.factory.abstractfactory.BrazilianRulesAbstractFactory;
import creational.abstractfactory.factory.abstractfactory.CountryRulesAbstractFactory;
import creational.abstractfactory.factory.abstractfactory.UsRulesAbstractFactory;
import creational.abstractfactory.model.certificate.BrazilianCertify;
import creational.abstractfactory.model.certificate.UsCertify;
import creational.abstractfactory.model.enums.IPhoneGen;
import creational.abstractfactory.model.enums.IPhoneLevel;

public class Client {
    public static void main(String[] args) {
        var factory = new IPhoneFactory();
//        var rules = new UsRulesAbstractFactory();
        var rules = new BrazilianRulesAbstractFactory();
        System.out.println("### Ordering Iphone X Standard");
        var iphoneX = new IPhoneFactory().createIPhone(IPhoneGen.X, IPhoneLevel.Standard, rules);
        System.out.println(iphoneX);
        System.out.println("\n\n###  Iphone 11 High-end");
        var iphone11 = new IPhoneFactory().createIPhone(IPhoneGen.Eleven, IPhoneLevel.HighEnd, rules);
        System.out.println(iphone11);
    }
}
