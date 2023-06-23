import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora de trabalho: ");
        double valorH = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horasT = scanner.nextDouble();

        double salarioB = valorH * horasT;
        double ir = 0;
        double inss = salarioB * 0.10;
        double fgts = salarioB * 0.11;

        if (salarioB <= 900) {
            // Isento de IR
        } else if (salarioB <= 1500) {
            ir = salarioB * 0.05;
        } else if (salarioB <= 2500) {
            ir = salarioB * 0.10;
        } else {
            ir = salarioB * 0.20;
        }

        double total = ir + inss;
        double Liquido = salarioB - total;

        System.out.println("Salário Bruto: R$ " + salarioB);
        System.out.println("(-) IR (5%): R$ " + ir);
        System.out.println("(-) INSS (10%): R$ " + inss);
        System.out.println("FGTS (11%): R$ " + fgts);
        System.out.println("Total de descontos: R$ " + total);
        System.out.println("Salário Líquido: R$ " + Liquido);

        scanner.close();
    
    }
}
