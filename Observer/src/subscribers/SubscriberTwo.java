package subscribers;

import publishers.Publisher;

public class SubscriberTwo implements Subscriber{
//    public void update(String context) {
//        System.out.println("2. the update is: "+context);
//    }
    public void update(Publisher publisher)
    {
        System.out.println("2. the update is: "+publisher.getMainState());
    }
}
