package fr.bath;

public class Robinet {

    private Baignoire baignoire;
    private int volume;

    public Robinet(Baignoire baignoire, int volume) {
        this.baignoire = baignoire;
        this.volume = volume;
    }

    public void debite() {

        while (this.baignoire.getVolume() < this.baignoire.getVolumeMax()){
            System.out.println(this.baignoire.getVolume());

            this.baignoire.setVolume(this.baignoire.getVolume() + this.volume);
        }



        System.out.println("Niveau final de la baignoire : ");
        System.out.println(this.baignoire.getVolume());
    }
}
