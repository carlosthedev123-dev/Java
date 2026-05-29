import java.util.Scanner;

public class Menosemais {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Digite um numero: ");
       int primeiro = Integer.valueOf(sc.nextLine());

       System.out.println("Digite o Segundo Numero: ");
       int segunda = Integer.valueOf(sc.nextLine());

       int resposta = primeiro + segunda;

       System.out.println("A resposta deu: " + resposta);

    }
}