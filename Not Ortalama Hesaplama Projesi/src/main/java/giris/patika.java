package giris;

import java.util.Scanner;

public class patika {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp= new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat=inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik=inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya=inp.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce=inp.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih=inp.nextInt();

        System.out.print("Müzik notunuz:");
        muzik=inp.nextInt();

        int sonuc=mat+fizik+kimya+turkce+tarih+muzik;
        double ortalama=sonuc/6;

        System.out.println("Ortalamanız:"+ortalama);

        String str = ortalama>=60.0 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.print(str);
    }
}

