package prototype;

import concreteprototype.Circle;
import concreteprototype.Rectangle;
import concreteprototype.Square;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private Map<String, PrototypeShape>cache=new HashMap<>();
    public PrototypeRegistry()
    {

    }

    public void put(String key, PrototypeShape prototypeShape)
    {
        cache.put(key,prototypeShape);
    }

    public PrototypeShape get(String key)
    {
        return cache.get(key).clone();
    }
}
