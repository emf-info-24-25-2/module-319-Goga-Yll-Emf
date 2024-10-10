public class ExerciceBoucle1 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.println("Boucle for, itération " + i);
        }
        System.out.println(" ");
        int l = 1;
        while (l < 6) {
            System.out.println("Boucle while, itération " + l);
            {
                l++;
            }
        }
        System.out.println(" ");
        int h = 1;
        do {
            System.out.println("Boucle do-while, itération " + h);
            h++;

        } while (h < 6);
        System.out.println(" ");
        for (int r = 1; r < 3; r++) {
            System.out.println("Boucle for, itération " + r);
        }

        for (int z = 4; z < 6; z++) {
            System.out.println("Boucle for, itération " + z);
        }
        System.out.println(" ");
        int x = 1;
        while (x < 4) {
            System.out.println("Boucle while, itération " + x);
            {
                x++;
            }
        }
    }
}