import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManager {
    public void filterByAge(List<Employee> employees) {
        employees.stream().filter(e -> e.getAge() > 30).forEach(e -> System.out.println(e.getFirstName()));
    }

   public void groupByPostalCode(List<Employee> employees) {
        employees.stream().collect(Collectors.groupingBy(Employee::getPostalCode)).forEach((postalCode, employeeList) -> {
            System.out.println("Postal code: " + postalCode);
            employeeList.forEach(e -> System.out.println(e.getFirstName()));
        });
    }

    public void averageRemuneration(List<Employee> employees) {
        System.out.println(employees.stream().mapToDouble(Employee::getRemuneration).average().getAsDouble());
    }

    public void findHighestRemuneration(List<Employee> employees) {
        System.out.println(employees.stream().max(Comparator.comparingDouble(Employee::getRemuneration)).get().getFirstName());
    }

    public void filterByDesignation(List<Employee> employees) {
        employees.stream().filter(e -> e.getDesignation().equals("Manager")).forEach(e -> System.out.println(e.getFirstName()));
    }

    public void sortByAge(List<Employee> employees) {
        employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(e -> System.out.println(e.getFirstName()));
        employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).forEach(e -> System.out.println(e.getFirstName()));
    }

    public void findYoungestEmployee(List<Employee> employees) {
        System.out.println(employees.stream().min(Comparator.comparingInt(Employee::getAge)).get().getFirstName());
    }

    public void countByDistrict(List<Employee> employees) {
        System.out.println(employees.stream().filter(e -> e.getDistrict().equals("Uptown")).count());
    }

    public void distinctPostalCode(List<Employee> employees) {
        employees.stream().mapToInt(Employee::getPostalCode).distinct().forEach(System.out::println);
    }

    public void totalRemuneration(List<Employee> employees) {
        System.out.println(employees.stream().mapToDouble(Employee::getRemuneration).sum());
    }

    public void areAdults(List<Employee> employees) {
        System.out.println(employees.stream().allMatch(e -> e.getAge() >= 18));
    }

    public void skipEmployees(List<Employee> employees) {
        employees.stream().skip(3).forEach(e -> System.out.println(e.getFirstName()));
    }

    public void averageAgeInDistrict(List<Employee> employees) {
        System.out.println(employees.stream().filter(e -> e.getDistrict().equals("Downtown")).mapToInt(Employee::getAge).average().getAsDouble());
    }

    public void displayTop3Remunerations(List<Employee> employees) {
        employees.stream().sorted(Comparator.comparingDouble(Employee::getRemuneration).reversed()).limit(3).forEach(e -> System.out.println(e.getFirstName()));
    }




}
