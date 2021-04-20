package at.campus02.wasser;

public class Wasserstand {
    private int id;
    private String GewaesserName;
    private String Ort;
    private double messWert;
    private double messWertFuerAlarmierung;
    private int Zeitpunkt;

    public Wasserstand(int id, String gewaesserName, String ort, double messWert, double messWertFuerAlarmierung, int zeitpunkt) {
        this.id = id;
        GewaesserName = gewaesserName;
        Ort = ort;
        this.messWert = messWert;
        this.messWertFuerAlarmierung = messWertFuerAlarmierung;
        Zeitpunkt = zeitpunkt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGewaesserName() {
        return GewaesserName;
    }

    public void setGewaesserName(String gewaesserName) {
        GewaesserName = gewaesserName;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String ort) {
        Ort = ort;
    }

    public double getMessWert() {
        return messWert;
    }

    public void setMessWert(double messWert) {
        this.messWert = messWert;
    }

    public double getMessWertFuerAlarmierung() {
        return messWertFuerAlarmierung;
    }

    public void setMessWertFuerAlarmierung(double messWertFuerAlarmierung) {
        this.messWertFuerAlarmierung = messWertFuerAlarmierung;
    }

    public int getZeitpunkt() {
        return Zeitpunkt;
    }

    public void setZeitpunkt(int zeitpunkt) {
        Zeitpunkt = zeitpunkt;
    }

    @Override
    public String toString() {
        return "Wasserstand{" +
                "id=" + id +
                ", GewaesserName='" + GewaesserName + '\'' +
                ", Ort='" + Ort + '\'' +
                ", messWert=" + messWert +
                ", messWertFuerAlarmierung=" + messWertFuerAlarmierung +
                ", Zeitpunkt=" + Zeitpunkt +
                '}';
    }


}
