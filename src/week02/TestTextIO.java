package week02;

import textio.TextIO;

public class TestTextIO {
    public static  void  main(String[] args) {
        //start new input
        TextIO.put( "Enter name: ");
        //string input
        String name = TextIO.getlnString();
        //nu
        TextIO.put("Enter age: ");
        int age = TextIO.getlnInt();
        TextIO.put("Enter salary: ");
        double salary = TextIO.getlnDouble();

        //output to standard output
        TextIO.putln("Name: " + name);
        TextIO.putln("Age: " + age);
        TextIO.putln("Salary: " + salary);


    }
}
