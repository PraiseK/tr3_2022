package practical2;

import textio.TextIO;

public class exercise_3_4 {
    public static void main(String[] args) {
        String line;
        int i;
        char C;
        boolean didCR;

        System.out.print("Enter a line?: ");
        line = TextIO.getln();
        didCR = true;

        for ( i = 0;  i < line.length();  i++ ) {
            C = line.charAt(i);
            if ( Character.isLetter(C) ) {
                System.out.print(C);
                didCR = false;
            }
            else {
                if ( didCR == false ) {
                    System.out.println();
                    didCR = true;
                }
            }
        }

        System.out.println();

    }

}
