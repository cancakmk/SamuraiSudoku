/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudoku1;




import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Base {

    public static int[][] matrix11 = new int[9][9];
    public static int[][] matrix22 = new int[9][9];
    public static int[][] matrix33 = new int[9][9];
    public static int[][] matrix44 = new int[9][9];
    public static int[][] matrix55 = new int[9][9];
    public static int[][] FileReaderMatrisi = new int[21][21];
    public static int[][] cozulenMatrix = new int[21][21];
     public static int[][] cozulecekMatrix = new int[21][21];
    public static int[][] temp = new int[9][9];
    public static ArrayList zaman = new ArrayList();

    public static FileReader a = new FileReader();



    public static void main(String[] args) throws FileNotFoundException {

        MatrixleriBol();
    }
    
   public static void MatrixleriBol() throws FileNotFoundException{
            a.matrixleriAl();
          a.getAllMatrix();
        FileReaderMatrisi = a.printAllMatrix();
        Samurai samurai = new Samurai();
        samurai.solve(FileReaderMatrisi);

        // cozulenMatrix= samurai.solve(FileReaderMatrisi);
        //System.out.println("Matrix 1");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                matrix11[i][j] = cozulenMatrix[i][j];
            }

        }

        //System.out.println("Matrix 2");
        for (int i = 0; i < 9; i++) {
            for (int j = 12; j < 21; j++) {
                matrix22[i][j - 12] = cozulenMatrix[i][j];

            }

        }

        //System.out.println("Matrix 3");
        for (int i = 6; i < 15; i++) {
            for (int j = 6; j < 15; j++) {
                matrix33[i - 6][j - 6] = cozulenMatrix[i][j];

            }

        }

        //System.out.println("Matrix 4");
        for (int i = 12; i < 21; i++) {
            for (int j = 0; j < 9; j++) {
                matrix44[i - 12][j] = cozulenMatrix[i][j];

            }

        }
        // System.out.println("Matrix 5");
        for (int i = 12; i < 21; i++) {
            for (int j = 12; j < 21; j++) {
                matrix55[i - 12][j - 12] = cozulenMatrix[i][j];

            }

        }

        //MatrixleriYazdir();

    }
   
   public static void MatrixleriYazdir(){
        System.out.println("Matrix 1");
        for (int i = 0; i <9; i++) {
         for (int j = 0; j <9 ; j++) {
              
                System.out.print(matrix11[i][j]+" ");
            }
          System.out.println();
        }

        System.out.println("Matrix 2");
         for (int i = 0; i <9; i++) {
         for (int j = 0; j <9 ; j++) {
              
                System.out.print(matrix22[i][j]+" ");
            }
          System.out.println();
        }
       


        //************ Matrix 3 *******************
        System.out.println("Matrix 3");
        for (int i = 0; i <9; i++) {
         for (int j = 0; j <9 ; j++) {
              
                System.out.print(matrix33[i][j]+" ");
            }
          System.out.println();
        }

       

        System.out.println("Matrix 4");
        for (int i = 0; i <9; i++) {
         for (int j = 0; j <9 ; j++) {
              
                System.out.print(matrix44[i][j]+" ");
            }
          System.out.println();
        }
        System.out.println("Matrix 5");
        for (int i = 0; i <9; i++) {
         for (int j = 0; j <9 ; j++) {
              
                System.out.print(matrix55[i][j]+" ");
            }
          System.out.println();
        }
       
       
   }
        

        
}
   