package uzduotis3;

public class Preke {
    private String pavadinimas;
    private double kaina;
    private String kategorija;
    private int kiekis;

    public Preke(String pavadinimas, double kaina, String kategorija, int kiekis) {
        this.pavadinimas = pavadinimas;
        this.kaina = kaina;
        this.kategorija = kategorija;
        this.kiekis = kiekis;
    }

    public Preke() {
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public int getKiekis() {
        return kiekis;
    }

    public void setKiekis(int kiekis) {
        this.kiekis = kiekis;
    }

    @Override
    public String toString() {
        return "Preke{" +
                "pavadinimas='" + pavadinimas + '\'' +
                ", kaina=" + kaina +
                ", kategorija='" + kategorija + '\'' +
                ", kiekis=" + kiekis +
                '}';
    }

    public void kainosKeitimasProcentais(double p){
        this.kaina *= 1 + (p / 100);
    }

    public boolean arPakankamasLikutisSandelyje(int norimasKiekis){
        return norimasKiekis <= this.kiekis;
    }

    
}
