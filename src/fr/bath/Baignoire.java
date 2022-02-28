package fr.bath;

public class Baignoire {

    private final int volumeMax;
    private int volume;

    public Baignoire(int volumeMax) {
        this.volumeMax = volumeMax;
        this.volume = 0;
    }

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
