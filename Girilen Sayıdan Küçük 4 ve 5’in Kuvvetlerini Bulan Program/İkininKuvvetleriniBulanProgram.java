package giris;
import java.util.Scanner;
public class İkininKuvvetleriniBulanProgram {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int x;
        System.out.print("Bir Sayı Giriniz : ");
        x= inp.nextInt();

        for (int i=1; i<x; i*=4) {
            System.out.println(i);
        }
        for (int a=1; a<x; a*=5) {

            System.out.println(a);
        }



    }
}
