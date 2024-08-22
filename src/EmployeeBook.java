public class EmployeeBook {
    private final Employee[] employeeBook;

    public EmployeeBook() {
        this.employeeBook = new Employee[10];
    }

    // Добавление сотрудника
    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employeeBook.length - 1; i++) {
            if (employeeBook[i] == null) {
                employeeBook[i] = employee;
                return true;
            }
        }
        return false;
    }

    public boolean addEmployee(String name, double salary, int department, int id) {
        for (int i = 0; i < employeeBook.length - 1; i++) {
            if (employeeBook[i] == null) {
                employeeBook[i] = new Employee(name, salary, department, id);
                return true;
            }
        }
        return false;
    }

    // Удаление сотрудника
    public boolean removeEmployee(int id) {
        for (int i = 0; i < employeeBook.length - 1; i++) {
            if (employeeBook[i] != null && employeeBook[i].getId() == id) {
                employeeBook[i] = null;
                return true;
            }
        }
        return false;
    }

    // Получение сотрудника по ID
    public String getEmployee(int id) {
        String str = "";
        for (int i = 0; i < employeeBook.length - 1; i++) {
            if (employeeBook[i] != null && employeeBook[i].getId() == id) {
                str = employeeBook[i].toString();
            }
        }
        return str;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < employeeBook.length - 1; i++) {
            if (employeeBook[i] != null) {
                str += employeeBook[i].toString() + "\n";
            }
        }
        return str;
    }

    // Суммарная зарплата
    public double getSumSalary() {
        double sum = 0;
        for (int i = 0; i < employeeBook.length - 1; i++) {
            if (employeeBook[i] != null) {
                sum += employeeBook[i].getSalary();
            }
        }
        return sum;
    }

    public double getSumSalary(int department) {
        double sum = 0;
        for (int i = 0; i < employeeBook.length - 1; i++) {
            if (employeeBook[i] != null && employeeBook[i].getDepartment() == department) {
                sum += employeeBook[i].getSalary();
            }
        }
        return sum;
    }

    // Средняя зарплата
    public double getAverageSalary() {
        double sum = 0;
        int counter = 0;
        for (int i = 0; i < employeeBook.length - 1; i++) {
            if (employeeBook[i] != null) {
                sum += employeeBook[i].getSalary();
                counter++;
            }
        }
        return sum / counter;
    }

    public double getAverageSalary(int department) {
        double sum = 0;
        int counter = 0;
        for (int i = 0; i < employeeBook.length - 1; i++) {
            if (employeeBook[i] != null && employeeBook[i].getDepartment() == department) {
                sum += employeeBook[i].getSalary();
                counter++;
            }
        }
        return sum / counter;
    }

    // Сотрудник с минимальной зарплатой
    public void minimumSalaryEmployee() {
        double min = Double.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < employeeBook.length - 1; i++) {
            if (employeeBook[i] != null && employeeBook[i].getSalary() < min) {
                min = employeeBook[i].getSalary();
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("Сотрудник с минимальной зарплатой: " + employeeBook[index].toString());
        } else {
            System.out.println("Ошибка поиска");
        }
    }

    public void minimumSalaryEmployee(int department) {
        double min = Double.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < employeeBook.length - 1; i++) {
            if (employeeBook[i] != null && employeeBook[i].getDepartment() == department && employeeBook[i].getSalary() < min) {
                min = employeeBook[i].getSalary();
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("Сотрудник с минимальной зарплатой в отделе " + department + ": " + employeeBook[index].toString());
        } else {
            System.out.println("Ошибка поиска");
        }
    }

    // Сотрудник с максимальной зарплатой
    public void maximumSalaryEmployee() {
        double max = 0.0;
        int index = -1;
        for (int i = 0; i < employeeBook.length - 1; i++) {
            if (employeeBook[i] != null && employeeBook[i].getSalary() > max) {
                max = employeeBook[i].getSalary();
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("Сотрудник с максимальной зарплатой: " + employeeBook[index].toString());
        } else {
            System.out.println("Ошибка поиска");
        }
    }

    public void maximumSalaryEmployee(int department) {
        double max = 0.0;
        int index = -1;
        for (int i = 0; i < employeeBook.length - 1; i++) {
            if (employeeBook[i] != null && employeeBook[i].getDepartment() == department && employeeBook[i].getSalary() > max) {
                max = employeeBook[i].getSalary();
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("Сотрудник с максимальной зарплатой в отделе " + department + ": " + employeeBook[index].toString());
        } else {
            System.out.println("Ошибка поиска");
        }
    }

    // Индексация зарплаты
    public void indexSalary(int index) {
        for (int i = 0; i < employeeBook.length - 1; i++) {
            if (employeeBook[i] != null) {
                employeeBook[i].setSalary(employeeBook[i].getSalary() * (1.0 + index / 100.0));
            }
        }
    }

    public void indexSalary(int index, int department) {
        for (int i = 0; i < employeeBook.length - 1; i++) {
            if (employeeBook[i] != null && employeeBook[i].getDepartment() == department) {
                employeeBook[i].setSalary(employeeBook[i].getSalary() * (1.0 + index / 100.0));
            }
        }
    }

    // ФИО всех сотрудников
    public void namesOfAllEmployees() {
        for (int i = 0; i < employeeBook.length - 1; i++) {
            if (employeeBook[i] != null) {
                System.out.println(employeeBook[i].getName());
            }
        }
        System.out.println();
    }

    // Данные всех сотрудников отдела
    public void namesOfEmployeesOfDepartment(int department) {
        for (int i = 0; i < employeeBook.length - 1; i++) {
            if (employeeBook[i] != null && employeeBook[i].getDepartment() == department) {
                System.out.println(employeeBook[i].getId() + " " + employeeBook[i].getName() + " " + employeeBook[i].getSalary());
            }
        }
        System.out.println();
    }

    // Сортировка по уровню зарплаты
    public void salaryLessOf(double salary) {
        System.out.println("Сотрудники с зарплатой менньше " + salary + ":");
        for (int i = 0; i < employeeBook.length - 1; i++) {
            if (employeeBook[i] != null && employeeBook[i].getSalary() < salary) {
                System.out.println(employeeBook[i]);
            }
        }
        System.out.println();
    }

    public void salaryMoreOf(double salary) {
        System.out.println("Сотрудники с зарплатой больше " + salary + ":");
        for (int i = 0; i < employeeBook.length - 1; i++) {
            if (employeeBook[i] != null && employeeBook[i].getSalary() > salary) {
                System.out.println(employeeBook[i]);
            }
        }
        System.out.println();
    }
}
