package week_05;

public class Person {
    private String name;
    private String address;
    private int age;

    public Person() {
        name = "unknown";
        address = "unknown";
        age = 10;
    }

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person person1 =  new Person();
        System.out.println(person1.getName());
        System.out.println(person1.toString());
        Person person2 = new Person("Cue", "123 abc street", 50);
        System.out.println(person2.getName());
        System.out.println(person2.toString());

        String str1 =  new String("Cue");
        String str2 =  new String("Cue");
        System.out.println(str1 == str2);  //will be false as variable name are different
        System.out.println(str1.equals(str2));

    }

}
