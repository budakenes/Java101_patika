package giris;

public class AsalSayılarıBulanProgram {
    public static void main(String[] args) {
         for (int i=2; i<100; i++) {
             if (i==2 || i==3 || i==5) {
                 System.out.println(i);
             }
             else if (i%2!=0 && i%3!=0 && i%5!=0) {
                 System.out.println(i);
             }

         }
    }
}
