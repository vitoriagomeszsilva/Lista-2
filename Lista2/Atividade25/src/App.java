import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda as perguntas sorbe o crime com 1 para sim e 0 para não");


        System.out.println("Telefonou para a vítima?");

        int r1 = scanner.nextInt();

        System.out.println("Esteve no local do crime?");

        int r2 = scanner.nextInt();

        System.out.println("Mora perto da vítima?");

        int r3 = scanner.nextInt();

        System.out.println("Devia para a vítima?");

        int r4 = scanner.nextInt();

        System.out.println("Já trabalhou com a vítima?");

        int r5 = scanner.nextInt();



        int total = r1 + r2 + r3 + r4 + r5;

        if ((r1 != 1 && r1 != 0) && (r2!= 1 && r2 != 0) && (r3 != 1  && r3 != 0) && (r4 != 1  && r4 != 0 ) && (r5 != 1 && r5 != 0)){

            System.out.println("Resposta invalida");

        }
        
        else if (total == 1){

            System.out.println("Não existe vinculo");

        }

        else if  (total == 2){

            System.out.println("Suspeita");
           
        }

        else if  (total == 3){

        
            System.out.println("Cumplice");


        }

        else if  (total == 4){

            System.out.println("Cumplice");

        }

        else if  (total == 5){

        System.out.println("Assassino");
            
        }


        scanner.close();
    
    }

}