package practical2;

import textio.TextIO;

public class exercise_4_1 {
    public static void main(String[] args) {
        char C;
        int i;
        String line;
        System.out.println("Enter a line of text.");
        line = TextIO.getln();
        System.out.println();
        System.out.println("Capitalized version:");
        System.out.print( line );
    }

}
