package org.javaturk.oopj.odevler.nesne8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculatord {
    public static void main(String[] args) {
        Scanner okuyucu = new Scanner(System.in);
        System.out.println("hesap makineme hoşgeldiniz.");
        System.out.println("Hesaplamak istediğiniz 2 sayıyı girin:");
        int sayiBir = okuyucu.nextInt();
        int sayiİki = okuyucu.nextInt();
        System.out.println("Hangi işlemi yapmak istersiniz(*,/,-,+)");
        char islem = okuyucu.next().charAt(0);
        int sonuc;
        switch (islem){
            case '+':
                sonuc = sayiİki+sayiBir;
                System.out.println(sonuc); break;
            case '-':
                sonuc = sayiİki-sayiBir;
                System.out.println(sonuc);break;
            case '*':
                sonuc = sayiBir*sayiİki;
                System.out.println(sonuc);break;
            case '/':
                sonuc = sayiBir/sayiİki;
                System.out.println(sonuc);break;

            default:
                System.out.println("diğer");
        }
    }
}
