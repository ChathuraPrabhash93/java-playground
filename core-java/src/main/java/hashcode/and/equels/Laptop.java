package hashcode.and.equels;

import java.util.List;
import java.util.Objects;

public class Laptop {
	private int id;
	private String model;
	private List<String> parts;

	@Override
	public boolean equals(final Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		final Laptop laptop = (Laptop) o;
		return id == laptop.id && Objects.equals(model, laptop.model) && Objects.equals(parts, laptop.parts);
	}

	// The 17 and 31 hash code idea is from the classic Java book – effective Java : item 9
	/*@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + id;
		result = 31 * result + model.hashCode();
		result = 31 * result + parts.hashCode();
		return result;
	}*/

	// For JDK 7 and above
	@Override
	public int hashCode() {
		return Objects.hash(id, model, parts);
	}


}
