import java.util.Scanner;

public class anneeBissextill {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter une annee: ");
        int annee = scanner.nextInt();
        if((annee %4==0 && annee %100 !=0) || (annee %400==0)){
            System.out.println("L'annee "+annee+" est bissextile");
        } else{
            System.out.println("L'annee "+annee+" n'est pas bissextile");
        }

        scanner.close();
    }
}