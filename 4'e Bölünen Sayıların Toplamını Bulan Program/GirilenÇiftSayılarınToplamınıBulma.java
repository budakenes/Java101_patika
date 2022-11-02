package giris;
import java.util.Scanner;
public class GirilenÇiftSayılarınToplamınıBulma {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int sayı, toplam=0;
        do {
            System.out.print("Bir Sayı giriniz : ");
            sayı = inp.nextInt();
            if (sayı%4==0) {
                toplam+=sayı;
            }
        } while (sayı>0);
        System.out.print(toplam);


    }
}
