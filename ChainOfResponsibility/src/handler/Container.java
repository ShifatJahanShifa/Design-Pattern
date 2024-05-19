package handler;

import java.util.ArrayList;

public class Container extends Component{
    protected ArrayList<Component>componentArrayList=new ArrayList<Component>();

    public void addChild(Component component)
    {
        componentArrayList.add(component);
        component.container=this;
    }
}
