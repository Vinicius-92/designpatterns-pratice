package creational.abstractfactory.model.packing;

public class BrazilianPacking implements Packing {
    @Override
    public String pack() {
        return "Packing in portuguese.";
    }
}
