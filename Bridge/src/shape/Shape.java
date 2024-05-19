package shape;

import color.Color;

abstract public class Shape {
    public int x;
    public int y;
    public Shape(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    public Shape(){}
    abstract public void calculateArea();
    abstract public void setColor(Color color);
    public void displayInfo(){
        System.out.println("position x: "+x);
        System.out.println("position y: "+y);
    };
}
