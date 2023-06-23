import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("informe quantos kilos de morango");

        int morango = scanner.nextInt();

        System.out.println("informe quantos kilos de maçã");

        int maca = scanner.nextInt();

        double totalkg = morango+maca;
       


        if (morango <=5  ){

            System.out.println("morango <=5 ");
           
            
            double vMorango = 2.50;
            double vMacaMenos5 = 1.80;
            double vMacaMais5 = 1.50;


                    if (maca<= 5){
                        System.out.println("maca<= 5 ");

                        double vTMorango =  morango * vMorango ; 
                        double vTmaca = maca * vMacaMenos5 ; 

                        double vT = vTMorango + vTmaca;


                             if ((totalkg > 8) || ( vT >25) || (totalkg > 8 && vT >25)) {

                                 System.out.println("(totalkg > 8) || ( valorTotal >25) || (totalkg > 8 && valorTotal >25)");

                                double valorDesconto = vT * 0.10;

                                double vtcomdesconto = vT - valorDesconto;

                                System.out.println("Foram " + morango + "kg de morangos");
                                System.out.println("Foram " + maca + "kg de maçã");
                                System.out.println("R$:" + vtcomdesconto);



                            }

                            else {
                                  System.out.println("else (totalkg > 8) || ( valorTotal >25) || (totalkg > 8 && valorTotal >25)");

                                System.out.println("Foram " + morango + "kg de morangos");
                                System.out.println("Foram " + maca + "kg de maçã");
                                System.out.println("R$:" + vT);


                            }
                        
                        

                    }
                
                    else {

                            System.out.println("maca > 5 ");

                        
                        double vTMorango =  morango * vMorango ; 
                        double vTmaca = maca * vMacaMenos5 ; 

                        double vt = vTMorango + vTmaca;


                             if ((totalkg > 8) || ( vt >25) || (totalkg > 8 && vt >25)) {

                                double valorDesconto = vt * 0.10;

                                double vTcomdesconto = vt - valorDesconto;

                                System.out.println("Foram " + morango + "kg de morangos");
                                System.out.println("Foram " + maca + "kg de maçã");
                                System.out.println("R$:" + vTcomdesconto);



                            }

                            else {

                                System.out.println("Foram " + morango + "kg de morangos");
                                System.out.println("Foram " + maca + "kg de maçã");
                                System.out.println("R$:" + vt);


                            }
                        

                    }

        }

        else {

           System.out.println("else morango <=5 ");
            double valorMorango = 2.20;
            double valorMacaMenos5 = 1.80;
            double valorMacaMais5 = 1.50;


                    if (maca<= 5){

                        System.out.println("maca<= 5");

                        double valorTotalMorango =  morango * valorMorango ; 
                        double valorTotalmaca = maca * valorMacaMenos5 ; 

                        double valorTotal = valorTotalMorango + valorTotalmaca;


                             if ((totalkg > 8) || ( valorTotal >25) || (totalkg > 8 && valorTotal >25)) {

                                System.out.println("(totalkg > 8) || ( valorTotal >25) || (totalkg > 8 && valorTotal >25)");

                                double valorDesconto = valorTotal * 0.10;

                                double valorTotalcomdesconto = valorTotal - valorDesconto;

                                System.out.println("Foram " + morango + "kg de morangos");
                                System.out.println("Foram " + maca + "kg de maçã");
                                System.out.println("R$:" + valorTotalcomdesconto);



                            }

                            else {

                                System.out.println("else (totalkg > 8) || ( valorTotal >25) || (totalkg > 8 && valorTotal >25)");

                                System.out.println("Foram " + morango + "kg de morangos");
                                System.out.println("Foram " + maca + "kg de maçã");
                                System.out.println("R$:" + valorTotal);


                            }
                        
                        

                    }
                
                    else {

                        System.out.println("else maca> 5");

                        
                        double valorTotalMorango =  morango * valorMorango ; 
                        double valorTotalmaca = maca * valorMacaMais5 ; 

                        double valorTotal = valorTotalMorango + valorTotalmaca;


                             if ((totalkg > 8) || ( valorTotal >25) || (totalkg > 8 && valorTotal >25)) {

                                System.out.println("(totalkg > 8) || ( valorTotal >25) || (totalkg > 8 && valorTotal >25)");

                                double valorDesconto = valorTotal * 0.10;

                                double valorTotalcomdesconto = valorTotal - valorDesconto;

                                System.out.println("Foram " + morango + "kg de morangos");
                                System.out.println("Foram " + maca + "kg de maçã");
                                System.out.println("R$:" + valorTotalcomdesconto);



                            }

                            else {
                                 System.out.println("else (totalkg > 8) || ( valorTotal >25) || (totalkg > 8 && valorTotal >25)");

                                System.out.println("Foram " + morango + "kg de morangos");
                                System.out.println("Foram " + maca + "kg de maçã");
                                System.out.println("R$:" + valorTotal);


                            }
                        

                    }


        }

       

        scanner.close();
    
    }

}