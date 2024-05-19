package sqaureadapter;

import round.RoundPeg;
import sqaure.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg)
    {
        this.squarePeg=squarePeg;
    }

    @Override
    public double getRadius() {
        double result;
        result=Math.sqrt(Math.pow(this.squarePeg.getWidth()/2,2)*2);
        return result;
    }
}
