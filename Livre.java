

public class Livre {
    private String titre ; 
    private String auteur ; 
    private double prix ; 
    private final String ISBN ;
    private static int compteurLivres = 0 ; 
    private static final String LIBRAIRIE = "Ma bibliotheque" ; 
    // methods 
    public  Livre ( double prix , String ISBN , String titre, String auteur ){
       this.prix = prix ;
       this.ISBN = ISBN ;
       this.titre = titre ; 
       this.auteur = auteur ;
    }
    // surcharge  
    public Livre (String titre, String auteur , String ISBN ){
        this (0.0, ISBN, titre, auteur ) ;
    }
    // getters  
     public String getTitre (){
        return titre  ; 
      } 
      public String getAuteur(){
        return auteur ;
      }
      public String getISBN (){
        return ISBN ;
      } 
      public double getPrix(){
        return prix ;
      }
      public String getLib(){
        return LIBRAIRIE ; 
      }
      public int getCompteurlivres (){
        return compteurLivres ;
      }

      // setters 
      public void setPrix (double prix){
        this.prix = prix ; 
      }
      public void setTitre (String titre){
        this.titre = titre ; 
      } 
      public void setAuteur (String auteur ){
        this.auteur = auteur ;
      }
      public void affichier (){
        System.out.println("Titre : "+ this.titre);
        System.out.println("Auteur : "+ this.auteur);
        System.out.println("Prix: "+ this.prix);
        System.out.println("ISBN : "+this.ISBN);
      }
      @Override
   public String toString(){
    return "Livre [Titre=" + titre + ", Auteur=" + auteur + ", Prix=" + prix + ", ISBN=" + ISBN
+ "]";
   }
}
