import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVFileHandler {
    private final String filePath;

    public CSVFileHandler(String filePath) {
        this.filePath = filePath;
    }
   // 1. Create a method called readFromCSV that takes in a List<Employee> as a parameter and returns void.
    public void readFromCSV(List<Employee> employees) {
        try (BufferedReader reader = new BufferedReader(new FileReader(this.filePath))) {
            String line;
            boolean firstLine = true;

            while ((line = reader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }

                String[] attributes = line.split(",");
                Employee employee = createEmployee(attributes);
                employees.add(employee);
            }
        } catch (IOException e) {
            System.out.println("File not found! Error: " + e);
        }

    }

    private Employee createEmployee(String[] attributes) {
        String firstName = attributes[0];
        String lastName = attributes[1];
        int postalCode = Integer.parseInt(attributes[2]);
        String street = attributes[3];
        String district = attributes[4];
        int age = Integer.parseInt(attributes[5]);
        String designation = attributes[6];
        double remuneration = Double.parseDouble(attributes[7]);
        return new Employee(firstName, lastName, postalCode, street, district, age, designation, remuneration);
    }

    public void printEmployees(List<Employee> employees) {
        System.out.println("Total employees: " + employees.size());
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + employee.getPostalCode() + " " + employee.getStreet() + " " + employee.getDistrict() + " " + employee.getAge() + " " + employee.getDesignation() + " " + employee.getRemuneration());
        }
    }

}