package director;

import builder.Builder;
import product.CarType;
import productcomponent.Engine;
import productcomponent.GPSNavigator;
import productcomponent.Transmission;
import productcomponent.TripComputer;

public class Director {
    public void makeSportsCar(Builder builder)
    {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeatNumber(2);
        builder.setEngine(new Engine(3.0,0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void makeCityCar(Builder builder)
    {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeatNumber(2);
        builder.setEngine(new Engine(1.2,0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void makeSUV(Builder builder)
    {
        builder.setCarType(CarType.SUV);
        builder.setSeatNumber(4);
        builder.setEngine(new Engine(2.5,0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
