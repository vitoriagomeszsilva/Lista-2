
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero para saber o Dia ");
    
        float d = scanner.nextFloat();

        if (d  == 1){

                System.out.println("Domingo" );

        }


        else if (d  == 1){

              
                System.out.println("Segunda" );
        }

        else if (d  == 1){



                System.out.println("terça" );
        }
        else if (d  == 1){

              
                System.out.println("Quarta" );
        }

        else if (d  == 1){



                System.out.println("Quinta" );
        }
        else if (d  == 1){

              
                System.out.println("Sabado");
        }

        else {


                System.out.println("Valor invalido" );

        }

        scanner.close();
    
    }
}
