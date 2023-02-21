package very_difficult;

public class EmployeeBook {
    int bookSize = 10;
    private Employee[] employees = new Employee[bookSize];

    // Добавление сотрудника
    public void addEmployee(String surname, String name, String patronymic, String department, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(surname, name, patronymic, department, salary);
                break;
            } else {
                if (i == (employees.length - 1)) {
                    System.out.println("ОШИБКА: Книга заполнена");
                }
            }
        }
    }

    // Удаление сотрудника
    public void removeEmployee(String surname, String name, String patronymic) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSurname().equals(surname) & employees[i].getName().equals(name) && employees[i].getPatronymic().equals(patronymic)) {
                employees[i] = null;
                System.out.println("Сотрудник " + surname + " " + name + " " + patronymic + " удален из книги");
                break;
            } else {
                if (i == (employees.length - 1)) {
                    System.out.println("ОШИБКА: Сотрудник " + surname + " " + name + " " + patronymic + " не найден");
                }
            }
        }
    }

    // Изменение зарплаты сотрудника

    public void changeEmployeeSalary(String surname, String name, String patronymic, double newSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSurname().equals(surname) & employees[i].getName().equals(name) && employees[i].getPatronymic().equals(patronymic)) {
                employees[i].setSalary(newSalary);
                break;
            } else {
                if (i == (employees.length - 1)) {
                    System.out.println("ОШИБКА: Сотрудник " + surname + " " + name + " " + patronymic + " не найден");
                }
            }
        }
    }

    // Изменение отдела сотрудника

    public void changeEmployeeDepartment(String surname, String name, String patronymic, String newDepartment) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSurname().equals(surname) & employees[i].getName().equals(name) && employees[i].getPatronymic().equals(patronymic)) {
                employees[i].setDepartment(newDepartment);
                break;
            } else {
                if (i == (employees.length - 1)) {
                    System.out.println("ОШИБКА: Сотрудник " + surname + " " + name + " " + patronymic + " не найден");
                }
            }
        }
    }

    public void printEmployeesFullNameByDepartment() {
        String[] list = getDepartmentList();

        for (int i = 0; i < list.length; i++) {
            if(list[i] != null) {
                System.out.println("Отдел " + list[i]);
                for (int j = 0; j < employees.length; j++) {
                    if (employees[j].getDepartment().equals(list[i])) {
                        System.out.println(employees[j].getSurname() + " " + employees[j].getName() + " " + employees[j].getPatronymic());
                    }
                }
            }
        }
    }

    public String[] getDepartmentList() {
        String[] list = new String[employees.length];
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[j] == null) {
                    list[j] = employees[i].getDepartment();
                    break;
                } else {
                    if (list[j].equals(employees[i].getDepartment())) {
                        break;
                    }
                }
            }

        }
        return list;
    }
    public void printEmployeesList() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }

    public void printEmployeesFullName() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getSurname() + " " + employees[i].getName() + " " + employees[i].getPatronymic());
            }
        }
    }

    public double getSalarySum() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    public Employee getEmployeeWithMinSalary() {
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

    public Employee getEmployeeWithMaxSalary() {
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

    public int getEmployeesAmount() {
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                counter++;
            }
        }
        return counter;
    }

    public double getSalaryAverage() {
        return getSalarySum() / getEmployeesAmount();
    }

    public void indexSalary(int percent) {
        for (Employee emp : employees) {
            if (emp != null) {
                emp.setSalary(emp.getSalary() * (100 + percent) / 100);
            }
        }
    }

    public void printEmployeesListForDepartment(String department) {
        for (Employee emp : employees) {
            if ((emp != null) && (emp.getDepartment().equals(department))) {
                System.out.println(emp.toString(department));
            }
        }
    }

    public Employee getEmployeeWithMinSalaryForDepartment(String department) {
        double min = Double.MAX_VALUE;
        Employee returnEmp = null;

        for (Employee emp : employees) {
            if (emp != null && emp.getDepartment().equals(department) && emp.getSalary() < min) {
                min = emp.getSalary();
                returnEmp = emp;
            }
        }
        return returnEmp;
    }

    public Employee getEmployeeWithMaxSalaryForDepartment(String department) {
        double max = Double.MIN_VALUE;
        Employee returnEmp = null;

        for (Employee emp : employees) {
            if (emp != null && emp.getDepartment().equals(department) && emp.getSalary() > max) {
                max = emp.getSalary();
                returnEmp = emp;
            }
        }
        return returnEmp;
    }

    public double getSalarySumForDepartment(String department) {
        double sum = 0;
        for (Employee emp : employees) {
            if (emp != null && emp.getDepartment().equals(department)) {
                sum += emp.getSalary();
            }
        }
        return sum;
    }

    public int getEmployeesAmountForDepartment(String department) {
        int counter = 0;
        for (Employee emp : employees) {
            if (emp != null & emp.getDepartment().equals(department)) {
                counter++;
            }
        }
        return counter;
    }

    public double getSalaryAverageForDepartment(String department) {
        return getSalarySumForDepartment(department) / getEmployeesAmountForDepartment(department);
    }

    public void indexSalaryForDepartment(String department, int percent) {
        for (Employee emp : employees) {
            if (emp != null && emp.getDepartment().equals(department)) {
                emp.setSalary(emp.getSalary() * (100 + percent) / 100);
            }
        }
    }

    public void printEmployeeWithSalaryLess(double salaryLimit) {
        for (Employee emp : employees) {
            if (emp != null && emp.getSalary() < salaryLimit) {
                System.out.println(emp.toString(emp.getDepartment()));
            }
        }
    }

    public void printEmployeeWithSalaryMore(double salaryLimit) {
        for (Employee emp : employees) {
            if (emp != null && emp.getSalary() > salaryLimit) {
                System.out.println(emp.toString(emp.getDepartment()));
            }
        }
    }

}
