import java.util.Scanner;
 public class Somme{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter 1er entier: ");
        int a = scanner.nextInt();
        System.out.print("Enter 2eme entier: ");
        int b = scanner.nextInt();

        int som = a+b;

        System.out.println("la Somme de "+ a +"+" +b+ " = "+som);

        scanner.close();

    }
 }