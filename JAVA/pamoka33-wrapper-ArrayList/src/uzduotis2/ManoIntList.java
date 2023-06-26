package uzduotis2;

import java.util.Arrays;

public class ManoIntList {
    private int dabartinisDydis;
    private int maksimalusDydis;

    private int[] masyvas;

    public ManoIntList() {
        this.maksimalusDydis = 8;
        this.dabartinisDydis = 1;
        this.masyvas = new int[dabartinisDydis];

    }

    public ManoIntList(int maksimalusDydis) {
        this.maksimalusDydis = maksimalusDydis;
        this.masyvas = new int[maksimalusDydis];
        this.dabartinisDydis = 0;
    }

    public int getDabartinisDydis() {
        return dabartinisDydis;
    }

    public void setDabartinisDydis(int dabartinisDydis) {
        this.dabartinisDydis = dabartinisDydis;
    }

    public int getMaksimalusDydis() {
        return maksimalusDydis;
    }

    public void setMaksimalusDydis(int maksimalusDydis) {
        this.maksimalusDydis = maksimalusDydis;
    }

    public int[] getMasyvas() {
        return masyvas;
    }

    public void setMasyvas(int[] masyvas) {
        this.masyvas = masyvas;
    }

    @Override
    public String toString() {

        return "ManoIntList{" +
                "dabartinisDydis=" + dabartinisDydis +
                ", maksimalusDydis=" + maksimalusDydis +
                ", masyvas=" + Arrays.toString(Arrays.copyOfRange(masyvas, 0, dabartinisDydis)) +
                '}';
    }

    public void ideti(int skaicius) {
        if (this.dabartinisDydis >= this.masyvas.length) {
            int naujasDydis;
            if(this.masyvas.length == 0){
                naujasDydis = 1;
            }else {
                naujasDydis = this.masyvas.length * 2;
            }
            this.masyvas = sukurtiDidesniMasyva(this.masyvas, naujasDydis);
            this.maksimalusDydis = naujasDydis;

        }
        this.masyvas[this.dabartinisDydis] = skaicius;
        this.dabartinisDydis++;

    }

    public int[] sukurtiDidesniMasyva(int[] arr, int indeksas) {
        return Arrays.copyOf(arr, indeksas);
    }

    public void masyvoElementoPasalinimas(int x){
        int[] naujasArr = new int[this.masyvas.length - 1];
        int ind = 0;
        for (int i = 0; i < this.masyvas.length; i++) {
            if (i != x){
                naujasArr[ind] = this.masyvas[i];
                ind++;
            }
        }
        this.masyvas = Arrays.copyOfRange(naujasArr,0, naujasArr.length - 1);
        this.dabartinisDydis--;
    }

}
