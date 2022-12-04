package prac02;
import textio.TextIO;

public class Question8 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int a_number = TextIO.getlnInt();
//        if (a_number % 2 == 0) {
//            System.out.println("Even number");
//        } else {
//            System.out.println("Odd number");
//
//        }
        String str = a_number %  2 == 0? "Even number" : "Odd number";
        System.out.println(str);

    }
}