package week_09;

import week_05.Person;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
//        define array of 5 integer
        int[] myNumbers = {1, 2, 3, 4, 5 };
        for(int i = 0; i < 5; i++) {
            System.out.print(myNumbers[i] + " ");
        }

        int j = 0;
        while (j < 5){
        System.out.print(myNumbers[j] + " ");
        j++;
        }

        //array of 3 strings
        String[] names = new String[3];
        names[0] = "Ruchi";
        names[1] = "Praise";
        names[2] = "Tiri";
        System.out.println(Arrays.toString(names));
        for(int i = 0; i<names.length; i++){
            System.out.println(names[i]);
        }

        Person[] group = {new Person("Ruchi","123 abc street", 20),
                          new Person("Praise","123 abc street", 20),
                          new Person("Tiri","123 abc street", 20)};
        for(Person person: group){
            System.out.println(person);
        }

        String[] myGroup = new String[] {"praise", "ruchi", "tiri"};
        //extend
        myGroup = Arrays.copyOf(myGroup, 10);
        myGroup[3] = "Jihyung Park";
        myGroup[4] = "Phuc";
        System.out.println(Arrays.toString(myGroup));

        ArrayList<Person> group1 = new ArrayList<>();
        group1.add(new Person("Praise","123 abc street", 20));
        group1.add(new Person("Ruchi","123 abc street", 20));
        group1.add(new Person("Tiri","123 abc street", 20));
        System.out.println("size = " + group1.size());

        for(Person person1: group1){
            System.out.println(person1);
        }
        //remove thhe first person
        group1.remove(0);
        System.out.println("size = " + group1.size());
        //remove all
        for(Person person1: group1){
            System.out.println(person1);
        }

    }
}
