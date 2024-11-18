import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestRunner {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Jack");
        person1.setAge(18);
        person1.setAddress("New York");

        Person person2 = new Person();
        person2.setName("Mark");
        person2.setAge(36);
        person2.setAddress("Ukraine");

        logPersonInformation(person1);
        logPersonInformation(person2);
    }

    private static void logPersonInformation(@NonNull Person person) {
        log.info("Person: Name-{}, age-{}, address-{}", person.getName(), person.getAge(), person.getAddress());
    }

}

