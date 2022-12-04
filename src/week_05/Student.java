package week_05;

public class Student extends Person{
    private  String id;

    public Student(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String tempStr = "Student{" +
                "id='" + id + '\'' +
                '}';
        tempStr = tempStr + super.toString();
        return  tempStr;
    }

    public static void main(String[] args) {
        Student student = new Student("jc821032");
        student.setName("Praise");
        student.setAge(21);
        student.setAddress("174 hulcombe");
        System.out.println(student.toString());
    }
}
