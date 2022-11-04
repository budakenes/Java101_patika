package giris;
import java.util.Scanner;
public class MükemmelSayıBulanProgram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int sayı, i=1, a=0;
        System.out.print("Bir Sayı Giriniz : ");
        sayı= input.nextInt();

        while (i<sayı) {
            if (sayı%i==0) {
                   a+=i;
               } i++;
        }if (a==sayı){
            System.out.print(sayı+"Mükemmel Sayıdır");
        } else {
            System.out.print(sayı+"Mükemmel Sayı Değildir.");
        }

        }
    }

