package Objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box implements Order {
    private int price=15;
    protected List<Order> orderList=new ArrayList<>();

    public Box(Order...orders)
    {
        add(orders);
    }
    public void add(Order order)
    {
        orderList.add(order);
    }
    public void add(Order... order)
    {
        orderList.addAll(Arrays.asList(order));
    }

    public void remove(Order order)
    {
        orderList.remove(order);
    }
    public void remove(Order... order)
    {
        orderList.removeAll(Arrays.asList(order));
    }

    public void clear()
    {
        orderList.clear();
    }
    @Override
    public int getPrice() {
        int total=0;
        for(Order order:orderList)
        {
            total+=order.getPrice();
        }
        return total+price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
