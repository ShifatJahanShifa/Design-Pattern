package chair;

import chairtablecoffeetableinterface.Chair;

public class ArtDecoChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("sit on art deco chair");
    }
}
