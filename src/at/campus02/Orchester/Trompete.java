package at.campus02.Orchester;

public class Trompete extends Instrument {

    public Trompete() {
        super(8);
    }

    public int play(){
        System.out.println(" die Trompete spielt,\n mit stärke = " + super.getStärke());
        return super.getStärke();
    }

}
