package practical2;

import textio.TextIO;

public class exercise_4_2 {
    public static void main(String[] args) {
        String hex;  // Input from user, containing a hexadecimal number.
        long dec;    // Decimal (base-10) equivalent of hexadecimal number.
        int i;       // A position in hex, from 0 to hex.length()-1.
        System.out.print("Enter a hexadecimal number: ");
        hex = TextIO.getlnWord();
        dec = 0;
        for ( i = 0; i < hex.length(); i++ ) {
            if (i == -1) {
                System.out.println("Error:  Input is not a hexadecimal number.");
                return;  // Ends the main() routine.
            }
            dec = 16*dec + i;
        }
        System.out.println("Base-10 value:  " + dec);
    }
}
