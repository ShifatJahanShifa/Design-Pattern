import handler.Button;
import handler.Component;
import handler.Dialog;
import handler.Panel;

import java.awt.image.ComponentColorModel;

public class Client {
    private static Dialog dialog;

    public static void main(String[] args) {
//        Client client=new Client();
//        client.createGUI();
//        client.onF1KeyPress();
        createGUI();
        onF1KeyPress();
    }

    public static void createGUI()
    {
        dialog=new Dialog("Budget Reports");
        //dialog.setWikipageURL("http://....");
        Panel panel=new Panel(0,0,400,800);
        panel.setModalHelpText("this panel does ....");
        Button ok=new Button(250,760,50,20,"ok");
        ok.tooltipText="this is an ok button";
        Button cancel=new Button(320,760,50,20,"cancel");
        cancel.tooltipText="this is an cancel button";

        panel.addChild(ok);
        panel.addChild(cancel);
        dialog.addChild(panel);
//        onF1KeyPress(cancel);
    }

    public static void onF1KeyPress()
    {
        Component component=getComponentAtMouseCords();
        if(component!=null)
        {
            component.showHelp();
//            cancel.showHelp();
        }
    }

    private static Component getComponentAtMouseCords()
    {
        return dialog;
    }
}
