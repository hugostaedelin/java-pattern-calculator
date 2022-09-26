import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Main {
    public static void main(String[] args) {

    }

    @Test
    public void testVRCValeur(){
        Composite c = new Composite();
        Calculatrice calc = new Calculatrice(c);
        c.addOperation(new Mult(10,10));
        Valeur v = new Valeur(calc.calcule());
        Visiteur VRC = new VisiteurRecursifConsole();
        VRC.visiteValeur(v);
    }

    @Test
    public void testVRCAddition() {
        Composite c = new Composite();
        Calculatrice calc = new Calculatrice(c);
        Plus p = new Plus(3,5);
        Visiteur VRC = new VisiteurRecursifConsole();
        VRC.visitePlus(p);
    }

    @Test
    public void testVRCAddition3() {
        Composite c = new Composite();
        Calculatrice calc = new Calculatrice(c);
        Plus3 p3 = new Plus3(3,5,2);
        Visiteur VRC = new VisiteurRecursifConsole();
        VRC.visitePlus3(p3);
    }

    @Test
    public void testVCSValeur() {
        Composite c = new Composite();
        Calculatrice calc = new Calculatrice(c);
        c.addOperation(new Mult(3,5));
        Valeur v = new Valeur(calc.calcule());
        Visiteur VCS = new VisiteurSimpleConsole();
        VCS.visiteValeur(v);
    }

    @Test
    public void testVRCMult() {
        Composite c = new Composite();
        Calculatrice calc = new Calculatrice(c);
        Mult m = new Mult(50, 2);
        Visiteur VRC = new VisiteurRecursifConsole();
        VRC.visiteMult(m);
    }

    @Test
    public void testVRCDiv() {
        Composite c = new Composite();
        Calculatrice calc = new Calculatrice(c);
        Div d = new Div(10, 5);
        Visiteur VRC = new VisiteurRecursifConsole();
        VRC.visiteDiv(d);
    }

    @Test
    public void testVCSAddition() {
        Composite c = new Composite();
        Calculatrice calc = new Calculatrice(c);
        Plus p = new Plus(3,5);
        Visiteur VCS = new VisiteurSimpleConsole();
        VCS.visitePlus(p);
    }

    @Test
    public void testVCSAddition3() {
        Composite c = new Composite();
        Calculatrice calc = new Calculatrice(c);
        Plus3 p3 = new Plus3(3,5,2);
        Visiteur VCS = new VisiteurSimpleConsole();
        VCS.visitePlus3(p3);
    }

    @Test
    public void testVCSMult() {
        Composite c = new Composite();
        Calculatrice calc = new Calculatrice(c);
        Mult m = new Mult(50, 2);
        Visiteur VCS = new VisiteurSimpleConsole();
        VCS.visiteMult(m);
    }

    @Test
    public void testPatternVisiteurVRC() throws Exception{
        Composite c = new Composite();
        Calculatrice calc = new Calculatrice(c);
        c.addOperation(new Plus(3,0));
        c.addOperation(new Div(4,(2-1)));
        assertEquals(7,calc.calcule());
        Visiteur VRC = new VisiteurRecursifConsole();
        VRC.visiteCompo(c);
    }

    @Test
    public void testPatternCompo1() throws Exception{
        Composite c = new Composite();
        Calculatrice calc = new Calculatrice(c);
        c.addOperation(new Plus(1,2));
        c.addOperation(new Plus(3,4));
        assertEquals(10,calc.calcule());
    }

    @Test
    public void testPatternCompo2() throws Exception{
        Composite c = new Composite();
        Calculatrice calc = new Calculatrice(c);
        c.addOperation(new Mult(3,(3+2)-(5+6)));
        assertEquals(-18,calc.calcule());
    }

    @Test
    public void testAdd() throws Exception {
        Operation op = new Plus3(20,30,60);
        assertEquals(110,Calculatrice.calcule(op));
    }

    @Test
    public void testMult() throws Exception {
        Operation op = new Mult(10,20);
        assertEquals(200,Calculatrice.calcule(op));
    }
}
