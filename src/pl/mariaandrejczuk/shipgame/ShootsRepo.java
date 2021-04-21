package pl.mariaandrejczuk.shipgame;

import java.util.HashSet;
import java.util.Set;

public class ShootsRepo {
    Set<OneShoot> shoots = new HashSet<>();

    public void add(OneShoot oneshoot) {
        if (shoots.contains(oneshoot)) {
            System.out.println();
            System.out.println("This location is not available anymore. Try again.");
            System.out.println();
        } else {
            shoots.add(oneshoot);
        }
    }

    @Override
    public String toString() {
        return "Shoots done so far: " + shoots;
    }
}