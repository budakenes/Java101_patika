package giris;
import java.util.Scanner;
public class FibonacciSerisi {
    public static void main(String[] args) {
        int sayı;
        Scanner inp=new Scanner(System.in);

        System.out.print("Eleman Sayısı : ");
        sayı=inp.nextInt();
        int sonuc = 0, sayi1, sayi2 = 1;

        for (int i = 0; i < sayı; i++) {
            sayi1 = sayi2;
            sayi2 = sonuc;
            sonuc = sayi1 + sayi2;
            System.out.println(sonuc);
        }
    }
}
