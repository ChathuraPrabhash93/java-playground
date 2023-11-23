package immutable;

import java.util.Collections;
import java.util.List;

public final class Person {
	private final int id;
	private final String name;
	private final List<String> accountNumbers;

	public Person(int i, String n, List<String> an){
		this.id = i;
		this.name = n;
		this.accountNumbers = Collections.unmodifiableList(an);
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public List<String> getAccountNumbers() {
		return Collections.unmodifiableList(accountNumbers);
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				", accountNumbers=" + accountNumbers +
				'}';
	}
}
