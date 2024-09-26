public class devoir03 {
    public static void main(String[] args) {
        // On définit la date (par exemple le 24 septembre 2024)
        int jour = 24;
        int mois = 9;
        int annee = 2024;
        // Vérifie si l'année est entre 0 et 9999 (comme demandé)
        if (annee < 0 || annee > 9999) {
            System.out.println("Yo, l'année " + annee + " est pas valide !");
            return;
        }
        // Vérifie si le mois est entre 1 et 12
        if (mois < 1 || mois > 12) {
            System.out.println("Euh... le mois " + mois + " existe pas.");
            return;
        }
        // Liste des jours par mois (pour les années normales)
        int[] joursParMois = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        // On check si l'année est bissextile (les années qui ont 366 jours)
        boolean estBissextile = false;
        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
            estBissextile = true;
            joursParMois[1] = 29;  // Février passe à 29 jours si c'est bissextile
        }
        // On vérifie si le jour est valide par rapport au mois
        if (jour < 1 || jour > joursParMois[mois - 1]) {
            System.out.println("Le jour " + jour + " c'est pas possible pour ce mois.");
            return;
        }
        // Calcul du jour dans l'année
        int jourDeLAn = 0;
        // Ajoute les jours des mois précédents
        switch (mois) {
            case 12: jourDeLAn += joursParMois[10]; // novembre
            case 11: jourDeLAn += joursParMois[9];  // octobre
            case 10: jourDeLAn += joursParMois[8];  // septembre
            case 9:  jourDeLAn += joursParMois[7];  // août
            case 8:  jourDeLAn += joursParMois[6];  // juillet
            case 7:  jourDeLAn += joursParMois[5];  // juin
            case 6:  jourDeLAn += joursParMois[4];  // mai
            case 5:  jourDeLAn += joursParMois[3];  // avril
            case 4:  jourDeLAn += joursParMois[2];  // mars
            case 3:  jourDeLAn += joursParMois[1];  // février
            case 2:  jourDeLAn += joursParMois[0];  // janvier
            case 1:  jourDeLAn += jour;             // On ajoute le jour actuel
                     break;
            default: System.out.println("Il y a un truc qui va pas là...");
                     return;
        }
        // Affichage du résultat final
        System.out.println("Le " + jour + "/0" + mois + "/" + annee + " c'est le jour " + jourDeLAn + " de l'année.");
    }
}