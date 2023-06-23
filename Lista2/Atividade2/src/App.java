import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numeros e descubrase e positivo ou negativo");
    
        int num = scanner.nextInt();



        if (num > 0){

            System.out.println(num +"positivo ");
        }

        else {

           System.out.println(num +"negativo ");
        }
        
        scanner.close();
    
    }
}
