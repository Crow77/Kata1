
package kata1;

import java.util.Date;

public class Kata1 {
    public static void main(String[] args) {
        Person person = new Person("Gabriel", new Date(80, 5, 2));
        System.out.println(person.getName()+" "+person.getAge());
    }
}
