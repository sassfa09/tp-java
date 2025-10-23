import java.util.Scanner;
 public class FactorielleV2 { 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); 
         System.out.print("n = ");
          int n = sc.nextInt();
           long fact = 1L; 
           // TODO: calculer la factorielle avec une boucle for System.out.println("n! = " + fact); 
           for(int i=1 ;i<=n;i++){
            fact=fact*i;
           }
              System.out.println(n+ "! = "+fact);

         sc.close(); 
} }