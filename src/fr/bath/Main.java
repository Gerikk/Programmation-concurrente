package fr.bath;

public class Main {
    public static void main(String[] args) {
        Baignoire baignoire = new Baignoire(1000);
        Robinet robinet = new Robinet(baignoire, 70);
        robinet.debite();
    }
}
