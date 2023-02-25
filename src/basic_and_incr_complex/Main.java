package basic_and_incr_complex;

public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Иванов", "Иван", "Иванович", "1", 10_000);
        employees[1] = new Employee("Петров", "Петр", "Петрович", "2", 20_000);
        employees[2] = new Employee("Сидоров", "Сидор", "Сидорович", "3", 30_000);
        employees[3] = new Employee("Федоров", "Федор", "Федорович", "4", 40_000);
        employees[4] = new Employee("Алексеев", "Алексей", "Алексеевич", "5", 50_000);
        employees[5] = new Employee("Сергеев", "Сергей", "Сергеевич", "1", 60_000);
        employees[6] = new Employee("Романов", "Роман", "Романович", "2", 70_000);
        employees[7] = new Employee("Андреев", "Андрей", "Андреевич", "3", 80_000);
        employees[8] = new Employee("Александров", "Александр", "Александрович", "4", 90_000);
        employees[9] = new Employee("Николаев", "Николай", "Николаевич", "5", 100_000);

        // Базовая сложность

        System.out.println("Список сотрудников:");
        printEmployeesList();

        System.out.println();

        System.out.println("ФИО сотрудников:");
        printEmployeesFullName();

        System.out.println();

        System.out.print("Сумма затрат на зарплаты в месяц: ");
        System.out.println(getSalarySum());

        System.out.println();

        System.out.println("Сотрудник с минимальной зарплатой:");
        System.out.println(getEmployeeWithMinSalary());

        System.out.println();

        System.out.println("Сотрудник с максимальной зарплатой:");
        System.out.println(getEmployeeWithMaxSalary());

        System.out.println();

        System.out.println("Средняя зарплата сотрудников:");
        System.out.println(getSalaryAverage());

        System.out.println();

        // Повышенная сложность

        int salaryIndexInPercent = 10;
        System.out.println("Зарплаты после индексации на " + salaryIndexInPercent + " процентов:");
        indexSalary(salaryIndexInPercent);
        printEmployeesList();

        System.out.println();

        String department = "2";
        System.out.println("Список сотрудников департамента " + department);
        printEmployeesListForDepartment(department);

        System.out.println();

        System.out.println("Сотрудник с минимальной зарплатой из департамента: " + department);
        System.out.println(getEmployeeWithMinSalaryForDepartment(department));

        System.out.println();

        System.out.println("Сотрудник с максимальной зарплатой из департамента: " + department);
        System.out.println(getEmployeeWithMaxSalaryForDepartment(department));

        System.out.println();

        System.out.println("Сумма затрат на зарплаты в месяц в департаменте: " + department);
        System.out.println(getSalarySumForDepartment(department));

        System.out.println();

        System.out.println("Средняя зарплата сотрудников в департаменте: " + department);
        System.out.println(getSalaryAverageForDepartment(department));

        System.out.println();

        int salaryIndexInPercentForDepartment = 10;
        System.out.println("Зарплаты после индексации на " + salaryIndexInPercentForDepartment + " процентов в департаменте: " + department);
        indexSalaryForDepartment(department,salaryIndexInPercentForDepartment);
        printEmployeesList();

        System.out.println();

        double salaryLimit = 50000;
        System.out.println("Сотрудники с зарплатой меньше " + salaryLimit);
        printEmployeeWithSalaryLess(salaryLimit);

        System.out.println();

        System.out.println("Сотрудники с зарплатой больше " + salaryLimit);
        printEmployeeWithSalaryMore(salaryLimit);

        System.out.println();



    }

    // -------------------------- Базовая сложность --------------------------

    public static void printEmployeesList() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }

    public static void printEmployeesFullName() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getSurname() + " " + employees[i].getName() + " " + employees[i].getPatronymic());
            }
        }
    }
    public static double getSalarySum() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    public static Employee getEmployeeWithMinSalary() {
        double min = Double.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                index = i;
            }
        }
        return employees[index];
    }

    public static Employee getEmployeeWithMaxSalary() {
        double max = Double.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                index = i;
            }
        }
        return employees[index];
    }

    public static int getEmployeesAmount() {
    int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                counter++;
            }
        }
        return counter;
    }

    public static double getSalaryAverage() {
        return getSalarySum()/getEmployeesAmount();
    }

    // -------------------------- Повышенная сложность --------------------------

    public static void indexSalary(int percent) {
        for (Employee emp: employees) {
            if (emp != null) {
                emp.setSalary(emp.getSalary()*(100 + percent)/100);
            }
        }
    }

    public static void printEmployeesListForDepartment(String department) {
        for (Employee emp: employees) {
            if ((emp != null)&&(emp.getDepartment().equals(department))) {
                System.out.println(emp.toString(department));
            }
        }
    }

    public static Employee getEmployeeWithMinSalaryForDepartment(String department) {
        double min = Double.MAX_VALUE;
        Employee returnEmp = null;

        for (Employee emp: employees) {
            if (emp != null && emp.getDepartment().equals(department) && emp.getSalary() < min) {
                min = emp.getSalary();
                returnEmp = emp;
            }
        }
        return returnEmp;
    }

    public static Employee getEmployeeWithMaxSalaryForDepartment(String department) {
        double max = Double.MIN_VALUE;
        Employee returnEmp = null;

        for (Employee emp: employees) {
            if (emp != null && emp.getDepartment().equals(department) && emp.getSalary() > max) {
                max = emp.getSalary();
                returnEmp = emp;
            }
        }
        return returnEmp;
    }

    public static double getSalarySumForDepartment(String department) {
        double sum = 0;
        for (Employee emp: employees) {
            if (emp != null && emp.getDepartment().equals(department)) {
                sum += emp.getSalary();
            }
        }
        return sum;
    }

    public static int getEmployeesAmountForDepartment(String department) {
        int counter = 0;
        for (Employee emp: employees) {
            if (emp != null & emp.getDepartment().equals(department)) {
                counter++;
            }
        }
        return counter;
    }

    public static double getSalaryAverageForDepartment(String department) {
        return getSalarySumForDepartment(department)/getEmployeesAmountForDepartment(department);
    }

    public static void indexSalaryForDepartment(String department, int percent) {
        for (Employee emp: employees) {
            if (emp != null && emp.getDepartment().equals(department)) {
                emp.setSalary(emp.getSalary()*(100 + percent)/100);
            }
        }
    }

    public static void printEmployeeWithSalaryLess(double salaryLimit) {
        for (Employee emp: employees) {
            if (emp != null && emp.getSalary() < salaryLimit) {
                System.out.println(emp.toString(emp.getDepartment()));
            }
        }
    }

    public static void printEmployeeWithSalaryMore(double salaryLimit) {
        for (Employee emp: employees) {
            if (emp != null && emp.getSalary() > salaryLimit) {
                System.out.println(emp.toString(emp.getDepartment()));
            }
        }
    }
}