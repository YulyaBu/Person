import java.util.Scanner;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //          Scanner scanner = new Scanner(System.in);
        //          System.out.print("ВВедите имя: ");
        //          String name = scanner.nextLine();

        //          System.out.print("ВВедите отчество: ");
        //          String middleName = scanner.nextLine();

        //          System.out.print("ВВедите фамилию: ");
        //          String familyName = scanner.nextLine();

        //   String name = "Ivan";
        //   String middleName = "Ivanovich";
        //   String familyName = "Ivanov";

        //  Person person = new Person(name, middleName, familyName);
        //  person.printName();
        //  person.setName(" ");
        //  person.printName();


        //    System.out.print("Первоначальное имя: " + person.getName());
        //    person.setName ("Petr");
        //    System.out.print("Измененное имя: " + person.getName());
        //    System.out.print("Минимальный возраст: " + person.getMinAge());
        //    System.out.print(person);

        class Person {
            int age = 30;

            public int getYearOfBirth() {
                return 2023 - age;
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите возраст: ");
            String name = scanner.nextLine();

            System.out.println("Год рождения: ");
            String YearOfBirth = scanner.nextLine();
        }

    }
}