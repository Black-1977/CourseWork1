import java.util.Objects;

public class Employee {
    private final String name;
    private int id;
    private double salary;
    private int department;

    public Employee(String name, double salary, int department) {
        this.name = name;
        this.id = 0;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && department == employee.department && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, department, salary);
    }

    @Override
    public String toString() {
        return id + " " + name + ", отдел - " + department + ", зарплата - " + salary + " рублей";
    }


}
