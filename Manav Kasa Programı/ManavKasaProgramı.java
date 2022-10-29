package giris;
import java.util.Scanner;
public class ManavKasaProgramı {
    public static void main(String[] args) {

        int armut, elma, dmt, muz, ptl;
        Scanner inp=new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? ");
        armut= inp.nextInt();
        System.out.print("Elma Kaç Kilo? ");
        elma= inp.nextInt();
        System.out.print("Domates Kaç Kilo? ");
        dmt= inp.nextInt();
        System.out.print("Muz Kaç Kilo? ");
        muz= inp.nextInt();
        System.out.print("Patlıcan Kaç Kilo? ");
        ptl= inp.nextInt();

        double Tutar= (armut*2.14)+(elma*3.67)+(dmt*1.11)+(muz*0.95)+(ptl*5);
        System.out.println("Toplam Tutar : " + Tutar);
    }
}
