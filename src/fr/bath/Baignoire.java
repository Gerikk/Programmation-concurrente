package fr.bath;

public class Baignoire implements Runnable {

    private final int volumeMax;
    private int volume;
    private int volumeFuite;

    public Baignoire(int volumeMax, int volumeFuite) {
        this.volumeMax = volumeMax;
        this.volume = 0;
        this.volumeFuite = volumeFuite;
    }

    public void fuite() throws InterruptedException {
        while (this.volume > 0) {
            if (volume - volumeFuite < 0) {
                volume = 0;
            } else {
                synchronized (this) {
                    volume -= volumeFuite;
                    System.out.println("Fuite ! La baignoire est a : " + volume);
                    if (this.volume == 0) {
                        colmate();
                    }
                }
            }
            try {
                Thread.sleep(1);
            } catch (Exception e) {
            }

        }
        System.out.println("Baignoire vide");
    }

    public void colmate() {
        synchronized (this) {
            this.volumeFuite -= 1;
            System.out.println("Fuite colmatée : " + this.volumeFuite);
        }

    }

    @Override
    public void run() {
        try {
            fuite();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolumeMax() {
        return volumeMax;
    }
}
