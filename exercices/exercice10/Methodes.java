public class Methodes {
    public static void direbonjour(){
    System.out.println("Bonjour");
    
    }
    public static void dire(String message){
    System.out.println("ne retourne rien."+ message);


    }
    public static void main(String[] args) {
    direbonjour();
    dire("");
    min(5, 15);
    max(5, 15);
    carré(2, 2);
    racine(25);
    absolu(45);
    Halloween();
    }

    public static void min(int a, int b) {
        System.out.println("le minimum est " + Math.min(a, b));
    }
 
    public static void max(int a, int b) {
        System.out.println("le maximum est " + Math.max(a, b));
    }
 
    public static void carré(double base, double exponent) {
        System.out.println("le nombre " + base + " élevé a la puissanse " + exponent + " est " + Math.pow(base, exponent));
    }
 
    public static void racine(double nombre) {
        System.out.println("la racine carré de " + nombre + " est " + Math.sqrt(nombre));
    }
 
    public static void absolu(int nombre) {
        System.out.println("la valeure absolue de " + nombre + " est de " + Math.abs(nombre));
    }
    public static void Halloween(){
        System.out.println("Pas de bras ,Pas de chocolat");}
}

