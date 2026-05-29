import java.util.Scanner;

public class if2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int numero = sc.nextInt();

        if (numero > 10) {
            System.out.println("o numero e maior que 10");
        }

        if (numero < 10 ) {
            System.out.println("O numero e menor que 10");
        }

        if (numero == 10) {
            System.out.println("o numero e o numero 10!");
        }
    }
}
