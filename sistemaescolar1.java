import java.util.Scanner;

public class sistemaescolar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a sua pontuação: ");
        int nota = sc.nextInt();

        Double resposta = (double)nota / 3;


        //leve em consideração a media e 7.0

        if (resposta == 0) {
            System.out.println("voce reprovou");
        }else if (resposta < 7) {
            System.out.println("voce reprovou ");
        }else if (resposta > 10) {
            System.out.println("sua nota e falsa.");
        }else if (resposta == 10) {
            System.out.println("voce passou de ano!");
        }else if (resposta >= 7) {
            System.out.println("voce passou de ano!");
        }
        }
        }
    
