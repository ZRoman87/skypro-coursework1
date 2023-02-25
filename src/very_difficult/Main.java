package very_difficult;

public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        System.out.println("Добавляем 10 сотрудников");

        employeeBook.addEmployee("Иванов", "Иван", "Иванович", "1", 10_000);
        employeeBook.addEmployee("Петров", "Петр", "Петрович", "2", 20_000);
        employeeBook.addEmployee("Сидоров", "Сидор", "Сидорович", "3", 30_000);
        employeeBook.addEmployee("Федоров", "Федор", "Федорович", "4", 40_000);
        employeeBook.addEmployee("Алексеев", "Алексей", "Алексеевич", "5", 50_000);
        employeeBook.addEmployee("Сергеев", "Сергей", "Сергеевич", "1", 60_000);
        employeeBook.addEmployee("Романов", "Роман", "Романович", "2", 70_000);
        employeeBook.addEmployee("Андреев", "Андрей", "Андреевич", "3", 80_000);
        employeeBook.addEmployee("Александров", "Александр", "Александрович", "4", 90_000);
        employeeBook.addEmployee("Николаев", "Николай", "Николаевич", "5", 100_000);


        System.out.println("Список сотрудников:");
        employeeBook.printEmployeesList();

        System.out.println();

        System.out.println("Добавляем еще одного сотрудника");
        employeeBook.addEmployee("Иванов", "Иван", "Иванович", "1", 10_000);

        System.out.println();

        System.out.println("Удаляем сотрудника");
        employeeBook.removeEmployee("Иванов", "Иван", "Иванович");

        System.out.println();

        System.out.println("Список сотрудников:");
        employeeBook.printEmployeesList();

        System.out.println();

        System.out.println("Добавляем еще одного сотрудника");
        employeeBook.addEmployee("Олегов", "Олег", "Олегович", "1", 10_000);

        System.out.println();

        System.out.println("Список сотрудников:");
        employeeBook.printEmployeesList();

        System.out.println();

        System.out.println("Удаляем несуществующего сотрудника");
        employeeBook.removeEmployee("Иванов", "Петр", "Иванович");

        System.out.println();

        System.out.println("Список сотрудников:");
        employeeBook.printEmployeesList();

        System.out.println();

        System.out.println("Меняем зарплату несуществующего сотрудника");
        employeeBook.changeEmployeeSalary("Иванов", "Иван", "Иванович", 99999);

        System.out.println();

        System.out.println("Меняем зарплату сотрудника");
        employeeBook.changeEmployeeSalary("Николаев", "Николай", "Николаевич", 99999);

        System.out.println();

        System.out.println("Список сотрудников:");
        employeeBook.printEmployeesList();

        System.out.println();

        System.out.println("Меняем отдел несуществующего сотрудника");
        employeeBook.changeEmployeeDepartment("Иванов", "Иван", "Иванович", "5");

        System.out.println();

        System.out.println("Меняем отдел сотрудника");
        employeeBook.changeEmployeeDepartment("Николаев", "Николай", "Николаевич", "1");

        System.out.println();

        System.out.println("Список сотрудников:");
        employeeBook.printEmployeesList();

        System.out.println();

        System.out.println("Список сотрудников по отделам:");
        employeeBook.printEmployeesFullNameByDepartment();

        System.out.println();

        // Методы из базовой сложности

        System.out.println("----- БАЗОВАЯ СЛОЖНОСТЬ -----");
        System.out.println();

        System.out.println("ФИО сотрудников:");
        employeeBook.printEmployeesFullName();

        System.out.println();

        System.out.print("Сумма затрат на зарплаты в месяц: ");
        System.out.println(employeeBook.getSalarySum());

        System.out.println();

        System.out.println("Сотрудник с минимальной зарплатой:");
        System.out.println(employeeBook.getEmployeeWithMinSalary());

        System.out.println();

        System.out.println("Сотрудник с максимальной зарплатой:");
        System.out.println(employeeBook.getEmployeeWithMaxSalary());

        System.out.println();

        System.out.println("Средняя зарплата сотрудников:");
        System.out.println(employeeBook.getSalaryAverage());

        System.out.println();

        System.out.println("----- ПОВЫШЕННАЯ СЛОЖНОСТЬ -----");
        System.out.println();

        int salaryIndexInPercent = 10;
        System.out.println("Зарплаты после индексации на " + salaryIndexInPercent + " процентов:");
        employeeBook.indexSalary(salaryIndexInPercent);
        employeeBook.printEmployeesList();

        System.out.println();

        String department = "2";
        System.out.println("Список сотрудников департамента " + department);
        employeeBook.printEmployeesListForDepartment(department);

        System.out.println();

        System.out.println("Сотрудник с минимальной зарплатой из департамента: " + department);
        System.out.println(employeeBook.getEmployeeWithMinSalaryForDepartment(department));

        System.out.println();

        System.out.println("Сотрудник с максимальной зарплатой из департамента: " + department);
        System.out.println(employeeBook.getEmployeeWithMaxSalaryForDepartment(department));

        System.out.println();

        System.out.println("Сумма затрат на зарплаты в месяц в департаменте: " + department);
        System.out.println(employeeBook.getSalarySumForDepartment(department));

        System.out.println();

        System.out.println("Средняя зарплата сотрудников в департаменте: " + department);
        System.out.println(employeeBook.getSalaryAverageForDepartment(department));

        System.out.println();

        int salaryIndexInPercentForDepartment = 10;
        System.out.println("Зарплаты после индексации на " + salaryIndexInPercentForDepartment + " процентов в департаменте: " + department);
        employeeBook.indexSalaryForDepartment(department,salaryIndexInPercentForDepartment);
        employeeBook.printEmployeesList();

        System.out.println();

        double salaryLimit = 50000;
        System.out.println("Сотрудники с зарплатой меньше " + salaryLimit);
        employeeBook.printEmployeeWithSalaryLess(salaryLimit);

        System.out.println();

        System.out.println("Сотрудники с зарплатой больше " + salaryLimit);
        employeeBook.printEmployeeWithSalaryMore(salaryLimit);

        System.out.println();

    }
}
