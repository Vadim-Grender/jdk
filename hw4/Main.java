import java.util.List;

public class Main {
    public static void main(String[] args) {
        PeopleBook directory = new PeopleBook();

        directory.addPeople(new People(1, "11111111", "Иван Иванов", 2));
        directory.addPeople(new People(2, "22222222", "Вася Васин", 4));
        directory.addPeople(new People(3, "33333333", "Петр Петров", 6));

        List<People> employeesWithExperience4 = directory.findPeoplesByExperience(4);
        System.out.println("Сотрудник со стажем 4:");
        for (People employee : employeesWithExperience4) {
            System.out.println(employee.getName());

            List<String> phoneNumbers = directory.findPhoneNumbersByName("Иван Иванов");
            System.out.println("Номер телефона Иван Иванов:");
            for (String phoneNumber : phoneNumbers) {
                System.out.println(phoneNumber);
            }

            People employeeWithId2 = directory.findPeopleByPeopleId(3);
            if (employeeWithId2 != null) {
                System.out.println("Сотрудник с id 3: " + employeeWithId2.getName());
            } else {
                System.out.println("Сотрудник с id 3 не найден");
            }
        }
    }
}