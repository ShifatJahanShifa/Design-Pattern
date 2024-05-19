import round.RoundHole;
import round.RoundPeg;
import sqaure.SquarePeg;
import sqaureadapter.SquarePegAdapter;

public class Client {
    public static void main(String[] args) {
        RoundHole roundHole=new RoundHole(5);
        RoundPeg roundPeg=new RoundPeg(5);
        if(roundHole.fits(roundPeg))
        {
            System.out.println("round peg fits round hole");
        }

        SquarePeg smallSquarePeg=new SquarePeg(2);
        SquarePeg bigSquarePeg=new SquarePeg(20);

        SquarePegAdapter squarePegAdapter1=new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter squarePegAdapter2=new SquarePegAdapter(bigSquarePeg);
        if(roundHole.fits(squarePegAdapter1))
        {
            System.out.println("square fits in the round hole");
        }
        else
        {
            System.out.println("square does not fit in the round hole");
        }
        if(roundHole.fits(squarePegAdapter2))
        {
            System.out.println("square fits in the round hole");
        }
        else
        {
            System.out.println("square does not fit in the round hole");
        }
    }
}
