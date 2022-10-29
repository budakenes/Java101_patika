package giris;
import java.util.Scanner;
public class SınıfGeçmeDurumu {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int mat, fiz, tur, kim, muzik;
        double ort;
        
        System.out.print("Matematik Notunuz : ");
        mat=inp.nextInt();
        mat = mat>0 && mat<=100 ? mat : 0;
        
        System.out.print("Fizik Notunuz : ");
        fiz=inp.nextInt();
        fiz = fiz>0 && fiz<=100 ? fiz : 0;
        
        System.out.print("Türkçe Notunuz : ");
        tur=inp.nextInt();
        tur = tur>0 && tur<=100 ? tur : 0;
        
        System.out.print("Kimya Notunuz : ");
        kim=inp.nextInt();
        kim = kim>0 && kim<=100 ? kim : 0;
        
        System.out.print("Müzik Notunuz : ");
        muzik=inp.nextInt();
        muzik = muzik>0 && muzik<=100 ? muzik : 0;

        ort= (mat+fiz+kim+tur+muzik)/5;
        if(ort>=55 ) {
            System.out.println("Tebrikler! Sınıfı Geçtiniz");
        } else{
            System.out.println("Sınıfı Geçemediniz...");
        }

        System.out.print("Ortalamanız : "+ ort);

    }
}
