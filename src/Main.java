public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Иванов", "Иван", "Иванович", "1", 5_000);
        employees[1] = new Employee("Петров", "Петр", "Петрович", "1", 10_000);
        employees[2] = new Employee("Сидоров", "Сидор", "Сидорович", "2", 20_000);
        employees[3] = new Employee("Федоров", "Федор", "Федорович", "3", 30_000);
        employees[4] = new Employee("Алексеев", "Алексей", "Алексеевич", "4", 40_000);
        employees[5] = new Employee("Сергеев", "Сергей", "Сергеевич", "5", 50_000);

        for (int i = 0; i < 9; i++) {
            System.out.println(employees[i]);
        }


    }
}