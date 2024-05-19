package builder;

import product.Car;
import product.CarType;
import productcomponent.Engine;
import productcomponent.GPSNavigator;
import productcomponent.Transmission;
import productcomponent.TripComputer;

public class CarBuilder implements Builder{
    private CarType carType;
    private int seatNumber;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType carType) {
        this.carType=carType;
    }

    @Override
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator=gpsNavigator;
    }

    public Car getResult()
    {
        return new Car(carType,seatNumber,engine,transmission,tripComputer,gpsNavigator);
    }
}
