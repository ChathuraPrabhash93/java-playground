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
     * @param that the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Man that) {
        if (this.getAge() == that.getAge()) {
            return 0;
        } else if (this.getAge() > that.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }
}
