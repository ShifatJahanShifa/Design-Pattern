package handler;

public class Dialog extends Container{
    private String wikipageURL;
    private String title;
    public Dialog(String text)
    {
        this.title=text;
    }
    @Override
    public void showHelp() {
        if(wikipageURL!=null)
        {
            System.out.println(wikipageURL);
        }
        else
        {
            super.showHelp();
        }
    }

    public void setWikipageURL(String wikipageURL) {
        this.wikipageURL = wikipageURL;
    }
}
