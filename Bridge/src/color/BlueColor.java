package color;

public class BlueColor implements Color{
    private String colorName;

    public void setColor(String colorName) {
        this.colorName=colorName;
    }

    @Override
    public String getColor() {
        return this.colorName;
    }
}
