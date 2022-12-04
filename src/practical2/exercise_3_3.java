package practical2;

import textio.TextIO;

public class exercise_3_3 {
    public static void main(String[] args) {
        double firstNum;
        double secondNum;
        char operator;
        double value;

        System.out.println("Enter expressions such as  2 + 2  or  34.2 * 7.81");
        System.out.println("using any of the operators +, -, *, /.");
        System.out.println("To end, enter a 0.");
        System.out.println();

        while (true) {
            System.out.print("? ");
            firstNum = TextIO.getDouble();
            if (firstNum == 0)
                break;
            operator = TextIO.getChar();
            secondNum = TextIO.getlnDouble();

            switch (operator) {
                case '+' -> value = firstNum + secondNum;
                case '-' -> value = firstNum - secondNum;
                case '*' -> value = firstNum * secondNum;
                case '/' -> value = firstNum / secondNum;
                default -> {
                    System.out.println("Unknown operator: " + operator);
                    continue;  // Back to start of loop!
                }
            }

            System.out.println("Value is " + value);
            System.out.println();

        }

        System.out.println("Good bye");

    }

}
