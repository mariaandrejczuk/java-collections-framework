package pl.mariaandrejczuk.shipgame;

import java.util.Scanner;

public class ShipGameApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ShootsRepo repo = new ShootsRepo();
        int option;

        do {
            System.out.println("---------- ShipGameApp ----------");
            System.out.println("1. - You got a shoot.");
            System.out.println("2. - View shoots' history.");
            System.out.println("0. - End of game.");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Coordinate x: ");
                    String x = scanner.nextLine();
                    System.out.print("Coordinate y: ");
                    String y = scanner.nextLine();

                    OneShoot shoot = new OneShoot(x, y);
                    repo.add(shoot);

                    break;
                case 2:
                    System.out.println(repo);
                    break;
                case 0:
                    System.out.println("You quited the game.");
                    break;
            }
        } while (option != 0);
        scanner.close();
    }
}
