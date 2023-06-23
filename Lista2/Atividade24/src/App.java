import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero para que ele seja escrito por extenco");
    
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println("Informe 1 - soma 2 - subtracao 3 - divisao 4 - multiplicacao");

        int opercao = scanner.nextInt();

        if (opercao == 1){


             int valor = n1 +  n2;
             
            System.out.println( valor);


            
        
     
    
        }

        else if  (opercao == 2){

            int valor = n1 -  n2;
            System.out.println( valor);



           
        }

        else if  (opercao == 3){

            int valor = n1 /  n2;
            System.out.println( valor);

        }

        else if  (opercao == 4){

        int valor = n1 *  n2;

            System.out.println( valor);

            
        }

        else{

            System.out.println("valor invalido");

           
        }


        scanner.close();
    
    }

  

}
