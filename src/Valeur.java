public class Valeur implements Operation {
    private int a;

    public Valeur(int a) {
        this.a = a;
    }

    public int resultat(){
        return this.a;
    }

    public void accept(Visiteur v){
        v.visiteValeur(this);
    }
}
