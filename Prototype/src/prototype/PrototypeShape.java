package prototype;

import java.util.Objects;

public abstract class PrototypeShape {
    public abstract PrototypeShape clone();
    public int x;
    public int y;
    public String color;
    public Font font;

    public PrototypeShape()
    {

    }

    public PrototypeShape(PrototypeShape prototypeShape)
    {
        if(prototypeShape!=null)
        {
            this.x= prototypeShape.x;
            this.y= prototypeShape.y;
            this.color= prototypeShape.color;
//            this.font.fontName=prototypeShape.font.fontName;
//            this.font.fontSize=prototypeShape.font.fontSize;
            this.font=prototypeShape.font.clone();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof PrototypeShape)) return false;
        PrototypeShape prototypeShape=(PrototypeShape) obj;
        return prototypeShape.x==x && prototypeShape.y==y && Objects.equals(prototypeShape.color,color) && Objects.equals(prototypeShape.font,font);
    }

    @Override
    public String toString() {
        return this.x+" "+this.y+" "+this.color+" "+this.font.fontName+" "+this.font.fontSize+" ";
    }
}
