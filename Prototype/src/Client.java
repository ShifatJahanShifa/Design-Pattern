import concreteprototype.Circle;
import concreteprototype.Rectangle;
import concreteprototype.Square;
import prototype.Font;
import prototype.PrototypeRegistry;
import prototype.PrototypeShape;

public class Client {
    public static void main(String[] args) {
        PrototypeRegistry prototypeRegistry=new PrototypeRegistry();
        // cricle
        Circle circle=new Circle();
        circle.x=5;
        circle.y=7;
        circle.radius=45;
        circle.color="Green";
        circle.font=new Font("Arial",5);

        //rectangle
        Rectangle rectangle=new Rectangle();
        rectangle.x=6;
        rectangle.y=9;
        rectangle.color="Blue";
        rectangle.height=10;
        rectangle.width=8;
        rectangle.font=new Font("Arial",7);

        //sqaure
        Square square=new Square();
        square.x=4;
        square.y=7;
        square.color="Red";
        square.side=5;
        square.font=new Font("Arial",9);

        // prototype
        prototypeRegistry.put("green circle",circle);
        prototypeRegistry.put("blue rectangle",rectangle);
        prototypeRegistry.put("red square",square);

        // clones
        PrototypeShape prototypeShape1= prototypeRegistry.get("green circle");
        PrototypeShape prototypeShape2= prototypeRegistry.get("blue rectangle");
        PrototypeShape prototypeShape3= prototypeRegistry.get("blue rectangle");
        PrototypeShape prototypeShape4= prototypeRegistry.get("red square");

        if((prototypeShape1!=prototypeShape2)&&!(prototypeShape1.equals(prototypeShape2)))
        {
            System.out.println("green circle != blue rectangle");
        }
        else
        {
            System.out.println("green circle == blue rectangle");
        }
        if((prototypeShape1!=prototypeShape4)&&!(prototypeShape1.equals(prototypeShape4)))
        {
            System.out.println("green circle!=red square");
        }
        else
        {
            System.out.println("green circle==red square");
        }
        if((prototypeShape2!=prototypeShape4)&&!(prototypeShape2.equals(prototypeShape4)))
        {
            System.out.println("blue rectangle!=red square");
        }
        else
        {
            System.out.println("blue rectangle==red square");
        }
        if((prototypeShape2!=prototypeShape3))
        {
            System.out.println("blue rectangle != blue rectangle");
        }

        System.out.println(prototypeShape2);
        System.out.println(prototypeShape3);
        // deep copy
        System.out.println("deep copy (class square) ");
        System.out.println(square);
        System.out.println(prototypeShape4);
        square.font.fontName="Times New Roman";
        System.out.println(square);
        System.out.println(prototypeShape4);

        System.out.println("deep copy (class circle) ");
        System.out.println(circle);
        System.out.println(prototypeShape1);
        circle.font.fontName="Times New Roman";
        System.out.println(circle);
        System.out.println(prototypeShape1);

        System.out.println("deep copy (class rectangle ) ");
        System.out.println(rectangle);
        System.out.println(prototypeShape2);
        rectangle.font.fontSize=2;
        System.out.println(rectangle);
        System.out.println(prototypeShape2);

    }
}
