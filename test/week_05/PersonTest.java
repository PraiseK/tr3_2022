package week_05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person = new Person("Praise", "123abc street", 21);

    @Test
    void getName() {
        assertEquals("Praise", person.getName());
    }

    @Test
    void getAddress() {
        assertEquals("123abc street", person.getAddress());
    }

    @Test
    void getAge() {
        assertEquals(21, person.getAge());
    }

    @Test
    void setName() {
        person.setName("Carlan");
        assertEquals("Carlan", person.getName());
    }


}