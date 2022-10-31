package giris;
import java.util.Scanner;
public class UçakBiletiFiyatHesaplama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int km, age, tip, tutar;
        System.out.print("Mesafeyi KM Cinsinden Giriniz: ");
        km= inp.nextInt();
        System.out.print("Yaşınızı Giriniz : ");
        age= inp.nextInt();
        System.out.print("Yolculuk Tipini Giriniz : ");
        tip= inp.nextInt();

        String str= (tip<3 && tip>0) ? (" ") :("Hatalı Giriş Yaptınız");
        System.out.print(str);

        if (age<=12) {
            if (tip==1) {
                System.out.print(km*0.5);
            } else if (tip==2) {
                System.out.print(km * 0.4);
            }

        } else if (age<=24) {
            if(tip==1) {
                System.out.print(km * 0.9);
            } else if (tip==2) {
                System.out.print(km * 0.72);

            }
        }
        if (age>=65) {
            if (tip == 1) {
                System.out.print(km * 0.7);
            } else if (tip==2) {
                System.out.print(km*0.56);

            }
        }
        if (age<65 && age>24) {
            if (tip==1) {
                System.out.print(km*0.10);
            } else if (tip==2) {
                System.out.print(km*0.8);

            }
        }
    }
}
