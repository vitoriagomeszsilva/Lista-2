import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("informe uma letra e descubra se e vogal ou consoante");
    
        String  letra = input.next();


        if (letra.equals("a")  || letra.equals("e") || letra.equals("i")|| letra.equals("o")|| letra.equals("u")){

            System.out.println("e vogal ");
        }

        else  {

            System.out.println("e consoante ");

        }
        
        input.close();
    
    }
}
