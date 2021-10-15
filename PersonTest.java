public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person(10, "Person1");
        Person person2 = new Person(5, "Person2");
        Person person3 = new Person(15, "Person3");
        Person person4 = new Person(25, "Person4");
        System.out.println(Person.peopleCount());
    }
}