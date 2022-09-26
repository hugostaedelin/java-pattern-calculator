public class VisiteurSimpleConsole implements Visiteur {
    public void visitePlus(Plus p){
        System.out.println("("+p.getA()+"+"+p.getB()+")");
    }

    public void visiteMult(Mult m) {
        System.out.println(m.resultat());
    }

    public void visitePlus3(Plus3 p3){
        System.out.println(p3.resultat());
    }

    public void visiteValeur(Valeur v){
        System.out.println(v.resultat());
    }

    public void visiteDiv(Div dv){
        System.out.println(dv.resultat());
    }

    public void visiteCompo(Composite compo){
        System.out.println(compo.resultat());
    }
}
