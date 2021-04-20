public class Bunny {
    private String name;
    private  String fav;
    private Season birthSeason;
    private int biD;
    private static int bunnyID=1000;   //memorizza il valore precendente

// Konstracktur  ohne pramehere
 //   public Bunny(){ fav="carrots";}
    public Bunny(String name){
        this.name=name;
        this.biD =bunnyID;
        bunnyID +=1000;
        birthSeason=Season.SUMMER;
    }

    public int getBiD() {
        return biD;
    }

    public static  int getNextBunnyID(){
        return bunnyID;          // posso chiamre sno parametri static
    }

    public Bunny(String name, String fav, Season s){
        this.fav=fav;
        this.name=name;
    this.birthSeason=s;}

    public String getName() {
        return name;
    }

    public String getFav() {
        return fav;
    }

    public void setName(String name) {
        if (name!=null) {
            this.name = name;
            output();
        }

    }

    public void setFav(String fav) {
        this.fav = fav;
    }

    public void changeFa(String fav){
        this.fav = fav;  //fa riferimento a lláttributo della classe

        String name;
        name="Pippo";        // faccio riferimento alla variabile locale


    }

    public Season getBirthSeason() {
        return birthSeason;
    }

    public void setBirthSeason(Season birthSeason) {
        this.birthSeason = birthSeason;
    }

    private void output(){
        System.out.println("name + fav = " + name + fav);
    }

    @Override
    public String toString() {
        return "Bunny{" +
                "name='" + name + '\'' +
                ", fav='" + fav + '\'' +
                ", birth='" + birthSeason + '\'' +
                '}';
    }
}
