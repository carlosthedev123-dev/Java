import java.util.Scanner;

public class matematicabase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Adição: ");

        System.out.println("Digite o Primeiro Numero: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        int ra = num1 + num2;

        System.out.println("a resposta e: " + ra);
    }
}
