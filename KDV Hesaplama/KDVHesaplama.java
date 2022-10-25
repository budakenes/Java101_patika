package giris;
import java.util.Scanner;

public class KDVHesaplama {
        public static void main(String[] args) {
          double fiyat;
          Scanner input=new Scanner(System.in);
          System.out.print("Lütfen Fiyat Giriniz: ");
          fiyat=input.nextDouble();
          Double oran= fiyat<1000 ? 1.18:1.08;
          Double kdvli=fiyat*oran;
          Double kdvTutarı=kdvli-fiyat;
          System.out.println("KDV'siz Fiyat: "+fiyat);
          System.out.println("KDV'li Fiyat: "+kdvli);
          System.out.print("KDV Tutarı: "+ kdvTutarı);

        }
}
