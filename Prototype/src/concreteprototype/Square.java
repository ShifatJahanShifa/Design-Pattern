package concreteprototype;

import prototype.Font;
import prototype.PrototypeShape;

public class Square extends PrototypeShape {
    public int side;
    public Square()
    {

    }
    public Square(Square square)
    {
        super(square);
        if(square!=null)
        {
            this.side= square.side;
        }
    }

    @Override
    public PrototypeShape clone() {
        return new Square(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Square) || !super.equals(obj))  return false;
        Square square=(Square) obj;
        return side==square.side;
    }

    @Override
    public String toString() {
        return super.toString()+this.side;
    }
}
