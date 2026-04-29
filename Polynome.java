package TP02POO;

public class Polynome {
    private double coef1 ;
    private double coef2 ;
    private double coef3 ;
    // methods 
    public Polynome (double coef1 , double coef2 , double coef3){
        this.coef1 = coef1 ;
        this.coef2 = coef2 ;
        this.coef3 = coef3 ; 
    } 
    // surcharge + constructor chaining
     public Polynome (){

        this(0.0,0.0,0.0) ;
     }
     // getters 
     public double getCoef1(){
        return this.coef1 ; 
     }
     public double getCoef2(){
        return this.coef2 ; 
     }
     public double getCoef3(){
        return this.coef3 ; 
     }
    // setters 
    public void setCoef1(double coef1){
        this.coef1 = coef1 ;
    }
    public void setCoef2(double coef2){
        this.coef2 = coef2 ;
    }
    public void setCoef3(double coef3){
        this.coef3 = coef3 ;
    }
     // instanciation methods 
     public void afficher(){
        //this.coef1 works we are inside the class 
         System.out.println(this.coef1 +"x^2 +"+this.coef2 +"x +"+ this.coef3);
     }
     public double CalcDisc(){
        return Math.pow(this.coef2, 2) - 4*this.coef1*this.coef3 ;
     }
     public void afficherSolution() {
double delta = CalcDisc();
// Edge case: If a = 0, it's not a quadratic equation.
if (coef1 == 0) {

    if (coef2 != 0) System.out.println("Racine unique: " + (-coef3 / coef2));

    else System.out.println("Pas de racine unique.");

    return;
}
  if (delta > 0) {
                  double x1 = (-coef2 - Math.sqrt(delta)) / (2 * coef1);
                 double x2 = (-coef2 + Math.sqrt(delta)) / (2 * coef1);
          System.out.println("Deux racines (x1, x2): " + x1 + " et " + x2);
} else if (delta == 0) {
double x0 = -coef2 / (2 * coef1);
System.out.println("Une racine double (x0): " + x0);
} else {
            System.out.println("Aucune racine réelle (Delta < 0).");
}
}
// Evaluates the polynomial for a given x: ax^2 + bx + c
public void evaluerPolynome(double x) {
    double resultat = (coef1 * x * x) + (coef2 * x) + coef3;

       System.out.println("Valeur pour x=" + x + " est: " + resultat);
}
 public Polynome CalcDeriv(){
    // we use the constructor chaining thingy
     return new Polynome(0.0,2*this.coef1,this.coef2) ; 
 } 
 public Polynome SumP (Polynome Autrepoly ){
    return new Polynome  (this.coef1+Autrepoly.coef1,this.coef2+ Autrepoly.coef2,this.coef3 + Autrepoly.coef3) ;
 }
}
