package at.campus02.Orchester;

public class Instrument {
    private int stärke;

    public Instrument(int stärke) {
        this.stärke = stärke;
    }

    public int getStärke() {
        return stärke;
    }

    public int play(){
       return stärke;
   }

}
