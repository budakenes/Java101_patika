package giris;
import java.util.Scanner;
public class ÜslüSayıHesaplama {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int n, k, total=1;
        System.out.print("Üssü Alınacak Sayı : ");
        n=inp.nextInt();
        System.out.print("Üs Olarak Alınacak Sayı : ");
        k=inp.nextInt();

        for (int i=1; i<=k;i++) {
            total*=n;
        }System.out.print("Cevap : "+total);
    }
}
