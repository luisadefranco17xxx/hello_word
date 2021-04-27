package at.campus02.Orchester;

public class Gitarre extends Instrument {


    public Gitarre(int l) {

        super(l);
    }

    @Override
    public int play(){
        System.out.println(" die Gitarre spielt,\n mit stärke = " + super.getStärke());
        return super.getStärke();
    }

}
