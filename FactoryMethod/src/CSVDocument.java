

public class CSVDocument implements Document{
    @Override
    public void open() {
        System.out.println("opened a csv file");
        save();
        close();
    }

    @Override
    public void save() {
        System.out.println("saved a csv file");
    }

    @Override
    public void close() {
        System.out.println("closed a csv file");
    }
}
