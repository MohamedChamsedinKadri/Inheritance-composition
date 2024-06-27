package src;
import java.util.Objects;

public class PersonWithJobComposition {
    private Person person;
    private double salary;

    public PersonWithJobComposition(String name, double salary) {
        this.person = new Person(name);
        this.salary = salary;
    }

    public String getName() {
        return person.getName();
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PersonWithJobComposition that = (PersonWithJobComposition) obj;
        return Double.compare(that.salary, salary) == 0 && person.equals(that.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, salary);
    }

    public static void main(String[] args) {
        PersonWithJobComposition p1 = new PersonWithJobComposition("Joe", 30000);
        Person p2 = new Person("Joe");

        System.out.println("p1.equals(p2)? " + p1.equals(p2)); // Should print false
        System.out.println("p2.equals(p1)? " + p2.equals(p1)); // Should print false
    }
}
