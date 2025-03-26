import java.util.Arrays;

public class Bauernhof {
    private int zeilen;
    private int spalten;
    private Saat[][] felder;
    private Saat[][] felder_historie;

    Bauernhof(int zeilen, int spalten/*, Saat[][] felder_historie*/) {
        this.zeilen = zeilen;
        this.spalten = spalten;
        //this.felder_historie = felder_historie;
    }

    public Saat[] get_erlaubte_nachfolger(Saat s) {
        Saat[] result = new Saat[0];
        return result;
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
