package creational.abstractfactory.factory;

import creational.abstractfactory.factory.abstractfactory.CountryRulesAbstractFactory;
import creational.abstractfactory.model.enums.IPhoneGen;
import creational.abstractfactory.model.enums.IPhoneLevel;
import creational.abstractfactory.model.iphone.*;

import java.util.InputMismatchException;

public class IPhoneFactory {
    public IPhone createIPhone(IPhoneGen gen, IPhoneLevel level, CountryRulesAbstractFactory rules) {
        IPhone iphone = null;
        if (gen.equals(IPhoneGen.X))
            iphone = IPhoneLevel.HighEnd.equals(level) ? new IPhoneXSMax(rules) : new IPhoneX(rules);
        if (gen.equals(IPhoneGen.Eleven))
            iphone = IPhoneLevel.HighEnd.equals(level) ? new IPhone11Pro(rules) : new IPhone11(rules);

        if (iphone !=  null) {
            iphone.getHardware();
            iphone.assemble();
            iphone.certificates();
            iphone.pack();
            return iphone;
        }
        throw new InputMismatchException("Invalid entries");
    }
}
