import java.util.Scanner;

public class sistemadesenha {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite sua senha: ");
        String senha = s.nextLine();

        if (senha.equals("Cachorroquente")) {
            System.out.println("Acesso liberado");

        }else if (senha.equals("lulaa")) {
            System.out.println("acesso negado");
        }
        }
    }
