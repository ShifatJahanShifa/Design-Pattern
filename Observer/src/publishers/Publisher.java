package publishers;

import subscribers.Subscriber;

import java.util.ArrayList;


public class Publisher {
    private ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();
    private String mainState="weekly published";

    public void subscribe(Subscriber subscriber)
    {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber)
    {
        subscribers.remove(subscriber);
    }

    public void change(String mainState) {
        this.mainState = mainState;
        notifySubscriber();
    }

    private void notifySubscriber()
    {
        for(Subscriber subscriber:subscribers)
        {
            subscriber.update(this);
        }
    }

    public String getMainState()
    {
        return mainState;
    }
}
