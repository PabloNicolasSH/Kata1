package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2001,11,19);
        
        Person person = new Person("Luis", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}
