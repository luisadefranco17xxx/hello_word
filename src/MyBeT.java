import java.time.LocalDateTime;

public class MyBeT {
    String data;
    LocalDateTime time;


    public MyBeT(String data) {
        this.data = data;
    }

    public MyBeT(LocalDateTime time) {
        this.time = time;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
