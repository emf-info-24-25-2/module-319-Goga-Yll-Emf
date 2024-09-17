public class devoir02 {
    public static void main(String[] args) {
        // Déclaration des constantes
        final int CAPACITE_RESERVOIR_A = 3;
        final int CAPACITE_RESERVOIR_B = 5;

        // Déclaration des variables pour les réservoirs, initialement vides
        int reservoirA = 0;
        int reservoirB = 0;

        // Génération d'une valeur aléatoire pour le remplissage
      
        int remplissage=2;

        // Affichage du nombre de litres à remplir
        System.out.println("Il y a " + remplissage + " litres à remplir.");

        // Boucle de remplissage des réservoirs
        while (reservoirA + reservoirB < remplissage) {
            // Si le réservoir A n'est pas plein, on le remplit
            if (reservoirA < CAPACITE_RESERVOIR_A) {
                System.out.println("Remplissage du réservoir A...");
                reservoirA++;
            }
            // Sinon, on remplit le réservoir B
            else if (reservoirB < CAPACITE_RESERVOIR_B) {
                System.out.println("Remplissage du réservoir B...");
                reservoirB++;
            }

            // Affichage du niveau des réservoirs après chaque itération
            System.out.println("Le réservoir A : " + reservoirA + ", le réservoir B : " + reservoirB);
        }

        // Affichage lorsque le remplissage est terminé
        System.out.println("Remplissage terminé!");
    }
}