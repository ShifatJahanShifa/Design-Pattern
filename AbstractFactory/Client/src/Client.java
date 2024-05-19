import chairtablecoffeetableinterface.Chair;
import chairtablecoffeetableinterface.CoffeeTable;
import chairtablecoffeetableinterface.FurnitureFactory;
import chairtablecoffeetableinterface.Sofa;
import concretefactory.ArtDecoFurnitureFactory;

public class Client {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory=new ArtDecoFurnitureFactory();
        Chair chair=furnitureFactory.createChair();
        CoffeeTable coffeeTable=furnitureFactory.createCoffeeTable();
        Sofa sofa=furnitureFactory.createSofa();
        chair.sitOn();
        coffeeTable.haveCoffee();
        sofa.toLean();
    }
}