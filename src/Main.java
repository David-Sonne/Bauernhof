public class Main {
    public static void main(String[] args) {
        Saat[][] history = {
                {Saat.Kartoffeln, Saat.Kartoffeln, Saat.Kartoffeln, Saat.Kartoffeln, Saat.Kartoffeln},
                {Saat.Raps, Saat.Raps, Saat.Raps, Saat.Raps, Saat.Raps},
                {Saat.Reis, Saat.Reis, Saat.Reis, Saat.Reis, Saat.Reis},
                {Saat.Tomaten, Saat.Tomaten, Saat.Tomaten, Saat.Tomaten, Saat.Tomaten}
        };
        Bauernhof bio = new Bauernhof(4, 5, history);
        bio.toString();
    }
}
