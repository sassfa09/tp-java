import java.util.Scanner;

public class Triangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = scanner.nextInt();
        System.out.print("Enter b :");
        int b = scanner.nextInt();
        System.out.print("Enter c :");
        int c = scanner.nextInt();

           
            if (a == b && b == c) {
                System.out.println("Triangle équilatéral");
            }
           
            else if (a == b || b == c || a == c) {
                System.out.println("Triangle isocèle");
            }
           
            else {
                System.out.println("Triangle scalène");
            }



        scanner.close();
    }
}