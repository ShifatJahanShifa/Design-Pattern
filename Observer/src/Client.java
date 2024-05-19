import publishers.Publisher;
import subscribers.Subscriber;
import subscribers.SubscriberOne;
import subscribers.SubscriberTwo;

public class Client {
    public static void main(String[] args) {
        Publisher publisher=new Publisher();
        Subscriber subscriber1=new SubscriberOne();
        Subscriber subscriber2=new SubscriberTwo();

        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);

        publisher.change("monthly published");
    }
}
