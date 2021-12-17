/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudoku1;

import java.io.FileWriter;
import java.io.IOException;

public class txtYazdir {
    public static String cozum="";
   

    public static void main(String[] args) {

      // txtyeYaz(denenen1);
        

    }

    public static void txtyeYaz(String s,String filename) {
        try {
//         myWriter = new FileWriter("src/sudoku1/TextFile/filename.txt");
            FileWriter myWriter = new FileWriter("src/sudoku1/TextFile/"+filename+".txt");
            myWriter.write(s);
            myWriter.close();

            System.out.println("Başarılı Bir Şekilde Dosyaya Yazdırdı");
        } catch (IOException e) {
            System.out.println("Dosya yazmada hata oluştu...");
            e.printStackTrace();
        }

    }

}
