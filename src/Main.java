import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Euklimedes euklimedes = new Euklimedes();

        Scanner pierwszy = new Scanner(System.in);
        System.out.println("Wpisz a.");
        int a = pierwszy.nextInt();

        System.out.println("Wpisz b.");
        Scanner drugi = new Scanner(System.in);
        int b = drugi.nextInt();
        int wynik = euklimedes.zrob(a,b);
        System.out.println("Największy wspólny dzielnik to: "+wynik);
    }
}