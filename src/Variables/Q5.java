package Variables;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        //İki tamsayıyı değiştirmek için bir kod yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 2 tam sayı giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int bos;

        bos =sayi2;
        sayi2 = sayi1;
        sayi1=bos;

        System.out.println("sayi1 : " + sayi1 + " sayi2 :"+ sayi2);
    }
}
