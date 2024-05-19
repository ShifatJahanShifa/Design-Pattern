package concretefactory;

import chair.VictorianChair;
import chairtablecoffeetableinterface.Chair;
import chairtablecoffeetableinterface.CoffeeTable;
import chairtablecoffeetableinterface.FurnitureFactory;
import chairtablecoffeetableinterface.Sofa;
import coffeetable.VictorianCoffeeChair;
import sofa.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeChair();
    }
}
