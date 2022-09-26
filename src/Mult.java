public class Mult implements Operation {
    private int a;
    private int b;

    public Mult(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int resultat(){
        return this.a*this.b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void accept(Visiteur v){
        v.visiteMult(this);
    }
}
