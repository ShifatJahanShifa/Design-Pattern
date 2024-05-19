package Objects;

public class Hammer implements Order{
    private int price=10;

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
