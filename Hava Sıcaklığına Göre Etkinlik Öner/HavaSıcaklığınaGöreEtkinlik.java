package giris;
import java.util.Scanner;
public class HavaSıcaklığınaGöreEtkinlik {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int sıcaklık;
        System.out.print("Sıcaklık Giriniz : ");
        sıcaklık=inp.nextInt();

        if (sıcaklık<5) {
            System.out.print("Kayak Yapabilirsin.");
        } else if (sıcaklık<15) {
            System.out.print("Sinemaya Gidebilirsin.");
            
        } if (sıcaklık<25 && sıcaklık>15){
            System.out.print("Piknik Yapabilrsin.");
        } else if (sıcaklık>25) {
            System.out.print("Yüzmeye gidebilsin");

        }

    }
}
