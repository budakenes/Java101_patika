package giris;
import java.util.Scanner;
public class VücutKitleEndeksiHesaplama {
    public static void main(String[] args) {
        int kilo;
        double boy, vki;
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kilo=inp.nextInt();
        System.out.print("Lütfen Boyunuzu Giriniz : ");
        boy= inp.nextDouble();
        vki=kilo/(boy*boy);
        System.out.print("Vücut Kitle Endeksiniz : "+vki);
    }
}
