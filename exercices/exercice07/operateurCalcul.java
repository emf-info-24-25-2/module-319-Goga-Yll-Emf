public class operateurCalcul {

    public static void main(String[] args) {

        // &&
        int a = 5;
        int b = 10;
        System.out.println(a > 0 && b < 15); // true (car les deux conditions sont vraies)
        System.out.println(a > 0 && b > 15); // false (car la deuxième condition est fausse)

        // ||
        int c = 5;
        int d = 10;
        System.out.println(c > 0 || d > 15); // true (car la première condition est vraie)
        System.out.println(c < 0 || d > 15); // false (car les deux conditions sont fausses)

        // !
        boolean estMajeur = true;
        System.out.println(!estMajeur); // false (inverse la valeur de estMajeur)

        // ^
        boolean e = true;
        boolean f = false;
        System.out.println(e ^ f); // true (car seulement l'une des deux conditions est vraie)
        System.out.println(true ^ true); // false (car les deux conditions sont vraies)

    }
}