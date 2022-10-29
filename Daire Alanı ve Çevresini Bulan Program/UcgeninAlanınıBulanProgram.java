package giris;
import java.util.Map;
import java.util.Scanner;
public class UcgeninAlanınıBulanProgram {
    public static void main(String[] args) {
        double a, b, c, u, alan;
        Scanner inp=new Scanner(System.in);
        System.out.print("Üçgenin Kenar Uzunluğunu Giriniz : ");
        a=inp.nextInt();
        System.out.print("Üçgenin Kenar Uzunluğunu Giriniz : ");
        b=inp.nextInt();
        System.out.print("Üçgenin Kenar Uzunluğunu Giriniz : ");
        c=inp.nextInt();

        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin Çevresi : "+ 2*u);
        System.out.print("Üçgenin Alanı : "+alan);
    }
}
