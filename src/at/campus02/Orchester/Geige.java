package at.campus02.Orchester;

public class Geige extends Instrument {

    public Geige(int l) {

        super(l);
    }

    @Override
    public int play(){
        System.out.println(" die Geige spielt,\n mit stärke = " + super.getStärke());
        return super.getStärke();
    }


}
