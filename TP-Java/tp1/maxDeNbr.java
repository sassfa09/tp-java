import java.util.Scanner;

public class maxDeNbr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1er Nombre :");
        int a = sc.nextInt();
        System.out.print("Enter 2eme Nombre :");
        int b = sc.nextInt();
        System.out.print("Enter 3eme Nombre :");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("le max de 3 nombre est : "+ a);
        }else if(b>a && b>c){
          System.out.println("le max de 3 nombre est : "+ b);  
        }else{
         System.out.println("le max de 3 nombre est : "+ c);  
        }

    sc.close();
    }
}