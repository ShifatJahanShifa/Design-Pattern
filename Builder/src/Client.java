import builder.CarBuilder;
import builder.ManualBuilder;
import director.Director;
import product.Car;
import product.Manual;

public class Client {
    public static void main(String[] args) {
        Director director=new Director();
        CarBuilder carBuilder=new CarBuilder();
        director.makeSportsCar(carBuilder);
        Car car=carBuilder.getResult();
        System.out.println("car built. type: "+car.getCarType());

        ManualBuilder manualBuilder=new ManualBuilder();
        director.makeSportsCar(manualBuilder);
        Manual manual=manualBuilder.getResult();
        System.out.println("manual built.\n"+manual.print());
    }
}
