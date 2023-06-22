package org.javaturk.oopj.odevler.nesne8;

public class Functions {
//static sabit
    //oid bişey dönmicek demek
    public static void main(String[] args) {
        int top1 = 7;
        int top2 = 6;
        int donencevap = toplama(top1,top2);
        System.out.println(donencevap);
        System.out.println(merhaba(" Cansu"));
        System.out.println(yilbul(23));
        bye();


    }
    //fonksiyonlar tip olarak bir değişken dönebilir
    public static int toplama(int sayi1, int sayi2){
        int cevap;
        cevap = sayi1 + sayi2;
        return cevap;

    }
    public static String merhaba(String ad){
        return "Merhaba" +ad;
    }
    public static String yilbul(int yas){
        int yil = 2023 -yas;

        return yil + "yılında doğdunuz.";
    }
    public static void bye(){
        System.out.println("Görüşürüz");
    }


}
