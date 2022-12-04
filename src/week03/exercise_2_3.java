package week03;

import textio.TextIO;


public class exercise_2_3 {
    public static void main(String[] args) {
        String name;
        TextIO.put( "Enter name: ");
        name = TextIO.getlnString();
        System.out.println("Hello" + ", " + name.toUpperCase() + ", nice to meet you!" );


    }
}
