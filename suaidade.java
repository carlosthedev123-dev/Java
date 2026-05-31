import java.util.Scanner;

public class suaidade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite sua idade: ");
        int idade = s.nextInt();

        if (idade >= 1 && idade <= 99) {
            System.out.println("ok");
        }else if (idade >= 99) {
            System.out.println("ta vivo como meu fi");
        }else if (idade < 0) {
            System.out.println("OXE");
        }
        }
        }
