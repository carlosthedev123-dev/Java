import java.util.Scanner;

public class sistemaescolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua pontuação e eu irei dizer sua nota.: ");
        int ponto = sc.nextInt();

        if (ponto == 0) {
            System.out.println("voce reprovou");

        }else if (ponto < 50) {
            System.out.println("voce não passou foi mal");
        }else if (ponto <= 59) {
            System.out.println("voce tirou 1!");
        }else if (ponto <= 69) {
            System.out.println("boa voce tirou 2!");
        }else if (ponto <= 79) {
            System.out.println("voce tirou 3!");
        }else if (ponto <= 89) {
            System.out.println("voce tirou 4!");
        }else if (ponto <= 99) {
            System.out.println("voce tirou 5!, parabens!");
        }else if (ponto >= 100) {
            System.out.println("BOA!, VOCE TIROU A NOTA MAS ALTA!");
        }
        }
        }