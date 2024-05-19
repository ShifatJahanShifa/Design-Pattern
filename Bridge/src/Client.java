import color.BlueColor;
import color.Color;
import color.RedColor;
import shape.Circle;
import shape.Shape;
import shape.Square;

public class Client {
    public static void main(String[] args) {
        // for red
        Color redColor=new RedColor();
        redColor.setColor("red");
        Shape circle=new Circle(3,5,5.0);
        circle.setColor(redColor);
        circle.calculateArea();
        circle.displayInfo();

        Shape square=new Square(2,4,8.5,4.6);
        square.setColor(redColor);
        square.calculateArea();
        square.displayInfo();

        //for blue
        Color blueColor=new BlueColor();
        blueColor.setColor("blue");
        circle.setColor(blueColor);
        circle.calculateArea();
        circle.displayInfo();

        square.setColor(blueColor);
        square.calculateArea();
        square.displayInfo();

    }
}
