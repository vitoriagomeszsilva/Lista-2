import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe tres notas para saber se você passou");
    
        int n1 = input.nextInt();

        int n2 = input.nextInt();

        int n3 = input.nextInt();


        double media = (n1+ n2 + n3) / 2;


        if (media <= 7){

            System.out.println("Aprovado ");
        }

        else if  (media == 10){

            System.out.println("Aprovado com Distin ");
        }

        else {

            System.out.println("Reprovado" );

        }

       



        
        input.close();
    
    }
}
