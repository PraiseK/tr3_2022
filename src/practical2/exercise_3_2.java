package practical2;

public class exercise_3_2 {
    public static void main(String[] args) {
        int n;
        int maxDivisor;
        int maxNum;
        maxDivisor = 1;
        maxNum = 1;

        for (n = 2; n <= 10000; n++){
            int Divisor;
            int divCount;

            divCount = 0;
            for (Divisor = 1; Divisor <= n; Divisor++){
                if (n % Divisor == 0)
                    divCount++;
            }
            if (divCount > divCount){
                maxDivisor = divCount;
                maxNum = n;
            }
            System.out.println("Maximum divisors = " + maxDivisor );
            System.out.println("A nukme with " + maxDivisor + "divisors is " + maxNum);
        }
    }
}






