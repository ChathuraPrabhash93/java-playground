package object.compare;

public class Man implements Comparable<Man> {
    private int age;
    private String name;

    public Man(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * this method use to compare the `given` object's values with the `self` values
     * We are comparing both name and age. priority is given to the name.
     * Hence, first it will sort by name and then the age
     * @param that the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Man that) {
        int result = this.getName().compareTo(that.getName()); // compare names
        if (result == 0) { // if names are equal
            if (this.getAge() == that.getAge()) {
                return 0;
            } else if (this.getAge() > that.getAge()) {
                return 1;
            } else {
                return -1;
            }
        } else { // if names are not equal, use name comparison result
            return result;
        }
    }
}
