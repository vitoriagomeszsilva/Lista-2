import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("informe quantos litros de combustivel você vai abastecer");

        int litros = scanner.nextInt();

        System.out.println("informe o combustivel A - Alcool G - gasolina");

        String combustivel = scanner.nextLine();

       


        if ( combustivel.equals("g")){
           
            
            double gasolina = 2.90;
            double desconto20 = 0.04;
            double mais20 = 0.06;


                    if (litros <= 20){

                        double valortotal = litros * gasolina;
                        double desconto = valortotal * desconto20;
                        double valorLiquido = valortotal - desconto;
                        
                        System.out.println("o valor " + valorLiquido);

                    }
                
                    else {

                        double valortotal = litros * gasolina;
                        double desconto = valortotal * mais20;
                        double valorLiquido = valortotal - desconto;
                        
                        System.out.println("o valor " + valorLiquido);

                    }

        }
        
        else if (combustivel.equals("a")){

            double valorAcool = 1.90;
            double desconto20 = 0.03;
            double mais20 = 0.04;

                    if (litros <= 20){

                        double total = litros * valorAcool;
                        double desconto = total * desconto20;
                        double Liquido = total - desconto;
                        
                        System.out.println("o valor" + Liquido);

                    }
                
                    else {

                        double total = litros * valorAcool;
                        double desconto = total * mais20;
                        double Liquido = total - desconto;
                        
                        System.out.println("o valo" + Liquido);

                    }
        }

        else {

           

            System.out.println(" desconhecido");

        }

       

        scanner.close();
    
    }

}