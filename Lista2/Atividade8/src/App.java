import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe tres produtos ");
    
        int prd1 = scanner.nextInt();

        int prd2 = scanner.nextInt();

        int prd3 = scanner.nextInt();


        if (prd1 < prd2 && prd1 < prd3){

            System.out.println("o produro 1 e o de  menor valor " + prd1);
        }


        if (prd2 < prd1 && prd2 < prd3){

            System.out.println("o produro 2 e o de  menor valor " + prd2);
        }

        else {

            System.out.println("o produro 3 e o de  menor valor " + prd3);

        }

        scanner.close();
    
    }
}
