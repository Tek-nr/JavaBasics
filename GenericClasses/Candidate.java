
public abstract class Candidate {

    private float TN;
    private float MN;
    private float FN;
    private float SN;

    public Candidate(float TN, float MN, float FN, float SN) {
        this.TN = TN;
        this.MN = MN;
        this.FN = FN;
        this.SN = SN;
    }    

    public float getTN() {
        return TN;
    }

    public void setTN(float TN) {
        this.TN = TN;
    }

    public float getMN() {
        return MN;
    }

    public void setMN(float MN) {
        this.MN = MN;
    }

    public float getFN() {
        return FN;
    }

    public void setFN(float FN) {
        this.FN = FN;
    }

    public float getSN() {
        return SN;
    }

    public void setEN(float SN) {
        this.SN = SN;
    }
    
    abstract float calculateScore();
}
