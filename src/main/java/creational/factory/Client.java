package creational.factory;

import creational.factory.factory.IPhoneFactory;
import creational.factory.factory.IPhoneLevel;
import creational.factory.model.IPhoneGen;

public class Client {
    public static void main(String[] args) {
        var factory = new IPhoneFactory();
        System.out.println("### Ordering Iphone X Standard");
        var iphoneX = new IPhoneFactory().createIPhone(IPhoneGen.X, IPhoneLevel.Standard);
        System.out.println(iphoneX);
        System.out.println("\n\n###  Iphone 11 High-end");
        var iphone11 = new IPhoneFactory().createIPhone(IPhoneGen.Eleven, IPhoneLevel.HighEnd);
        System.out.println(iphone11);
    }
}
