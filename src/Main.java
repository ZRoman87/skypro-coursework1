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


    }
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
}