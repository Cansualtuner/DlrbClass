package org.javaturk.oopj.odevler.nesne8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dosya {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println(s.next());
        s.close();

        File myFile = new File("C:\\EveBootcamp\file.txt");
        myFile.createNewFile();

        Scanner fileReader = new Scanner(myFile);
        FileWriter fileWriter = new FileWriter(myFile);

        fileWriter.write("Merhaba");
        fileWriter.write("/n Ben cansu");

        while (fileReader.hasNext())
            System.out.println(fileReader.next());
        fileWriter.close();
        fileReader.close();
        //ders 8 i tekrar


    }
}
