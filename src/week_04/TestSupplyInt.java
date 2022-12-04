package week_04;

import textio.TextIO;

import java.util.Random;

public class TestSupplyInt {
    public static void main(String[] args) {
        SupplyInt function;
        function = () -> (int) (1 + Math.random() * 6);
        for (int i = 0; i < 10; i++) {
            System.out.println(function.get());
        }

        function = () -> {
            TextIO.put("Enter an integer: ");
            return TextIO.getlnInt();
        };
        int anInt = function.get();
        System.out.println(anInt);

    }
}
