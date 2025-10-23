import java.util.Scanner;
 public class baremDeNote{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter la note de l'etudiant: ");
        double note = scanner.nextDouble();

        if(note>=16 && note<=20){
            System.out.println("Mention : A");
        } else if(note>=14 && note<16){
            System.out.println("Mention : B");
        } else if(note>=12 && note<14){
            System.out.println("Mention : C");
        } else if(note>=10 && note<12){
            System.out.println("Mention : D");
        } else if(note>=0 && note<10){
            System.out.println("Mention : F ");
        } else{
            System.out.println("Note invalide");
        }

        scanner.close();
    }
 }