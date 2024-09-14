package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Employee {
    private String name;
    private double salary;
    private double basicSalary;
    private double bonus;
    private String designation;
    private Date dateOfJoining;
    private double houseAllowance;
    private double transportAllowance;
    private double costOfLiving;

    public Employee() { }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, double basicSalary, String designation) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.houseAllowance = basicSalary * 0.4;
        this.transportAllowance = 5000;
        this.costOfLiving = 1000;
        this.designation = designation;
        this.dateOfJoining = new Date();
    }

    public Employee(String name, double basicSalary, double bonus, String designation, Date dateOfJoining) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.designation = designation;
        this.dateOfJoining = dateOfJoining;
    }

    public double getSalary() {
        return basicSalary + houseAllowance + transportAllowance + costOfLiving + bonus;
    }

    public double calculateSalary() {
        double houseAllowance = 0.4 * basicSalary;
        double transportAllowance = 5000;
        double costOfLiving = 800;
        return basicSalary + houseAllowance + transportAllowance + costOfLiving + bonus;
    }

    public void saveToDatabase() {
        // Implement database saving logic here
    }

    public void generateReport() {
        EmployeeController employeeController = new EmployeeController();
        System.out.println(employeeController.getAllEmployees().size());
        String outputPath = "EmployeeReport.xml";
        System.out.println(outputPath);
        generateEmployeeXMLReport(employeeController.getAllEmployees(), outputPath);
    }

    public void generateEmployeeXMLReport(List<Employee> employees, String outputPath) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();

            Element rootElement = doc.createElement("EmployeeData");
            doc.appendChild(rootElement);

            for (Employee employee : employees) {
                Element employeeElement = doc.createElement("Employee");
                rootElement.appendChild(employeeElement);

                Element nameElement = doc.createElement("Name");
                nameElement.appendChild(doc.createTextNode(employee.getName()));
                employeeElement.appendChild(nameElement);

                Element basicSalaryElement = doc.createElement("BasicSalary");
                basicSalaryElement.appendChild(doc.createTextNode(String.valueOf(employee.getBasicSalary())));
                employeeElement.appendChild(basicSalaryElement);

                Element bonusElement = doc.createElement("Bonus");
                bonusElement.appendChild(doc.createTextNode(String.valueOf(employee.getBonus())));
                employeeElement.appendChild(bonusElement);

                Element designationElement = doc.createElement("Designation");
                designationElement.appendChild(doc.createTextNode(employee.getDesignation()));
                employeeElement.appendChild(designationElement);

                Element dateOfJoiningElement = doc.createElement("DateOfJoining");
                dateOfJoiningElement.appendChild(doc.createTextNode(employee.getDateOfJoining().toString()));
                employeeElement.appendChild(dateOfJoiningElement);

                Element totalSalaryElement = doc.createElement("TotalSalary");
                totalSalaryElement.appendChild(doc.createTextNode(String.valueOf(employee.getSalary())));
                employeeElement.appendChild(totalSalaryElement);
            }

            // Write the content into an XML file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(outputPath);
            transformer.transform(source, result);

            System.out.println("Employee XML report generated successfully.");
        } catch (Exception ex) {
            System.out.println("Error generating the employee XML report: " + ex.getMessage());
        }
    }

    // Getter and setter methods for private fields go here

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public String getDesignation() {
        return designation;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }
}

class EmployeeController {
    private List<Employee> employees = new ArrayList<>();

    public EmployeeController() {
        hireEmployee("John Doe", 5000, 1000, "Engineer", new Date());
        hireEmployee("Jane Smith", 6000, 1200, "Manager", new Date(2021 - 1900, 8 - 1, 22));
        hireEmployee("Bob", 30000, "Worker");
    }

    public void hireEmployee(String name, double basicSalary, double bonus, String designation, Date dateOfJoining) {
        Employee employee = new Employee(name, basicSalary, bonus, designation, dateOfJoining);
        employees.add(employee);
    }

    public void hireEmployee(String name, double basicSalary, String designation){
        Employee employee = new Employee(name, basicSalary, designation);
        employees.add(employee);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}

class Program {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.generateReport();
    }
}
