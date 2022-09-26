public class Plus3 implements Operation {
    private int a;
    private int b;
    private int c;

    public Plus3(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int resultat(){
        return this.a+this.b+this.c;
    }

    public void accept(Visiteur v){
        v.visitePlus3(this);
    }
}
