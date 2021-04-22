package at.campus02.Orchester;

public class Gitarre extends Instrument {


    public Gitarre() {
        super(7);
    }

    public int play(){
        System.out.println(" die Gitarre spielt,\n mit stärke = " + super.getStärke());
        return super.getStärke();
    }

}
