package giris;
import java.util.Scanner;
public class OnikiyeBölünenSayılarınOrtalamasınıBulma {
    public static void main(String[] args) {
        int i, ortalama, toplam=0, sayac = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        i = input.nextInt();
        int k=1;

        while (k>=0 && k<=i) {
            if(k%12 ==0) {
                toplam+=k;
                sayac++;
            }
            k++;
        }
        ortalama=toplam/sayac;
        System.out.println("Ortalama : " + ortalama);

    }
}
