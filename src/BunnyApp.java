public class BunnyApp {
    public static void main(String[] args) {

        Bunny rabbit= new Bunny("Hase");
        Bunny roger= new Bunny("tartufina");
        Bunny pippo= new Bunny("tartufina","cioccolata",Season.AUTUMN);
        rabbit.changeFa("ESS");
        rabbit.setFav("we");   //ist private

        rabbit.setName("pippo");
        System.out.println(rabbit.getBiD());
        System.out.println(Bunny.getNextBunnyID());

        String x=27 >43 ? "Yes":"not";
        System.out.println("rabbit = " + rabbit.toString());

        if(27<42) {
             x="yes";
        } else {
            x="not";
        }
    }
}
