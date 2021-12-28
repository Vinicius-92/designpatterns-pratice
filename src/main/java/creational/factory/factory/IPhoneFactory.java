package creational.factory.factory;

import creational.factory.model.*;

import java.util.InputMismatchException;

public class IPhoneFactory {
    public IPhone createIPhone(IPhoneGen gen, IPhoneLevel level) {
        IPhone iphone = null;
        if (gen.equals(IPhoneGen.X))
            iphone = IPhoneLevel.HighEnd.equals(level) ? new IPhoneXSMax() : new IPhoneX();
        if (gen.equals(IPhoneGen.Eleven))
            iphone = IPhoneLevel.HighEnd.equals(level) ? new IPhone11Pro() : new IPhone11();

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
