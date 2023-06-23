import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
     Scanner scanner = new Scanner(System.in);
    
    System.out.println("Informe um ano para saber se e bissexto:");
  
    int ano = scanner.nextInt();

    if ((ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 != 0)){
      System.out.println("O ano " + ano + " e bissexto:");
    }
    else {
      System.out.println("O ano " + ano + " não bissexto:");
    }
    scanner.close();
  }
}