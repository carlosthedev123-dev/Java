public class if1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world");
        if (true) {
            System.out.println("esse codigo e invevitavel");
        }
        Thread.sleep(2000);

        int numero = 9;

        if (numero < 10) {
            System.out.println(" o numero e menor que 10");
        }
        Thread.sleep(1000);
        if (numero > 10)
            System.out.println("o numero e maior que 10");
    }
}
