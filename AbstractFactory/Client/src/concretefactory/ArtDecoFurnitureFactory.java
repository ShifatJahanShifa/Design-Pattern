package concretefactory;

import chair.ArtDecoChair;
import chairtablecoffeetableinterface.Chair;
import chairtablecoffeetableinterface.CoffeeTable;
import chairtablecoffeetableinterface.FurnitureFactory;
import chairtablecoffeetableinterface.Sofa;
import coffeetable.ArtDecoCoffeeTable;
import sofa.ArtDecoSofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}
