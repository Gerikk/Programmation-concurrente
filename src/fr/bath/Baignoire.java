package fr.bath;

public class Baignoire {

    private final int volumeMax;
    private int volume;
    private int volumeFuite;

    public Baignoire(int volumeMax) {
        this.volumeMax = volumeMax;
        this.volume = 0;
        this.volumeFuite = 0;
    }

    public Baignoire(int volumeMax, int volumeFuite) {
        this.volumeMax = volumeMax;
        this.volume = 0;
        this.volumeFuite = volumeFuite;
    }

    public void fuite(){
        while (this.volume > 0){
            this.volume = this.volume - this.volumeFuite;
            System.out.println("Fuite ! La baignoire est a : " + this.volume);
        }
    };


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0 || volume > this.volumeMax) {
            throw new IllegalArgumentException("Erreur !");
        } else {
            this.volume = volume;
        }

    }

    public int getVolumeMax() {
        return volumeMax;
    }
}
