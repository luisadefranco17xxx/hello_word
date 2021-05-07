package at.campus02.Event;

public class Event {
    private String Title ;
    private String Ort;
    private Double Eintrittspreis;

    public Event(String title, String ort, Double eintrittspreis) {
        Title = title;
        Ort = ort;
        Eintrittspreis = eintrittspreis;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String ort) {
        Ort = ort;
    }

    public Double getEintrittspreis() {
        return Eintrittspreis;
    }

    public void setEintrittspreis(Double eintrittspreis) {
        Eintrittspreis = eintrittspreis;
    }

    @Override
    public String toString() {
        return "Event{" +
                "Title='" + Title + '\'' +
                ", Ort='" + Ort + '\'' +
                ", Eintrittspreis=" + Eintrittspreis +
                '}';
    }
}
