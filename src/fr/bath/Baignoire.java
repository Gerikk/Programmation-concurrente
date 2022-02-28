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

        try {
            if(volume > this.volumeMax){
                throw new Exception();
            }else if(volume < 0){
                throw new Exception();
            }

            this.volume = volume;
        }catch (Exception e){
            System.out.println(e);
        }


    }

    public int getVolumeMax() {
        return volumeMax;
    }
}
