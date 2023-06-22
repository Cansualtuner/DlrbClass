package org.javaturk.oopj.absint;
//abstract class ve interface farkı nedir
public class TestClass {

}
//interfacede tanımlanan tüm değişkenler publictir ve finaldır
interface   Boy{
    int degisken =0;
    static String tanım(){
        return "Bu iterface implement eden class için"+ " boy bilgileri dönülmesini garanti eder.";
    }
    int boySantimetre();
    double boyMetre();
    default double boyKilometre(){
        return 0;
    }
}

abstract class Hayvan implements Boy{
    private int boy;
    private int kilo;
    public abstract boolean canliMi();


    public int getBoy() {
        return boy;
    }
    public void setBoy (int boy){
        this.boy=boy;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }
}
