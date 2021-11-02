
public class EsitAgirlik extends Candidate {

    public EsitAgirlik(float TN, float MN, float FN, float SN) {
        super(TN, MN, FN, SN);
    }

    @Override
    public float calculateScore() {
        return getSN()*3 + getFN()*2 + getMN()*5 + getTN()*5;
    }
    
}
