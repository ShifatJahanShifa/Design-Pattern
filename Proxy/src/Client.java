import service.Proxy;
import service.Service;
import service.ServiceInterface;

public class Client {
    public static void main(String[] args) {
        ServiceInterface serviceInterface=new Proxy();
        serviceInterface.operation();
    }
}
