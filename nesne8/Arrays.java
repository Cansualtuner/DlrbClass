package org.javaturk.oopj.odevler.nesne8;

public class Arrays {
    public static void main(String[] args) {
        int[] sayiDizisi = new int[10];
        sayiDizisi[0] = 3;
        sayiDizisi [1]=4;
        sayiDizisi[8] = 9;


        int a = sayiDizisi[8];
        System.out.println(a);

        for (int i=0; i< sayiDizisi.length; i++)
            System.out.println(sayiDizisi[i]);

        String[] yaziDizisi = {"Cnasu", "altuner","berrin"};

        for (int i=0; i<yaziDizisi.length; i++){
            System.out.println(yaziDizisi[i]);
        }

        int[][] ikiBoyutlu = new int[3][10];
        ikiBoyutlu[2][7] =  37;
        ikiBoyutlu[0][0]=54;

        for (int i = 0; i<ikiBoyutlu.length;i++){
            for (int j = 0; j<ikiBoyutlu.length; j++){
                System.out.println(ikiBoyutlu[i][j]);
            }
            System.out.println();
        }

    }
}
