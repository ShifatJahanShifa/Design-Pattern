package prototype;

public class Font {
    public String fontName;
    public int fontSize;
    public Font(String fontName,int fontSize)
    {
        this.fontName=fontName;
        this.fontSize=fontSize;
    }
    public Font(Font font)
    {
        if(font!=null){
            this.fontName= font.fontName;
            this.fontSize= font.fontSize;
        }
    }

    public Font clone()
    {
        return new Font(this);
    }
}
