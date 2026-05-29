import java.util.Scanner;

public class divisão {
   public static void main(String[] args) throws InterruptedException {
    Scanner sc = new Scanner(System.in);
    
      int r = 10 / 2;

    System.out.println(r);

    int r1 = 5;
    int r2 = 4;

    double result = r1 / r2;

    System.out.println(result);



    int r3 = 2;
    int r4 = 4;

    double res2 = r3 / (double) r4;

    double res3 =(double) r3  / r4;

    System.out.println("O calculo dos dois e:");

    System.out.println("resposta1: " + res2);
    System.out.println("a reposta2 e: " + res3);



    System.out.println("DIgite um numero: ");
    Thread.sleep(2000);
    int num1 = sc.nextInt();

    System.out.println("DIgite o segundo numero: ");
    int num2 = sc.nextInt();

    

    


    double Resultado1 = num1 / num2;
    Thread.sleep(1000);
    System.out.println("a resposta e: " + Resultado1);
    Thread.sleep(2000);
    System.out.println("DIvisão de três numeros: ");
    Thread.sleep(1000);
    System.out.println("DIgite um numero: ");
    int num3 = sc.nextInt();

    System.out.println("DIgite o segundo numero: ");
    int num4 = sc.nextInt();

    System.out.println("Digite o terceiro numero: ");
    int num5 = sc.nextInt();

    double resultado2 = num3 / num4 / num5;

    Thread.sleep(1000);
    System.out.println("A resposta da divisão de trẽs numeros e: " + resultado2);
   } 
}
