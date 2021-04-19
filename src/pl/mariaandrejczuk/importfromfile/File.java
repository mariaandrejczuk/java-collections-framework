package pl.mariaandrejczuk.importfromfile;

public class File {
    private Person[] people = new Person[7];

    public File() {
        prepareData();
    }

    private void prepareData() {
        people[0] = new Person("Marek", "Kowalski", "88010102766");
        people[1] = new Person("Jarek", "Bolski", "86010102766");
        people[2] = new Person("Anna", "Nowak", "88056102766");
        people[3] = new Person("Jarek", "Bolski", "86010102766");
        people[4] = new Person("Julia", "Bolska", "76010102766");
        people[5] = new Person("Jan", "Wolski", "56010102766");
        people[6] = new Person("Filip", "Nowak", "86010105666");

    }

    public Person[] getPeople() {
        return people;
    }
}
