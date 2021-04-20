package mx;

import java.time.LocalDateTime;

public class MayBeApp {
    public static void main(String[] args) {
        MayBe<String> s = new MayBe<String>("Hallo Welt!",1);
        s.setData("Hallo Welt!");

        LocalDateTime localDateTime=LocalDateTime.now();
        MayBe<LocalDateTime> c = new MayBe<LocalDateTime>(localDateTime,2);

        System.out.println(c.print());

    }
}
