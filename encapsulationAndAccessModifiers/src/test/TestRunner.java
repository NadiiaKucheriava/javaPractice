package test;

public class TestRunner {
    public static void main (String[] args){
        Person person1 = new Person();
        person1.setName("Jack");
        person1.setAge(18);
        person1.setAddress("New York");

        Person person2 = new Person();
        person2.setName("Mark");
        person2.setAge(36);
        person2.setAddress("Ukraine");

        printPersonInformation(person1);
        printPersonInformation(person2);

    }

    private static void printPersonInformation(Person person) {
        System.out.println("Person 1: Name-" + person.getName() + ", age-" + person.getAge() + ", address-" + person.getAddress());
    }
}

