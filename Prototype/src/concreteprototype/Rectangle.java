package concreteprototype;

import prototype.PrototypeShape;

import java.util.ArrayList;
import java.util.List;

public class Rectangle extends PrototypeShape {
    public int height;
    public int width;
    public Rectangle()
    {

    }
    public Rectangle(Rectangle rectangle)
    {
        super(rectangle);
        if(rectangle!=null)
        {
            this.height= rectangle.height;
            this.width= rectangle.width;
        }
    }

    @Override
    public PrototypeShape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Rectangle) || !super.equals(obj)) return false;
        Rectangle rectangle=(Rectangle) obj;
        return rectangle.height==height && rectangle.width==width;
    }

    @Override
    public String toString() {
        return super.toString()+this.height+" "+this.width;
    }
}
