package week_08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestInvalidInput {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean validInput = false;
        int number = 0;
        while (!validInput){
            try{
                System.out.println("Enter a positive integer: ");
                number = myScanner.nextInt();
                if(number > 0){
                    validInput = true;
                }
            }
            catch (InputMismatchException e){
                System.out.println("Error; Not a number");
                myScanner.nextLine();
            }
        }
    }
}
