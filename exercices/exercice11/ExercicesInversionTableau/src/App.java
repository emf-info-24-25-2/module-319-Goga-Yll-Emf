import java.util.Random;

public class App {

    private static final int MIN = 0;
    private static final int MAX = 100;

    public static int[] inverseLeTableau(int[] tableau) {
        int[] tableauInverse = new int[tableau.length];
        for (int i = 0; i < tableau.length; i++) {
            tableauInverse[i] = tableau[tableau.length - 1 - i];
        }
        return tableauInverse;
    }

    public static void main(String[] args) {
        Random random = new Random();

        int[] tableauInitial = new int[4];
        for (int i = 0; i < tableauInitial.length; i++) {
            tableauInitial[i] = random.nextInt(MAX - MIN + 1) + MIN;
        }

        System.out.println("Contenu du tableau initial :");
        for (int i = 0; i < tableauInitial.length; i++) {
            System.out.println("Tableau initial [" + i + "] = " + tableauInitial[i]);
        }

        int[] tableauFinal = inverseLeTableau(tableauInitial);

        System.out.println("\nContenu du tableau final :");
        for (int i = 0; i < tableauFinal.length; i++) {
            System.out.println("Tableau final [" + i + "] = " + tableauFinal[i]);
        }
    }
}