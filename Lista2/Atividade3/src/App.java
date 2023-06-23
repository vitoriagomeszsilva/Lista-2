import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe'f' para p sexo feminino  e 'm' para masculino ");
    
        String  sexo = scanner.next();


        if (sexo.equals("m")){

            System.out.println("Masculino ");
        }

        else if (sexo.equals("f")) {

            System.out.println("Feminino");

        }

        else  {

            System.out.println("Nulo ");

        }
        
        scanner.close();
    
    }
}
