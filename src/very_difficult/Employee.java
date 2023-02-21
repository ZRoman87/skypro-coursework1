package very_difficult;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private String department;
    private double salary;
    private int id;
    private static int counter = 1;

    public Employee(String surname, String name, String patronymic, String department, double salary) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "ФИО: " + surname + " " + name + " " + patronymic +
                " Отдел: " + department +
                " Зарплата: " + salary +
                " ID: " + id;
    }

    public String toString(String department) {
        return  "ФИО: " + surname + " " + name + " " + patronymic +
                " Зарплата: " + salary +
                " ID: " + id;
    }
}
