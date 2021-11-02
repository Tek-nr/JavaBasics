public class ScopeClass {
    private int privateVariable=30;
    public ScopeClass(){
        System.out.println("privateVariable = "+ privateVariable);
    }
    public void multiplyWithTen(){
        int privateVariable=10;
        for(int i=1;i<6;i++){
            System.out.println(i+"*"+ this.privateVariable+" = "+(i*this.privateVariable));
        }
    }
}
