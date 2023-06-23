import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do saque ");
        int Saque = scanner.nextInt();

        if (Saque > 10 || Saque < 600) {
            int notas100 = Saque / 100;
            Saque %= 100;

            int notas50 = Saque / 50;
            Saque %= 50;

            int notas10 = Saque / 10;
            Saque %= 10;

            int notas5 = Saque / 5;
            Saque %= 5;

            int notas1 = Saque;

            System.out.println("Quantidade de notas:");
            System.out.println("Notas de 100: " + notas100);
            System.out.println("Notas de 50: " + notas50);
            System.out.println("Notas de 10: " + notas10);
            System.out.println("Notas de 5: " + notas5);
            System.out.println("Notas de 1: " + notas1);
        } else {

            System.out.println("Valor de saque inválido");
           
        }

        scanner.close();
    }
}
