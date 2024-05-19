package shape;

import color.Color;

public class Circle extends Shape{
    public double radius;
    private double area;
    protected Color color;
    public Circle(int x,int y,double radius)
    {
        super(x,y);
        this.radius=radius;
    }

    public void setColor(Color color)
    {
        this.color=color;
    }

    @Override
    public void calculateArea() {
        area=this.radius*this.radius*3.14;
        System.out.println("area calculated for "+this.color.getColor()+" circle");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("radius: "+radius);
        System.out.println("area : "+area);
        System.out.println("color :"+this.color.getColor());
    }
}
