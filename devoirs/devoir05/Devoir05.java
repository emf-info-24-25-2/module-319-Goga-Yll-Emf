import java.util.Scanner;

public class Devoir05 {
    public static void main(String[] args) {
        //Choisir un nombre secret aléatoire entre 1 et 100
        int nombreSecret = (int)(Math.random() * 100) + 1;
        int proposition;  
        boolean trouve = false;  // Indique si le nombre est trouvé

        //Créer un scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        //Demander à l'utilisateur de deviner le nombre
        while (!trouve) {  // Répéter tant que le nombre n'est pas trouvé
            System.out.print("Devinez un nombre entre 1 et 100 : ");

            //Lire la proposition de l'utilisateur
            proposition = scanner.nextInt();

            //Vérifier la proposition
            if (proposition < 1 || proposition > 100) {
                System.out.println("Entrez un nombre entre 1 et 100 !");
            } else if (proposition < nombreSecret) {
                System.out.println("Trop petit !");
            } else if (proposition > nombreSecret) {
                System.out.println("Trop grand !");
            } else {
                //RIF: vous pourriez aussi mettre en combien d'essais le joueur a trouvé
                System.out.println("Bravo, trouvé !");
                trouve = true;  //Le nombre est trouvé, sortir de la boucle
            }
        }

        //Fermer le scanner
        scanner.close();
    }
}
