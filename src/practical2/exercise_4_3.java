package practical2;

public class exercise_4_3 {
    public static int main(String[] args) {
        int rolls;
        int N;
        N = 0;
        rolls = rollFor(2);
        System.out.println("It took " + rolls + " rolls to get snake eyes.");

        if ( N < 2 || N > 12 )
            throw new IllegalArgumentException("Impossible total for a pair of dice.");
        int die1, die2;  // Numbers between 1 and 6 representing the dice.
        int roll;        // Total showing on dice.
        int rollCt;      // Number of rolls made.
        rollCt = 0;
        do {
            die1 = (int)(Math.random()*6) + 1;
            die2 = (int)(Math.random()*6) + 1;
            roll = die1 + die2;
            rollCt++;
        } while ( roll != N );
        return rollCt;
    }

    private static int rollFor(int i) {
        return 0;
    }

}
