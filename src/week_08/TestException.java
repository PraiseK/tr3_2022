package week_08;

public class TestException {
    public static void main(String[] args) {
        int number = 0;
        number = division(10, 0);
       // number = division1(10, 0); //JVM handled it
        try{
            number = division1(10, 0);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try{
            number = division2(10, 0);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    private static int division(int a, int b) {
        int temp = 0;
        try{
            temp = a/b;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            temp = -1;

        }
        return temp;
    }
    private static int division1(int a, int b) throws ArithmeticException{
        return a/b;

    }
    private static int division2(int a, int b) {
        if (b == 0){
            // throw an exception object
            throw new ArithmeticException("Division by zero");
        }
        return a/b;
    }



    }
