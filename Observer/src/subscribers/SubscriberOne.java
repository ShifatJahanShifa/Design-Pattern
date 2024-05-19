package subscribers;

import publishers.Publisher;

public class SubscriberOne implements Subscriber {
    //@Override
//    public void update(String context) {
//        System.out.println("1. the update is: "+context);
//    }

    @Override
    public void update(Publisher publisher)
    {
        System.out.println("1. the update is: "+publisher.getMainState());
    }
}
