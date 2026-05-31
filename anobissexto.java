import java.util.Scanner;

public class anobissexto {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite o seu ano: ");
        int ano = Integer.valueOf(s.nextLine());

        if (ano % 4 == 0) {
            System.out.println("e um ano bissexto");
        }else if (ano % 400 == 00) {
            System.out.println("o seu ano e bissexto");
        }else{
            System.out.println("seu ano não e bissexto");
        }
        }
        }
