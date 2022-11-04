package giris;
import java.util.Scanner;
public class EBOB_EKOKBulanProgram {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n1, n2, ebob=1, ekok;

        System.out.print("İlk Sayıyı Giriniz : ");
        n1= inp.nextInt();
        System.out.print("ikinci Sayıyı Giriniz : ");
        n2=inp.nextInt();
        int i=1;
        while (i<=n1) {
            if (n1%i==0 && n2%i==0)   {
                ebob=i;
            } i++;

        }System.out.println("Sayıların EBOB Değeri : "+ebob);
        ekok=(n1*n2)/ebob;
        System.out.print("Sayıların EKOK Değeri : "+ekok);

    }
}
