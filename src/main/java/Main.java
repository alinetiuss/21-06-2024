import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite sua altura (em metros):");
    double altura = sc.nextDouble();

    System.out.println("Digite sua massa:");
    double massa = sc.nextDouble();
    
    double imc = massa / (altura*altura);

    System.out.printf("O seu IMC é de %.2f kg/m² %n" , imc);

    if(imc<16.9) {
      System.out.println("Você esta muito abaixo do peso.");
    }

    if(imc>17 & imc<18.4) {
      System.out.println("Você está abaixo do peso.");
    }
    
     if(imc>19 & imc<24.9) {
       System.out.println("Seu peso está normal.");
     }

    if(imc>25 & imc<29.9) {
      System.out.println("Você está acima do peso.");
    }

    if(imc>30 & imc<34.9) {
      System.out.println("Você apresenta Obesidade de Grau I.");
    }

    if(imc>35 & imc<40) {
      System.out.println("Você apresenta Obesidade de Grau II.");
    }

    if(imc>40) {
      System.out.println("Você apresenta Obesidade Grau III.");
    }

    sc.close();
  }
}