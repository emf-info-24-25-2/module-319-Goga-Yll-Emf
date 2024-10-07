public class Devoir04 {
    public static void main(String[] args) {
        // On commence par dire quelle date on veut vérifier
        int year = 2024; // l'année
        int month = 10; // le mois (septembre)
        int day = 07; // le jour (12)

        // J'affiche la date pour voir ce qu'on a en entrée
        System.out.println("La date entrée est le " + day + "." + month + "." + year);

        // Maintenant, je vais vérifier si l'année est valide (entre 0 et 9999)
        if (year < 0 || year > 9999) {
            System.out.println("L'année [" + year + "] est hors limites !");
        } else if (month < 1 || month > 12) {
            // Si le mois est hors de ses limites (doit être entre 1 et 12)
            System.out.println("Le mois [" + month + "] est hors limites !");
        } else {
            // Là, je vais déterminer combien de jours le mois peut avoir
            int maxDays = 0;
            switch (month) {
                // Les mois avec 31 jours
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    maxDays = 31;
                    break;
                // Les mois avec 30 jours
                case 4: case 6: case 9: case 11:
                    maxDays = 30;
                    break;
                case 2:
                    // Pour février, je dois vérifier si c’est une année bissextile
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        maxDays = 29; // année bissextile, donc 29 jours en février
                    } else {
                        maxDays = 28; // sinon, 28 jours
                    }
                    break;
                default:
                    maxDays = -1; // au cas où le mois serait complètement invalide
            }

            // Je vérifie maintenant si le jour est correct
            if (day < 1 || day > maxDays) {
                System.out.println("Le jour [" + day + "] est hors limites !");
            } else {
                // Si tout est bon, je transforme le mois en texte
                String monthText = "";
                switch (month) {
                    case 1: monthText = "janvier"; break;
                    case 2: monthText = "février"; break;
                    case 3: monthText = "mars"; break;
                    case 4: monthText = "avril"; break;
                    case 5: monthText = "mai"; break;
                    case 6: monthText = "juin"; break;
                    case 7: monthText = "juillet"; break;
                    case 8: monthText = "août"; break;
                    case 9: monthText = "septembre"; break;
                    case 10: monthText = "octobre"; break;
                    case 11: monthText = "novembre"; break;
                    case 12: monthText = "décembre"; break;
                    default: monthText = "inconnu"; break;
                }

                // Et là j'affiche la date formatée de façon plus sympa
                System.out.println("La date formatée est le " + day + " " + monthText + " " + year);
            }
        }
    }
}