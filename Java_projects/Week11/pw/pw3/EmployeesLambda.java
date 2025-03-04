package Week11.pw.pw3;

public class EmployeesLambda {
    private String firstName;
    private int age;
    private double salary;

    public EmployeesLambda(String firstName, int age, double salary) {
        this.firstName = firstName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("{firstName=\"%s\", age=%d, salary=%.2f}", this.firstName, this.age, this.salary);
    }
}