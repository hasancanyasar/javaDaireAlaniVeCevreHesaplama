import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int r, merkezAci;
    double pi = 3.14 , alan, cevre;

    Scanner inp = new Scanner(System.in);
    System.out.println("Dairenin yarıçapını giriniz (R) : ");
    r = inp.nextInt();

    System.out.println("Dairenin merkez açısını giriniz (\uD835\uDEFC) : ");
    merkezAci = inp.nextInt();

    alan = (pi * (r * r) * merkezAci) / 360;
    System.out.println("Dairenin Alanı : " + alan);

    cevre = (2 * pi) * r;
    System.out.println("Dairenin Çevresi : " + cevre);



    }
}