package giris;
import java.util.Scanner;
public class BurçBulanProgram {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int gün, ay;

        System.out.print("Kaçıncı Ayda Doğdunuz ? ");
        ay = inp.nextInt();
        System.out.print("Kaçıncı Günde Doğdunuz ? ");
        gün = inp.nextInt();

        if (ay == 1) {
            if (gün < 22) {
                System.out.print("Oğlak Burcu");
            } else {
                System.out.print("Kova Burcu");
            }
        }
        if (ay == 2) {
            if (gün < 20) {
                System.out.print("Kova Burcu");
            } else {
                System.out.print("Balık Burcu");
            }
        }
        if (ay == 3) {
            if (gün < 21) {
                System.out.print("Balık Burcu");
            } else {
                System.out.print("Koç Burcu");
            }
        }
        if (ay == 4) {
            if (gün < 21) {
                System.out.print("Koç Burcu");
            } else {
                System.out.print("Boğa Burcu");
            }
        }
        if (ay == 5) {
            if (gün < 22) {
                System.out.print("Boğa Burcu");
            } else {
                System.out.print("İkizler Burcu");
            }
        }
        if (ay == 6) {
            if (gün < 23) {
                System.out.print("İkizler Burcu");
            } else {
                System.out.print("Yengeç Burcu");
            }
        }
        if (ay == 7) {
            if (gün < 23) {
                System.out.print("Yengeç Burcu");
            } else {
                System.out.print("Aslan Burcu");
            }
        }
        if (ay == 8) {
            if (gün < 23) {
                System.out.print("Aslan Burcu");
            } else {
                System.out.print("Başak Burcu");
            }
        }
        if (ay == 9) {
            if (gün < 23) {
                System.out.print("Başak Burcu");
            } else {
                System.out.print("Terazi Burcu");
            }
        }
        if (ay == 10) {
            if (gün < 23) {
                System.out.print("Terazi Burcu");
            } else {
                System.out.print("Akrap Burcu");
            }
        }
        if (ay == 11) {
            if (gün < 22) {
                System.out.print("Akrep Burcu");
            } else {
                System.out.print("Yay Burcu");
            }
        }
        if (ay == 12) {
            if (gün < 22) {
                System.out.print("Yay Burcu");
            } else {
                System.out.print("Oğlak Burcu");
            }
        }
        if(ay>12) {
            if (gün > 31) {
                System.out.print("Hatalı Giriş Yaptınız!");
            }
        }
    }
}

