package product;

import productcomponent.Engine;
import productcomponent.GPSNavigator;
import productcomponent.Transmission;
import productcomponent.TripComputer;

public class Car {
    private final CarType carType;
    private final int seatNumber;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel=0;

    public Car(CarType carType,int seatNumber,Engine engine,Transmission transmission,TripComputer tripComputer,GPSNavigator gpsNavigator)
    {
        this.carType=carType;
        this.seatNumber=seatNumber;
        this.engine=engine;
        this.transmission=transmission;
        this.tripComputer=tripComputer;
        if(this.tripComputer!=null)
        {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator=gpsNavigator;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }
}
