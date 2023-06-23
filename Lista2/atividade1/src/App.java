import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe ddois numeros e  descubra qual  e o maior");
    
        int n1 = scanner.nextInt();

        int n2 = scanner.nextInt();


        if (n1 >n2){

            System.out.println(" maior numero " + n1);
        }

        else {

            System.out.println("maior numero "+ n2);
        }
        
        scanner.close();
    
    }
}
