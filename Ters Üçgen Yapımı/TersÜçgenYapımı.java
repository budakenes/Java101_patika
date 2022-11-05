package giris;
import java.util.Scanner;
public class TersÜçgenYapımı {
    public static void main(String[] args) {
        int sayı;
        Scanner inp=new Scanner(System.in);
        System.out.print("Basamak Sayısı : ");
        sayı= inp.nextInt();

        for (int i=1; i<=sayı; i++) {
            for (int k=1; k<=i;k++) {
                System.out.print(" ");
            }
            for (int m=1; m<=(2*(sayı-i)-1) ;m++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
