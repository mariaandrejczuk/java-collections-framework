package pl.mariaandrejczuk.clinicregister;

import pl.mariaandrejczuk.importfromfile.Person;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ClinicApp {
    private static final int STOP = -1;
    private static final int LIMIT = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Person> people = new LinkedHashSet<>(); //pamięta kolejność dodawania osób
        int option;

        do {
            System.out.println("-------ClinicApp--------");
            System.out.println("1 - register");
            System.out.println("2 - display all");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                if (people.size() < LIMIT) {
                    case 1:
                        System.out.println("Name: ");
                        String name = scanner.nextLine();

                        System.out.println("Surname: ");
                        String surname = scanner.nextLine();

                        System.out.println("Pesel: ");
                        String pesel = scanner.nextLine();

                        Person person = new Person(name, surname, pesel);
                        people.add(person);
                } else {
                    System.out.println("No place.");
                }
                break;
                case 2:
                    System.out.println(people);
                    break;
            }
        }
        while (option != STOP);
    }
}