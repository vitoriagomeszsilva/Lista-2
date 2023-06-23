import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n = scanner.nextDouble();
        

        if (n % 1 == 0) {
            System.out.println("é inteiro." + n);
        } else {
            System.out.println("é decimal." + n);
        }

        scanner.close();
    }

  
}
