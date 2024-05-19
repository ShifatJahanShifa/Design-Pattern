import Objects.*;

public class Client {
    public static void main(String[] args) {
          Box box=new Box(
                    new Box(new Hammer()),
                    new Box(
                            new Box(new Phone(),new Headphone()),
                            new Box(new Charger())
                    ),
                    new Receipt()
        );
        System.out.println(box.getPrice());
    }
}
