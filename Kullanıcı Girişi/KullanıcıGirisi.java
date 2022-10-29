package giris;
import java.util.Scanner;
public class KullanıcıGirisi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        String username, password, cevap, yeni;
        System.out.print("Kullanıcı Adını Giriniz :");
        username=inp.nextLine();
        System.out.print("Şifrenizi Giriniz :");
        password=inp.nextLine();

        if(username.equals("patika")&& password.equals("java123")) {
            System.out.print("Giriş Yaptınız !");
        } else {
            System.out.println("Hatalı Giriş Yaptınız ! Şifrenizi Sıfırlamak İstiyor Musunuz ?");
        }
        cevap=inp.nextLine();
        if (cevap.equals("evet")) {
            System.out.print("Lütfen Önceki Şifrenizden Farklı Bir Şifre Belirleyin : ");
        }
        yeni=inp.nextLine();
        if(yeni.equals("java123")) {
            System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
        }else {System.out.print("Şifre Oluşturuldu");}



    }
}
