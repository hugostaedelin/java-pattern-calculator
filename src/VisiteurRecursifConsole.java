import java.util.List;

public class VisiteurRecursifConsole implements Visiteur {
    public void visitePlus(Plus p){
        System.out.println("("+p.getA()+"+"+p.getB()+")");
    }

    public void visiteMult(Mult m) {
        System.out.println("("+m.getA()+"*"+m.getB()+")");
    }

    public void visitePlus3(Plus3 p3){
        System.out.println("("+p3.getA()+"+"+p3.getB()+"+"+p3.getC()+")");
    }

    public void visiteValeur(Valeur v){
        System.out.println(v.resultat());
    }

    public void visiteDiv(Div dv){
        System.out.println("("+dv.getA()+"/"+dv.getB()+")");
    }

    public void visiteCompo(Composite compo){
        
    }
}
