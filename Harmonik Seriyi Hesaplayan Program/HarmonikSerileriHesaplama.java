package giris;
import java.util.Scanner;
public class HarmonikSerileriHesaplama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int num;
        double i=1.0, total=0;

        System.out.print("Bir Sayı Giriniz : ");
        num=inp.nextInt();

        while (i<=num) {
            total+=1/i;
            i++;
        }
        System.out.print(total);
    }
}
