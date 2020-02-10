package Java8features;

/*A Functional Interface is an Interface which allows only one Abstract method
 within the Interface scope.
 There are some predefined functional
interface in Java like Predicate,consumer,supplier etc.
*/
/*

The Functional Interface PREDICATE is defined in the java.util.Function package.
It improves manageability of code,
helps in unit-testing them separately, and contain some methods like:
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class e_predicates {
    private static void printAllConditionally(List<Person> personList, Predicate<Person> personPredicate) {
        for (Person p : personList) {
            if (personPredicate.test(p)) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );
        printAllConditionally(people, person -> person.getLname().startsWith("C"));
       // here that lambda command becomes the condition and only pass predicates get into the output.

    }

}
