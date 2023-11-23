package immutable;

import java.util.List;
import java.util.ArrayList;

public class ImmutableExample {

	public static void main(String[] args) {

		// with the below code example is not immutable even if we make the `Person` class immutable
		List<String> accountNumbers = new ArrayList<>();
		accountNumbers.add("1");

		Person person = new Person(1, "John", accountNumbers);

		// adding a new element to the list.
		accountNumbers.add("2");
		// since java objects are used `pass by reference` concept, `Person` is containing all account numbers now ie. "1, 2"
		System.out.println(person.toString());


		// ==================================================================================================================
		// Hence we need to create the actual immutable list first and use it with the `Person`
		List<String> immutableAccountNumbers = List.of("0");

		Person immutablePerson = new Person(1, "Doe", immutableAccountNumbers);

		// if we try to add a new element to the `immutableAccountNumbers` it will throw an exception since `List.of` return an unmodifiable list.
		// immutableAccountNumbers.add("2");
		// now we have a proper immutable class
		System.out.println(person.toString());

	}
}
