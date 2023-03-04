package object.compare;

import java.util.*;

public class Compare {

    public static void main(String[] args) {
        compareIntegersWithComparator();
        compareStudentsWithComparator();

        compareMensWithComparable();
    }

    /***
     * This method demonstrate a Comparator implementation
     * Here we are compare integers but only the last digit of it
     *      OUTPUT: [12, 53, 34, 45, 76]
     * Also we use the lambda implementation rather than anonymous implementation of the class
     * We are overriding the `int compare(T o1, T o2);`
     */
    private static void compareIntegersWithComparator() {
        Comparator<Integer> comparator = (o1, o2) -> {
            // Below whole logic can be replaced by the
            //      return Integer.compare(o1 % 10, o2 % 10);

            if ((o1 % 10) == (o2 % 10))
                return 0;

            if ((o1 % 10) > (o2 % 10))
                return 1;
            else
                return -1;
        };

        List<Integer> nums = new ArrayList<>(List.of(12, 39, 41, 76, 53));

        Collections.sort(nums, comparator);
        System.out.println(nums);
    }

    /***
     * This method demonstrate a Comparator implementation
     * Here we are compare a custom class
     *  OUTPUT: [Student{age=12, name='Amal'}, Student{age=38, name='Nimal'}, Student{age=50, name='Ranmal'}, Student{age=69, name='Shamal'}, Student{age=74, name='Kamal'}]
     *
     * Also we use the lambda implementation rather than anonymous implementation of the class
     * We are overriding the `int compare(T o1, T o2);`
     * Comparator used to compare objects only by one field
     */
    private static void compareStudentsWithComparator() {
        Comparator<Student> comparator = (o1, o2) -> {
            if (o1.getAge() == o2.getAge())
                return 0;

            if (o1.getAge() > o2.getAge())
                return 1;
            else
                return -1;

            // Below commented code will be sort by both name and age

            /*int result = o1.getName().compareTo(o2.getName()); // compare names
            if (result == 0) { // if names are equal
                if (o1.getAge() == o2.getAge()) {
                    return 0;
                } else if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else {
                    return -1;
                }
            } else { // if names are not equal, use name comparison result
                return result;
            }*/
        };

        List<Student> students = buildStudentList();

        Collections.sort(students, comparator);
        System.out.println(students);
    }

    /***
     * This method demonstrate a Comparable implementation
     * With the Comparable we are compare the objects inside our custom object
     * Then we can pass it directly to the sort function
     */
    private static void compareMensWithComparable() {
        List<Man> men = buildMensList();

        Collections.sort(men);
        System.out.println(men);
    }

    private static List<Student> buildStudentList(){
        Student one = new Student(12, "Amal");
        Student two = new Student(38, "Nimal");
        Student three = new Student(74, "Kamal");
        Student four = new Student(69, "Shamal");
        Student five = new Student(50, "Ranmal");

        return new ArrayList<>(List.of(one, two, three, four, five));
    }

    private static List<Man> buildMensList() {
        Man one = new Man(12, "Amal");
        Man two = new Man(38, "Nimal");
        Man three = new Man(74, "Kamal");
        Man four = new Man(69, "Shamal");
        Man five = new Man(50, "Ranmal");

        return new ArrayList<>(List.of(one, two, three, four, five));
    }

}
