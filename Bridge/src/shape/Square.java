package shape;

import color.Color;

public class Square extends Shape{
    public double height;
    public double width;
    private double area;

    protected Color color;
    public Square(int x,int y,double height,double width)
    {
        super(x,y);
        this.height=height;
        this.width=width;
    }

    public void setColor(Color color)
    {
        this.color=color;
    }

    @Override
    public void calculateArea() {
//        color.setColor("red");
        area=this.width*this.height;
        System.out.println("area calculated for "+color.getColor()+" square");

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("height :"+height);
        System.out.println("width :"+width);
        System.out.println("area : "+area);
        System.out.println("color :"+color.getColor());
    }
}
