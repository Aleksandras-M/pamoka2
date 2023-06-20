package uzduotis1;

public class Apskritimas {
    double spindulys;


    public Apskritimas(double spindulys) {
        this.spindulys = spindulys;
    }

    public Apskritimas() {

    }

    @Override
    public String toString() {
        return "Apskritimas{" +
                "spindulys=" + spindulys +
                '}';
    }

    public double diametras(){
        return spindulys * 2;
    }

    public void padidintiApskritima(int x){
        spindulys *= x;
    }

    public double ilgis(){
        return 2 * Math.PI * spindulys;
    }

    public double plotas(){
        return Math.PI * spindulys * spindulys;
    }
}
