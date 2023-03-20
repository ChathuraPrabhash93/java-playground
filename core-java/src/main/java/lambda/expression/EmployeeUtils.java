package lambda.expression;

import lambda.expression.model.Employee;

import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeUtils {

    public static String getFullName(Employee employee) {
        Function<Employee, String> fullName = (Employee emp) -> {
            return emp.getFirstName() + " " + emp.getLastName();
        };
        return fullName.apply(employee);
    }

    public static String getManagersLastName(Employee employee) {
        Function<Employee, String> managersLastName = emp -> emp.getManager().getLastName();
        return managersLastName.apply(employee);
    }

    public static boolean hasBeenEmployedLongerThanFiveYears(Employee employee) {
        Predicate<Employee> employedLongerThanFiveYears = (Employee emp) -> {
            return emp.getYearsOfService() >= 5;
        };
        return employedLongerThanFiveYears.test(employee);
    }

    public static boolean hasMoreThanThreeDirectReports(Employee employee) {
        Predicate<Employee> moreThanThreeDirectReports = emp -> emp.getNumberOfDirectReports() > 3;
        return moreThanThreeDirectReports.test(employee);
    }

    public static boolean hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(Employee employee) {
        Predicate<Employee> moreThanThreeYearsOfServiceAndLessThanTwoDirectReports = emp -> {
            return emp.getYearsOfService() > 3 && emp.getNumberOfDirectReports() < 2;
        };
        return moreThanThreeYearsOfServiceAndLessThanTwoDirectReports.test(employee);
    }
}
