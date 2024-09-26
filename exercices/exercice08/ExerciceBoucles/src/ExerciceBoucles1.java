public class ExerciceBoucles1 {
    public static void main(String[] args) throws Exception {
        for (int i=1; i<=5 ; i++ ){
            System.out.println("Boucle for, itération :" + i);
        }
        
        int i=1;
        while (i<=5) {
            System.out.println("Boucle while, itération :" + i);
            i++ ;
            
        }    
        
        int l=0;
        do { 
        l++;
        System.out.println("Boucle do-while, itération " + l);
        } while (l<=4);

        for (int f=1; i<2 ; f++ ){
            System.out.println("Boucle for, itération :" + f);
        }
        for (int f=4; f<=5 ; f++ ){
            System.out.println("Boucle for, itération:" + f);
        }
    }
}
