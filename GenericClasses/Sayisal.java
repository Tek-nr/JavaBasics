
public class Sayisal extends Candidate {

    public Sayisal(float TN, float MN, float FN, float SN) {
        super(TN, MN, FN, SN);
    }

    @Override
    public float calculateScore() {
        return getSN()*2 + getFN()*3 + getMN()*5 + getTN()*5;
    }
    
}
