package service;

import java.util.ArrayList;

public class Proxy implements ServiceInterface{
    private ServiceInterface serviceInterface;
    public Proxy()
    {
        this.serviceInterface=new Service();
    }

    public boolean checkAccess()
    {
        return true;
    }
    @Override
    public void operation()
    {
        if(checkAccess())
        {
            serviceInterface.operation();
        }
    }
}
