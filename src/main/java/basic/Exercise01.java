package basic;

public class Exercise01 {
    public int GCD(int a,int b){
        if(b==0) return a;
        return GCD(b,a%b);
    }
    public int LCM(int a,int b){
        return a*b/GCD(a,b);
    }
}
