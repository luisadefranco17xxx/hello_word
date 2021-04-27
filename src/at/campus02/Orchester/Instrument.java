package at.campus02.Orchester;

public abstract class Instrument {
    private int stärke;

    public Instrument(int stärke) {
        this.stärke = stärke;
    }

    public int getStärke() {
        return stärke;
    }

    public abstract int play();

}
