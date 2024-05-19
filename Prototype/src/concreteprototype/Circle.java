package concreteprototype;

import prototype.PrototypeShape;

import java.util.ArrayList;
import java.util.List;

public class Circle extends PrototypeShape {
    public int radius;
    public Circle()
    {

    }
    public Circle(Circle circle)
    {
        super(circle);
        if(circle!=null)
        {
            this.radius= circle.radius;
        }
    }

    @Override
    public PrototypeShape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Circle) || !super.equals(obj)) return false;
        Circle circle=(Circle) obj;
        return circle.radius==radius;
    }

    @Override
    public String toString() {
        return super.toString()+this.radius;
    }
}
