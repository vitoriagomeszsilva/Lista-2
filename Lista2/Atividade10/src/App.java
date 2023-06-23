import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu turno M-matutino ou V-Vespertino ou N- Noturno ");
    
        String  h = scanner.next();


        if (h.equals("m") ){

            System.out.println("Bom Dia! ");
        }

        else if (h.equals("v")) {

            System.out.println("Boa Tarde!");

        }

        else if (h.equals("n")) {

            System.out.println("Boa Noite!");

        }


        else  {

            System.out.println("VALOR INVALIDO ");

        }
        
        scanner.close();
    
    }
}
