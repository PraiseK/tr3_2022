package week_10;

public class TesSum {
    public static void main(String[] args) {
        System.out.println(sumNaturalNumbers(5));
    }
    static long sumNaturalNumbers(long n){
        if (n==1){
            return 1;
            //general case
        }
        else{
            return n + sumNaturalNumbers(n-1);
        }
    }
}
