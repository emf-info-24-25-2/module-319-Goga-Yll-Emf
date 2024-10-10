public class App {
    public static void main(String[] args) throws Exception {
         String maChaineDeCaractere = "Voici du contenu stocké dans un String.";
         System.out.println("Nombre de caractères contenu dans la variable maChaineDeCaractere : " + maChaineDeCaractere.length());
         int positionContenu = maChaineDeCaractere.indexOf("contenu");
         System.out.println("Le mot \"contenu\" commence à la position : " + positionContenu);
         char lettrePosition10 = maChaineDeCaractere.charAt(10);
         System.out.println("Le position 10 contient la lettre : " + lettrePosition10);
 
         String monPrenom = "Yll";
 
         for (int i = 0; i < monPrenom.length(); i++) {
             System.out.println("La lettre à la position " + i + " est : " + monPrenom.charAt(i));
         }
 
         boolean contientTest = monPrenom.contains("test");
         System.out.println("La variable monPrenom contient \"test\" : " + contientTest);
    }
}

