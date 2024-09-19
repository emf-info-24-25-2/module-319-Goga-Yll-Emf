public class ExerciceBoucle2 {
    public static void main(String[] args) {
        System.out.println("Boucle for:");
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Décollage !!");
        int i = 5;
        System.out.println("Boucle while:");
        while (i > 0) {
            System.out.println(i);
            {
                i--;
            }
        }
        System.out.println("Décollage !!");
        System.out.println("Boucle do-while:");
        int l = 5;
        do {
            System.out.println(l);
            l--;

        } while (l > 0);
        System.out.println("Décollage !!");
    }
}
