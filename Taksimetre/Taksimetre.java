package giris;
import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        double km=2.20;
        double tutar;
        int yol;
        Scanner inp=new Scanner(System.in);
        System.out.print("Gidilecek Mesafeyi KM Cinsinden Giriniz : ");
        yol=inp.nextInt();
        tutar=10+yol*km;
        if (tutar<=20){
            tutar=20;
        }
        System.out.print(tutar);
    }
}
