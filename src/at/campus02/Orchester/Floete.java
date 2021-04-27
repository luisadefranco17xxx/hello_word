package at.campus02.Orchester;

public class Floete extends Instrument{

    public Floete(int stärke) {
        super(stärke);
    }

    @Override
    public int play() {
        System.out.println(" die Flöte spielt,\n mit stärke = " + super.getStärke());
        return super.getStärke();
    }

}
