package pl.zabrze.zs10.kosci4psportowa;
public class Kosc {
    private int wartosc;
    private boolean zablokowana;
    private int idObrazka;
    private int [] idObrazkowKosci = {R.drawable.kosc1, R.drawable.kosc2,
            R.drawable.kosc3,
            R.drawable.kosc4,R.drawable.kosc5,R.drawable.kosc6};

    public void wylosujKosc(){
        if(!zablokowana) {
            wartosc = (int) (Math.random() * 6 + 1);
            idObrazka = idObrazkowKosci[wartosc-1];
        }
    }
    public Kosc() {
        zablokowana =false;
        wylosujKosc();
    }

    public int getWartosc() {
        return wartosc;
    }

    public boolean isZablokowana() {
        return zablokowana;
    }

    public void setZablokowana(boolean zablokowana) {
        this.zablokowana = zablokowana;
    }

    public int getIdObrazka() {
        return idObrazka;
    }
}
