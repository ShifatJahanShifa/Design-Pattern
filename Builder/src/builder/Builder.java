package builder;

import product.CarType;
import productcomponent.Engine;
import productcomponent.GPSNavigator;
import productcomponent.Transmission;
import productcomponent.TripComputer;

public interface Builder {
    public void setCarType(CarType carType);
    public void setSeatNumber(int seatNumber);
    public void setEngine(Engine engine);
    public void setTransmission(Transmission transmission);
    public void setTripComputer(TripComputer tripComputer);
    public void setGPSNavigator(GPSNavigator gpsNavigator);
}
