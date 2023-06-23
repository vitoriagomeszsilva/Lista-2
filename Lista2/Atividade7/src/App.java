import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        
         Scanner scanner = new Scanner(System.in);

        System.out.println("Informe tres  numeros");
    
        int n1 = scanner.nextInt();

        int n2 = scanner.nextInt();

        int n3 = scanner.nextInt();




        if (n1 > n2 && n1 > n3){

            System.out.println("Esse e o maior numero " + n1);
        }


        else if (n2 > n1 && n2 > n3){

            System.out.println("Esse e o maior numero " + n2);
        }

        else {

            System.out.println("Esse e o maior numero " + n3);

        }



        if (n1 < n2 && n1 < n3){

            System.out.println("Esse e o menor numero " + n1);
        }


        else if (n2 < n1 && n2 < n3){

            System.out.println("Esse e o menor numero " + n2);
        }

        else {

            System.out.println("Esse e o menor numero " + n3);

        }

    
        
        scanner.close();

    
    }


}
