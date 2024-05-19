
public class TxtDocument implements Document{
    @Override
    public void open() {
        System.out.println("opened a text file");
        save();
        close();
    }


    @Override
    public void save()  {
        System.out.println("saved a text file");
    }

    @Override
    public void close()  {
        System.out.println("closed the text file");
    }
}
