import java.util.Scanner;

public class iguais {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("digite um texto: ");
       String primeiro = sc.nextLine();

       System.out.println("digite outro texto: ");
       String segunda = sc.nextLine();

       if (primeiro.equals(segunda)) {
        System.out.println("voce digitou a mesma coisa lol");
       }else{
        System.out.println("voce digitou diferente olk");
       }
       }
       } 

