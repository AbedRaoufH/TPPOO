package TP02POO;

public class Applipolynome {
    public static void main(String[] args) {
         Polynome p1 = new Polynome() ; 
        p1.setCoef1(1.0) ;
        p1.setCoef2(1.0);
         p1.setCoef3(1.0);
         Polynome p2 = new Polynome(1, -2, -3) ; 
         p1.afficher();
         p2.afficher();
         p1.evaluerPolynome(2);
         Polynome p2d = p2.CalcDeriv() ; 
          p2d.afficher();
         p2d.evaluerPolynome(2);
         p2.CalcDisc(); 
         
    }
   
}
