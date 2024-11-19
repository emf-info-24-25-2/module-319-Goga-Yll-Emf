public class devoir8 {
    private static final String[] CARACTERES = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
    private static final int NBR_ESSAI = 5;
    private static final int TAILLE_MOT_DE_PASSE = 15;

    public static void main(String[] args) {
        for (int i = 0; i < NBR_ESSAI; i++) {
            String motDePasse = genereMotDePasse(TAILLE_MOT_DE_PASSE);
            System.out.println(motDePasse);
        }
    }

    public static String genereMotDePasse(int taille) {
        String resultat = "";
        for (int i = 0; i < taille; i++) {
            int positionAleatoire = (int) (Math.random() * CARACTERES.length);
            resultat += CARACTERES[positionAleatoire];
        }
        return resultat;
    }
}