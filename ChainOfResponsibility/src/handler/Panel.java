package handler;

public class Panel extends Container{
    private String modalHelpText;
    private int x,y,width,height;

    public Panel(int x,int y,int width,int height)
    {
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
    @Override
    public void showHelp() {
        if(modalHelpText!=null)
        {
            System.out.println(modalHelpText);
        }
        else
        {
            super.showHelp();
        }
    }

    public void setModalHelpText(String modalHelpText) {
        this.modalHelpText = modalHelpText;
    }
}
