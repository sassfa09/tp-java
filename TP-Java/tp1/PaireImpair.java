import java.util.Scanner;

 public class PairImpair { 
    public static void main(String[] args)  {
         Scanner sc = new Scanner(System.in); 
    System.out.print("n = ");
     int n = sc.nextInt(); 
     // TODO: tester pair/impair et afficher le résultat 
     if (n%2==0){
        System.out.println("Le nombre "+n+" est paire");
     }else{
        System.out.println("Le nombre "+n+" est impaire");
     }

     sc.close();
      } 
      }