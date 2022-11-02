package giris;
import java.util.Scanner;
public class KombinasyonHesaplama {
    public static void main(String[] args) {
        int n, r, total=1, total2=1, total3=1;
        Scanner inp=new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        n= inp.nextInt();
        System.out.print("Bir Sayı Giriniz : ");
        r=inp.nextInt();

        if (n>r) {
            for (int i = 1; i <= n; i++) {
                total = total * i;
            }
            for (int a = 1; a <= r; a++) {
                total2 = total2 * a;
            }
            for (int c = 1; c <= n - r; c++) {
                total3 = total3 * c;
            }

            System.out.print(total / (total2 * total3));
        } else {
            System.out.print("Hatalı Giriş Yaptınız!");
        }
    }
}
