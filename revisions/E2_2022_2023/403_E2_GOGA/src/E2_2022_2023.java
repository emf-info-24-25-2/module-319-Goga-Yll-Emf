import java.util.Scanner;

public class E2_2022_2023 {
    final static int PRIX_CATEGORIE_UN = 25;
    final static int PRIX_CATEGORIE_DEUX = 18;
    final static int PRIX_CATEGORIE_TROIS = 12;
    final static int[] Categorie_Salle = {3,3,2,2,1,1,2,2,3,3};
    public static void afficherTarifs () {

    }
    public static void afficherSalle (boolean[]occupationSalle) {
        System.out.println("Occupation de la salle:");
        for(int i = 0;i< occupationSalle.length; i++){   
            System.out.print(Categorie_Salle[i]+ " ");
        }
        System.out.println();
        for(boolean seat : occupationSalle){
            System.out.print(seat ? "X " : "O ");
        }
        System.out.println();

    }
    public static int trouverPlace(int categorie, boolean[]occupationSalle){
        for(int i = 0 ;  i < Categorie_Salle.length; i ++){
            if (Categorie_Salle[i] == categorie && !occupationSalle[i]){
                return i;
            }
        }
        return -1;
    }
    public static void commanderBillet(boolean[] occupationSalle){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Quelle catégorie voulez-vous: ");
    int categorie = scanner.nextInt();

    if(categorie < 1 || categorie> 3) {
        System.out.println();
    }
    
    
        
    }
}

