import java.util.Scanner;

public class if3 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o km/h, que voce esta atualmente: ");
        int kmh = sc.nextInt();

        if (kmh > 150) {
            System.out.println("voce tomou multa por excesso de velocidade!");
        }

        if (kmh < 150) {
            System.out.println("boa!, esta indo bem!, continue assim.");
        }
    }
}
