package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Luis", new Date(101, 10, 19));
        System.out.printf(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}
