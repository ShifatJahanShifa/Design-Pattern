package concretefactory;

import chair.ModernChair;
import chairtablecoffeetableinterface.Chair;
import chairtablecoffeetableinterface.CoffeeTable;
import chairtablecoffeetableinterface.FurnitureFactory;
import chairtablecoffeetableinterface.Sofa;
import coffeetable.ModernCoffeeChair;
import sofa.ModernSofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeChair();
    }

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
