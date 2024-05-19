package round;

public class RoundHole {
    private double radius;
    public RoundHole(double radius)
    {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    private boolean result;

    public boolean fits(RoundPeg roundpeg) {
        result=(this.getRadius()>=roundpeg.getRadius());
        return result;
    }
}
