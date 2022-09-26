public class Calculatrice {
    Composite c;
    public Calculatrice(Composite c) {
        this.c = c;
    }

    public int calcule(){
        return this.c.resultat();
    }

    public static int calcule(Operation op){
        return op.resultat();
    }


}
