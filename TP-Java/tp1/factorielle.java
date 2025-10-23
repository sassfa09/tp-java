import java.util.Scanner;

public class factorielle{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter un nombre: ");

        int n = scanner.nextInt();
        long fact=1;

        for(int i=1; i<=n;i++){
            fact=fact*i;
    
        }

        System.out.println("La factorielle de "+n+ " est: "+fact);


        scanner.close();
    }
}