import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        CSVFileHandler csvHandler = new CSVFileHandler("employee_data.csv");
        csvHandler.readFromCSV(employees);
        System.out.println("Employees from CSVFile ----> ");
        System.out.println("First Name, Last Name, Postal Code, Street, District, Age, Designation, Remuneration");
        csvHandler.printEmployees(employees);

        EmployeeManager manager = new EmployeeManager();

        System.out.println("/////////////////////////");

        System.out.println("Employees filtered by age > 30 ----> ");
        manager.filterByAge(employees);

        System.out.println("/////////////////////////");

        System.out.println("Employees grouped by postal code ----> ");
        manager.groupByPostalCode(employees);
        System.out.println("/////////////////////////");
        System.out.println("Average remuneration ----> ");

        manager.averageRemuneration(employees);
        System.out.println("/////////////////////////");
        System.out.println("Highest remuneration ----> ");

        manager.findHighestRemuneration(employees);
        System.out.println("/////////////////////////");
        System.out.println("Employees filtered by designation ----> ");

        manager.filterByDesignation(employees);
        System.out.println("/////////////////////////");
        System.out.println("Employees sorted by age ----> ");

        manager.sortByAge(employees);
        System.out.println("/////////////////////////");
        System.out.println("Youngest employee ----> ");

        manager.findYoungestEmployee(employees);
        System.out.println("/////////////////////////");
        System.out.println("Employees in Uptown ----> ");

        manager.countByDistrict(employees);
        System.out.println("/////////////////////////");
        System.out.println("Distinct postal codes ----> ");

        manager.distinctPostalCode(employees);
        System.out.println("/////////////////////////");
        System.out.println("Total remuneration ----> ");

        manager.totalRemuneration(employees);
        System.out.println("/////////////////////////");
        System.out.println("Are all employees adults? ----> ");

        manager.areAdults(employees);
        System.out.println("/////////////////////////");
        System.out.println("Employees skipped by 3 ----> ");

        manager.skipEmployees(employees);
        System.out.println("/////////////////////////");
        System.out.println("Average age in Downtown ----> ");

        manager.averageAgeInDistrict(employees);
        System.out.println("/////////////////////////");
        System.out.println("Top 3 remunerations ----> ");

        manager.displayTop3Remunerations(employees);



    }
}
