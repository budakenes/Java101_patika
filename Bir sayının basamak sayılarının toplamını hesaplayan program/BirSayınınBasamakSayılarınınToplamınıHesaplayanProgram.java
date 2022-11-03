package giris;
import java.util.Scanner;
public class BirSayınınBasamakSayılarınınToplamınıHesaplayanProgram {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int number, adet=0, toplam=0;
        System.out.print("Bir Sayı Giriniz : ");
        number= inp.nextInt();

        while (number!=0) {
            toplam+=number%10;
            number/=10;
        }
        System.out.print("Basamak Sayıları Toplamı : "+toplam);
    }
}
