import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero para que ele seja escrito por extenco");
    
        int n = scanner.nextInt();


        if (n  <1001 ){

            System.out.println("numero >1001 ");
    
            String numeroString = String.valueOf(n );

            String[] partes = numeroString.split("");

            int centenas = Integer.parseInt(partes[0]);
            int dezenas  = Integer.parseInt(partes[1]);
            int unidades = Integer.parseInt(partes[2]);

            System.out.println(centenas +"centenas " + dezenas + " dezenas e " + unidades +" unidades");

        }

        else if  (n  <100){

             System.out.println("numero >100 ");

            String numeroString = String.valueOf(n );

            String[] partes = numeroString.split("");

            
            int dezenas = Integer.parseInt(partes[0]);
            int unidades  = Integer.parseInt(partes[1]);
            
            System.out.println(dezenas + " dezenas e " + unidades +" unidades");
        
        }

        else if  (n  <10){

            System.out.println("numero >10 ");

            String numeroString = String.valueOf(n );

            String[] partes = numeroString.split("");


            int unidades = Integer.parseInt(partes[0]);
            
             System.out.println( unidades +" unidades");
        }

        else if  (n  >1001){

            System.out.println("valor invalido");

           
        }


        scanner.close();
    
    }
}
