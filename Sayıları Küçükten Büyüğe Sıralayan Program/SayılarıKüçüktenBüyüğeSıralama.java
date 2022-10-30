package giris;
import java.util.Scanner;
public class SayılarıKüçüktenBüyüğeSıralama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a, b, c;

        System.out.print("a : ");
        a= inp.nextInt();
        System.out.print("b : ");
        b= inp.nextInt();
        System.out.print("c : ");
        c= inp.nextInt();

        if(a<b && a<c){
            if(b<c){
                System.out.print("a<b<c");
            }if(c<b){
                System.out.print("a<c<b");
            }

        }if(b<a && b<c){
            if(a<c){
                System.out.print("b<a<c");
            }if(c<a){
                System.out.print("b<c<a");
            }

        }if(c<a && c<b){
            if(a<b){
                System.out.print("c<a<b");
            }if(b<a){
                System.out.print("c<b<a");
            }

        }if(a==b && a==c){
            System.out.println("a=b=c");

        }if(a==b && a<c){
            System.out.println("a=b<c");

        }if(a==b && c<a){
            System.out.println("c<a=b");

        }if(a==c && a<b){
            System.out.println("a=c<b");

        }if(a==c && b<a){
            System.out.println("b<a=c");

        }if(b==c && b<a){
            System.out.println("b=c<a");

        }if(b==c && a<b){
            System.out.println("a<b=c");
        }

        System.out.println("\nTeşekkürler !");
    }
}
