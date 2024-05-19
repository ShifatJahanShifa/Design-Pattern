package productcomponent;

import product.Car;

public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel()
    {
        System.out.println("fuel level: "+car.getFuel());
    }

    public void showStatus()
    {
        if(this.car.getEngine().isStarted())
        {
            System.out.println("Car is started");
        }
        else
        {
            System.out.println("Car is not started");
        }
    }
}
