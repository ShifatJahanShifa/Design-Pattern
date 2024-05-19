package handler;

public class Button extends Component{
    private int x,y,width,height;
    private String label;

    public Button(int x,int y,int width,int height,String label)
    {
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.label=label;
    }
    // ... default implementation
}
