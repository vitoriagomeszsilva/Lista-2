
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu salario para saber em quanto sera seu reajuste");
    
        float salario = scanner.nextFloat();

      


        if (salario < 280){

                System.out.println("o salario antes do reajuste " + salario);

                System.out.println("o percentual de aumento aplicado e de 15% " );

                Double valorReajuste = salario * 0.15;

                System.out.println("o valor do seu aumento e de " + valorReajuste );
                
                Double novo_salario_bruto = salario + valorReajuste;

                System.out.println("oo novo salario apos o aumento. " + novo_salario_bruto );


        }


        else if (salario > 280 && salario < 700){

                System.out.println("o salario " + salario);

                System.out.println(" aumento aplicado e de 10% " );

                Double valorReajuste = salario * 0.10;

                System.out.println("aumento e de " + valorReajuste );
                
                Double novoSalario = salario + valorReajuste;

                System.out.println("novo salario " + novoSalario );
        }

         else if (salario > 700 && salario < 1500){

                System.out.println("o salario " + salario);

                System.out.println("umento aplicado e de 5% " );

                Double valorReajuste = salario * 0.05;

                System.out.println("o valor do seu aumento e de " + valorReajuste );
                
                Double novoSalario = salario + valorReajuste;

                System.out.println("novo salario " + novoSalario );
        }

        else {

                System.out.println("o salario " + salario);

                System.out.println("aumento aplicado e de 20% " );

                Double valorReajuste = salario * 0.20;

                System.out.println("aumento  de " + valorReajuste );
        
                Double novoSalario = salario + valorReajuste;

                System.out.println("novo salario" + novoSalario );

        }

        scanner.close();
    
    }
}
