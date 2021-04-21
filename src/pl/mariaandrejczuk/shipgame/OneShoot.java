package pl.mariaandrejczuk.shipgame;

import java.util.Objects;

public class OneShoot {
    private String x;
    private String y;

    public OneShoot(String x, String y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OneShoot oneshoot = (OneShoot) o;
        return Objects.equals(x, oneshoot.x) && Objects.equals(y, oneshoot.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
