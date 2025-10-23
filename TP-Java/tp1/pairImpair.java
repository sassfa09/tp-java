import java.util.Scanner;

public class pairImpair{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter un nombre: ");
        int p= scanner.nextInt();

        if(p%2==0){
            System.out.println("Le nombre "+p+" est paire");
        } else{
            System.out.println("Le nombre "+p+" est impaire");
        }
     scanner.close();
    }
}