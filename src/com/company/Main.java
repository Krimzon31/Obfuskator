package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try(FileReader FR = new FileReader("text.txt");
            FileWriter FW = new FileWriter("A.java")){
            int C = 0;
            String text = "";
            while((C = FR.read()) != -1){
                text += (char)C;
            }

            String tx = text.replaceAll("\\//.+", ""); // удаление односторчных комментариев
            tx = tx.replaceAll("/\\*(?s).*?\\*/", ""); // удаление двухстрочных комментариев
            tx = tx.replaceAll("\n|\r\n", " "); // удаление переноса строки
            tx = tx.replaceAll(" +", " "); // замена более одного пробела на один

            tx = tx.replaceAll("public class Main", "public class A"); // замена главного класса

            //ReplaceClassName rcn = new ReplaceClassName();
            //tx = rcn.ReplaceClassName(tx);

            MetaSimvl ms = new MetaSimvl();
            tx = ms.MetaSimvl(tx);


            FW.write(tx);
            FW.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
