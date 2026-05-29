import java.util.Scanner;

public class lol {
    public static void main(String[] args) throws InterruptedException  {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int number = sc.nextInt();

        if (number == 1984) {
            System.out.println("Lol");
        }else{
            System.out.println("voce colocou um numero errado, Adeus!");
            Thread.sleep(3000);
            System.exit(0);
        }
    }
}
