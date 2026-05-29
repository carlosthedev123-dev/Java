import java.util.Scanner;

public class Boolean1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um boolean: ");
        boolean valor = Boolean.valueOf(sc.nextLine());
        System.out.println("voce escreveu: " + valor);
    }
}
