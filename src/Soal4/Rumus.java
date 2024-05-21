package Soal4;

public class Rumus {
    private double volume;
    private double time;
    private double dropFactor;
    private double dropRate;

    public Rumus(double volume, double time, double dropFactor) {
        this.volume = volume;
        this.time = time;
        this.dropFactor = dropFactor;
    }

    public Rumus(double dropRate, double time, double dropFactor, boolean isVolume) {
        this.dropRate = dropRate;
        this.time = time;
        this.dropFactor = dropFactor;
    }

    public double calculateDropRate() {
        return (volume / time) * dropFactor;
    }

    public double calculateVolumeInfused() {
        return (dropRate / dropFactor) * time;
    }
}
