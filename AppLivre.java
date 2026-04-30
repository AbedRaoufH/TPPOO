import java.util.Scanner;

public class AppLivre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int nbLIV = sc.nextInt() ; sc.nextLine();
        String titre = sc.nextLine();
        String auteur = sc.nextLine();
        double prix = sc.nextDouble();sc.nextLine(); // Consommer le saut de ligne
        String isbn = sc.nextLine();
        sc.close();
    }
    
}
