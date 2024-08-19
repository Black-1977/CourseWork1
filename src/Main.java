public class Main {
    public static void main(String[] args) {
        Employee man1 = new Employee("Иванов Сергей", 55000, 1),
                man2 = new Employee("Петров Дмитрий", 83000, 1),
                man3 = new Employee("Кузнецов Олег", 28000, 3);
        EmployeeBook book = new EmployeeBook();
        if (book.addEmployee(man1)) {
            System.out.println("Нет квот.");
        }
        if (book.addEmployee(man2)) {
            System.out.println("Нет квот.");
        }
        if (!book.addEmployee("Дмитриев Алексей", 65000, 2)) {
            System.out.println("Нет квот.");
        }
        if (book.addEmployee(man3)) {
            System.out.println("Нет квот.");
        }
        System.out.println(book);

        System.out.println("Суммарная зарплата за месяц: " + book.getSumSalary());
        System.out.println("Средняя зарплата за месяц: " + book.getAverageSalary());
        book.maximumSalaryEmployee();
        book.minimumSalaryEmployee();
        book.indexSalary(50);
        System.out.println("Зарплата после индексации:\n" + book);
        book.namesOfAllEmployees();

        double salary = 80_000;
        book.salaryLessOf(salary);
        book.salaryMoreOf(salary);

        int dept = 1;
        System.out.println("Суммарная зарплата за месяц в отделе " + dept + ": " + book.getSumSalary(dept));
        System.out.println("Средняя зарплата за месяц в отделе " + dept + ": " + book.getAverageSalary(dept));
        book.maximumSalaryEmployee(dept);
        book.minimumSalaryEmployee(dept);
        book.indexSalary(50, dept);
        System.out.println("Отдел " + dept + " после индексации:");
        book.namesOfEmployeesOfDepartment(dept);


        if (!book.removeEmployee(2)) {
            System.out.println("Нет такого сотрудника.");
        }
        System.out.println("Компания после удаления сотрудника:\n" + book);

    }
}
