public class Employee {
    private final String firstName;
    private final String lastName;
    private final int postalCode;
    private final String street;
    private final String district;
    private final int age;
    private final String designation;
    private final double remuneration;

    public Employee(String firstName, String lastName, int postalCode, String street, String district, int age, String designation, double remuneration) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
        this.street = street;
        this.district = district;
        this.age = age;
        this.designation = designation;
        this.remuneration = remuneration;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getPostalCode() {
        return this.postalCode;
    }

    public String getStreet() {
        return this.street;
    }

    public String getDistrict() {
        return this.district;
    }

    public int getAge() {
        return this.age;
    }

    public String getDesignation() {
        return this.designation;
    }

    public double getRemuneration() {
        return this.remuneration;
    }
}