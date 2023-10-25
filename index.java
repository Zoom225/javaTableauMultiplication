import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter un nbre entre 1 et 10: ");
       int nbre = sc.nextInt();
 if(nbre < 0 || nbre > 10){
    System.out.println("le nbre n'est pas valide");

 }else{   

         System.out.println("entrer le nombre pour la multiplication" + nbre + ":");
         for(int i=1; i <= 10;i++){ 
           System.out.println(nbre + " X " +  i + " = " + (nbre * i));

          }
        
    }
}
}
    
