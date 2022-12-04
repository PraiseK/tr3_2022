package week03;

import textio.TextIO;

public class exercise_2_5 {
    public static void main(String[] args) {
        int gross;
        int eggs;
        int dozen;
        int remain_gross;
        int remainders;
        System.out.print("How many eggs?:  ");
        eggs = TextIO.getlnInt();
        gross = eggs / 144;
        remain_gross = eggs % 144;
        dozen = remain_gross / 12;
        remainders = remain_gross % 12;
        System.out.println("You have " + gross + " gross");
        System.out.println("Your dozens are " + dozen);
        System.out.println("Your remaining eggs are " + remainders);




    }
}
