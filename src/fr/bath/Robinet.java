package fr.bath;

public class Robinet implements Runnable {

    private Baignoire baignoire;
    private int volumeRemplissage;

    public Robinet(Baignoire baignoire, int volume) {
        this.baignoire = baignoire;
        this.volumeRemplissage = volume;
    }

    @Override
    public void run() {
        try {
            debite();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void debite() throws InterruptedException {

        while (this.baignoire.getVolume() + volumeRemplissage <= this.baignoire.getVolumeMax()) {

            synchronized (this.baignoire) {
                this.baignoire.setVolume(this.baignoire.getVolume() + this.volumeRemplissage);
                System.out.println("Remplissage ! volume baignoire : " + this.baignoire.getVolume());
            }
            try {
                Thread.sleep(1);
            } catch (Exception e) {
            }
        }

        System.out.println("Niveau final de la baignoire : ");
        System.out.println(this.baignoire.getVolume());
    }
}
