import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe os lados do trinagulo para saber se e ee quilatero, isosceles ou escaleno ");
    
        int A = input.nextInt();

        int B = input.nextInt();

        int C = input.nextInt();


        if (A == B && A == C  &&  B == C  ){

            System.out.println(" trinagulo escaleno ");

        }

        else if  (A != B && A !=  C  &&  B != C  ){
            
            System.out.println(" trinagulo isosceles ");
        
        }

        else if  (A == B || A == C  ||  B == C ){

            System.out.println(" trinagulo escaleno ");
        
        }


        input.close();
    
    }
}
