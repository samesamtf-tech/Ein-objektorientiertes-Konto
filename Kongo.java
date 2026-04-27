public class Konto {

    private String inhaber;
    private double kontostand;

    public Konto(String inhaber, double startbetrag) {
        this.inhaber = inhaber;
        this.kontostand = startbetrag;
    }

    public void einzahlen(double betrag) {
        kontostand += betrag;
    }

    public void abheben(double betrag) {
        if (betrag <= kontostand) {
            kontostand -= betrag;
        } else {
            System.out.println("Nicht genug Geld!");
        }
    }

    public double getKontostand() {
        return kontostand;
    }

    public String getInhaber() {
        return inhaber;
    }
}
