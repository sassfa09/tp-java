import java.util.Scanner;

public class tableDeMultiplication{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter un nombre pour afficher sa table de multiplication: ");

        int n = scanner.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }

        scanner.close();
    }
}