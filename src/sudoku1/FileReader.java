/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudoku1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileReader {
    
   
    public static int [][] allmatrix=new int[21][21];
    public static String data;
    public static char[] ch;
    public static char [][] matrix1=new char[9][9];
    public static char [][] matrix2=new char[9][9];
    public static char [][] matrix3=new char[9][9];
    public static char [][] matrix4=new char[9][9];
    public static char [][] matrix5=new char[9][9];

    public static int [][] intMatrix1=new int[9][9];
    public static int [][] intMatrix2=new int[9][9];
    public static int [][] intMatrix3=new int[9][9];
    public static int [][] intMatrix4=new int[9][9];
    public static int [][] intMatrix5=new int[9][9];

    public static int totalRow = 21;
    public static char[][] myArray = new char[totalRow][];
    public static FileReader f=new FileReader();



    public  void charToInt() throws FileNotFoundException{
        
    for (int i = 0; i <9 ; i++) {
        for (int j = 0; j <9 ; j++) {
           intMatrix1[i][j]=Character.getNumericValue(matrix1[i][j]);
          
        }
    }
    for (int i = 0; i <9 ; i++) {
        for (int j = 0; j <9 ; j++) {
            intMatrix2[i][j]=Character.getNumericValue(matrix2[i][j]);
        }
    }
    for (int i = 0; i <9 ; i++) {
        for (int j = 0; j <9 ; j++) {
            intMatrix3[i][j]=Character.getNumericValue(matrix3[i][j]);
        }
    }
    for (int i = 0; i <9 ; i++) {
        for (int j = 0; j <9 ; j++) {
            intMatrix4[i][j]=Character.getNumericValue(matrix4[i][j]);
        }
    }
    for (int i = 0; i <9 ; i++) {
        for (int j = 0; j <9 ; j++) {
            intMatrix5[i][j]=Character.getNumericValue(matrix5[i][j]);
        }
    }


}
    public  void toZero(){
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                if (matrix1[i][j]=='*'){
                    matrix1[i][j]='0';
                }
            }
        }
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                if (matrix2[i][j]=='*'){
                    matrix2[i][j]='0';
                }
            }
        }
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                if (matrix3[i][j]=='*'){
                    matrix3[i][j]='0';
                }
            }
        }
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                if (matrix4[i][j]=='*'){
                    matrix4[i][j]='0';
                }
            }
        }
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                if (matrix5[i][j]=='*'){
                    matrix5[i][j]='0';
                }
            }
        }

    }
    public  void printMatrix(){

        System.out.println("Matrix 1");
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix 2");
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix 3");
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix 4");
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                System.out.print(matrix4[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix 5");
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                System.out.print(matrix5[i][j]+" ");
            }
            System.out.println();
        }
    }
    public  void matrixleriAl() throws FileNotFoundException {
        
       

        File file = new File("cozulecek.txt");
        Scanner scanner = new Scanner(file);

        for (int row = 0; scanner.hasNextLine() && row < totalRow; row++) {
            myArray[row] = scanner.nextLine().toCharArray();
            //System.out.println( myArray[row]);
        }
        //System.out.println("Matrix 1");
        for (int i = 0; i <9; i++) {
            
            
            for (int j = 0; j <9 ; j++) {
                matrix1[i][j]=myArray[i][j];
                
                
                
                //System.out.print(matrix1[i][j]);
            }
          //System.out.println();
        }

        //System.out.println("Matrix 2");
        for (int i = 0; i <6; i++) {
            for (int j = 9; j <18 ; j++) {
                matrix2[i][j-9]=myArray[i][j];
               //System.out.print(matrix2[i][j-9]);
            }
            //System.out.println();
        }
        for (int i = 6; i <9; i++) {
            for (int j = 12; j <21 ; j++) {
                matrix2[i][j-12]=myArray[i][j];
                //System.out.print(matrix2[i][j-12]);
            }
            //System.out.println();
        }


        //************ Matrix 3 *******************
        //System.out.println("Matrix 3");
        for (int i = 6; i <9; i++) {
            for (int j = 6; j <15 ; j++) {
                matrix3[i-6][j-6]=myArray[i][j];
                //System.out.print(matrix3[i-6][j-6]);
            }
            //System.out.println();
        }


        for (int i = 9; i <12; i++) {
            for (int j = 0; j <9 ; j++) {
                matrix3[i-6][j]=myArray[i][j];
                //System.out.print(matrix3[i-6][j]);
            }
            //System.out.println();
        }

        for (int i = 12; i <15; i++) {
            for (int j = 6; j <15 ; j++) {
                matrix3[i-6][j-6]=myArray[i][j];
                //System.out.print(matrix3[i-6][j-6]);
            }
           // System.out.println();
        }

        //System.out.println("Matrix 4");
        for (int i = 12; i <21; i++) {
            for (int j = 0; j <9 ; j++) {
                matrix4[i-12][j]=myArray[i][j];
                //System.out.print(matrix4[i-12][j]);
            }
            //System.out.println();
        }
       // System.out.println("Matrix 5");
        for (int i = 12; i <15; i++) {
            for (int j = 12; j <21 ; j++) {
                matrix5[i-12][j-12]=myArray[i][j];
               // System.out.print(matrix5[i-12][j-12]);
            }
           //System.out.println();
        }
        for (int i = 15; i <21; i++) {
            for (int j = 9; j <18 ; j++) {
                matrix5[i-12][j-9]=myArray[i][j];
                //System.out.print(matrix5[i-12][j-9]);
            }
           // System.out.println();
        }

        f.toZero();
        f.charToInt();
       

    }
    public  int[][] getAllMatrix() throws FileNotFoundException{
        
        f.matrixleriAl();
        for (int i = 0; i <21; i++) {
            for (int j = 0; j < 21; j++) {
               if(i>=0 && i<=8 && j>=0 && j<=8){
                   //Matrix 1
                   allmatrix[i][j]=intMatrix1[i][j];
                   
                  
                    
            }
               
               else if(i>=0 && i<=8 && j>=12 && j<=20){
                    //Matrix 2
                allmatrix[i][j]=intMatrix2[i][j-12];
                 
            }
               else if(i>=6 && i<=14 && j>=6 && j<=14){
                     //Matrix 3
                      allmatrix[i][j]=intMatrix3[i-6][j-6];
                      
                       
                
            }
               else  if(i>=12 && i<=20 && j>=0 && j<=8){
                //Matrix 4
                allmatrix[i][j]=intMatrix4[i-12][j];
                  
                
            }
               else  if(i>=12 && i<=20 && j>=12 && j<=20){
                //Matrix 5
                allmatrix[i][j]=intMatrix5[i-12][j-12];
                 
            }
//               else{
//                   allmatrix[i][j]=0;
//               }
                  
                
            }
           
        }
       // System.out.println("FileReadera Classındaki: ");
             
      // printAllMatrix();
        
      
       
               
             return allmatrix;
             
        
    }
    public void printIntMatrix(){
         System.out.println("Matrix 1");
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                System.out.print(intMatrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix 2");
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                System.out.print(intMatrix2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix 3");
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                System.out.print(intMatrix3[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix 4");
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                System.out.print(intMatrix4[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix 5");
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                System.out.print(intMatrix5[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public int[][] printAllMatrix() throws FileNotFoundException{
        f.getAllMatrix();
        for (int x = 0; x < 21; x++) {
            for (int y = 0; y < 21; y++) {
                if (x >= 9 && x <= 11 && y < 6) {
                    allmatrix[x][y]=0;
                            

                }
                if (y >= 9 && y <= 11 && x < 6) {
                    allmatrix[x][y]=0;

                }
                if (y >= 15 && y <= 20 && x < 12 && x >= 9) {
                    allmatrix[x][y]=0;

                }
                if (y >= 9 && y <= 11 && x >= 15 && x <= 20) {
                    allmatrix[x][y]=0;

                }
            // System.out.print(allmatrix[x][y]+" ");
                
            }
           // System.out.println("");
        }
     return allmatrix;
    }
    
    public static void main(String[] args) throws FileNotFoundException {

      f.getAllMatrix();
      f.printAllMatrix();
      
      


    }




}
