package handler;

public class Component implements ComponentWithContextualHelp{
    public String tooltipText;
    protected Container container;

    @Override
    public void showHelp() {
        if(tooltipText!=null)
        {
            System.out.println(tooltipText);
        }
        else if(container!=null)
        {
            container.showHelp();
        }
        else System.out.println("no help");
    }
}
