import java.util.Scanner;

public class TestPrimalite{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter un nombre: ");

        int n = scanner.nextInt();
        boolean estPremier = true;

        if(n<=1){
            estPremier=false;

        }else{
            for(int i=2; i<=Math.sqrt(n);i++){
                if (n%i==0){
                    estPremier=false;
                    
                }
            }
        }


        //afiichage
        if(estPremier){
            System.out.println("Le nombre "+n+" est premier");
        } else{
            System.out.println("Le nombre "+n+" n'est pas premier");
        }
    }
}