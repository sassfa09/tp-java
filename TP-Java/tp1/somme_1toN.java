import java.util.Scanner;

public class somme_1toN {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter un nombre N: ");
        long N =scanner.nextInt();

        //for loop
        long somfor=0;
        for(int i=1;i<=N;i++){
            somfor+=i;
        }
        System.out.println("with for loop:");
        System.out.println("La somme de 1 to "+N+" est: "+somfor);

        //while loop

        long somWhile=0;
        int j=1;
        while(j<=N){
            somWhile+=j;
            j++;
        }
        System.out.println("with while loop:");
        System.out.println("La somme de 1 to "+N+" est: "+somWhile);




        scanner.close();
    }
}