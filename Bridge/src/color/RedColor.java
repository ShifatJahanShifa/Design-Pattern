package color;

public class RedColor implements Color{
    private String colorName;

    @Override
    public void setColor(String colorName) {
        this.colorName=colorName;
    }

    @Override
    public String getColor() {
        return this.colorName;
    }
}
