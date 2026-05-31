import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int numero = Integer.valueOf(s.nextLine());

        if (numero % 3 == 0) {
            System.out.println("o seu numero e divisivel por 3 :p");
        }else if (numero % 5 == 0) {
            System.out.println("seu numero e divisivel por 5");
        }else if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("seu numero e divisvel por 3 e 5!!");
        }else{
            System.out.println("seu numero não e divisvel por 3 nem 5");
        }
        }
        }