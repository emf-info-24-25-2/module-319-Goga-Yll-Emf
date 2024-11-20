import java.util.Random;

public class devoir09 {

    static final int NBRE_CHIFFRES = 6;
    static final int MIN = 0;
    static final int MAX = 42;

    public static void main(String[] args) {
        int[] tirage = genereTirage(NBRE_CHIFFRES, MIN, MAX);
        System.out.println("Tirage du loto :");
        for (int chiffre : tirage) {
            System.out.println(chiffre);
        }
    }

    public static int[] genereTirage(int nombreChiffres, int min, int max) {
        Random random = new Random();
        int[] tirage = new int[nombreChiffres];
        int index = 0;

        while (index < nombreChiffres) {
            int chiffre = random.nextInt(max - min + 1) + min;
            if (!contient(tirage, chiffre, index)) {
                tirage[index] = chiffre;
                index++;
            }
        }
        return tirage;
    }

    private static boolean contient(int[] tableau, int valeur, int taille) {
        for (int i = 0; i < taille; i++) {
            if (tableau[i] == valeur) {
                return true;
            }
        }
        return false;
    }
}