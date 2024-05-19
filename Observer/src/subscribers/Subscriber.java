package subscribers;

import publishers.Publisher;

public interface Subscriber {
    //abstract void update(String context);

    abstract void update(Publisher publisher);
}
