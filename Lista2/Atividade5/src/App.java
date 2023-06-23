import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe duas notas para saber se você passou");
    
        int n1 = scanner.nextInt();

        int n2 = scanner.nextInt();

        double media = (n1+ n2) / 2;


        if (media <= 7){

            System.out.println("Aprovado ");
        }

        else if  (media == 10){

            System.out.println("Aprovado com Distin ");
        }

        else {

            System.out.println("Reprovado" );

        }
        
        scanner.close();
    
    }
}
