import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String data = scanner.nextLine();
        
        
            try {
            String[] partes = data.split("/");
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);
            
          
            if (ano < 1 || ano > 9999) {
              System.out.println("Data válida.");
            
            }
            else {

                System.out.println("Data inválida.");

            }
            if (mes < 1 || mes > 12) {
                System.out.println("Data válida.");
            
            }
            else {

                System.out.println("Data inválida.");

            }
            int maxDias = 31;
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                maxDias = 30;
                System.out.println("Data inválida.");
            } else if (mes == 2) {
                if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
                    maxDias = 29;
                    System.out.println("Data inválida.");
                } else {
                    maxDias = 28;
                    System.out.println("Data inválida.");
                }
            }
            else {

                System.out.println("Data inválida.");

            }

            
            if (dia < 1 || dia > maxDias) {
               System.out.println("Data inválida.");
            }
            else {

                System.out.println("Data inválida.");

            }


        } catch (NumberFormatException e) {
           System.out.println("Data inválida.");

        }


        
        scanner.close();
    

}

}


