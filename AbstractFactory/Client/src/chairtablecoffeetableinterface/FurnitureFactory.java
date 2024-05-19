package chairtablecoffeetableinterface;

import chairtablecoffeetableinterface.Chair;
import chairtablecoffeetableinterface.CoffeeTable;
import chairtablecoffeetableinterface.Sofa;

public interface FurnitureFactory {
    abstract public Chair createChair();
    abstract public Sofa createSofa();
    abstract public CoffeeTable createCoffeeTable();
}
