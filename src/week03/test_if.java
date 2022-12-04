package week03;

import static java.lang.Math.random;

public class test_if {
    public static void main(String[] args) {
        int x = (int) (random() * 100);
        int y;
        if (x < 0) {
            y = 1;
        }
        else {
            y = 2;
        }
        System.out.println(y);

        for (int i = 0; i< 10; i++)
            ;
            System.out.println("Hello");
    }
}
