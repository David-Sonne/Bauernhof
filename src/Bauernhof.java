import java.util.Arrays;

public class Bauernhof {
    private final int zeilen;
    private final int spalten;
    private Saat[][] felder;
    private final Saat[][] felder_historie;

    Bauernhof(int zeilen, int spalten, Saat[][] felder_historie) {
        this.zeilen = zeilen;
        this.spalten = spalten;
        this.felder_historie = felder_historie;
    }

    public Saat[] get_erlaubte_nachfolger(Saat s) {
        Saat[] result = new Saat[0];
        return result;
    }

    public boolean nachbarkontrolle(int x, int y) {
        Saat thisSeed = felder[x][y];
 
    }

    public Saat[] get_passende_nachbarn(Saat s) {

    }

    public boolean ueberpruefen() {

    }
    @Override
    public String toString() {
        return "Bauernhof{" +
                "zeilen=" + zeilen +
                ", spalten=" + spalten +
                ", felder=" + Arrays.toString(felder) +
                ", felder_historie=" + Arrays.toString(felder_historie) +
                '}';
    }
}
