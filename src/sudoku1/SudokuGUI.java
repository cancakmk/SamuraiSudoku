/*
showTable() -> Borderlineları çizer ve label oluşturup label matrisine atar.

 */



package sudoku1;

import java.awt.Color;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;
import javax.swing.border.Border;

/**
 *
 * @author Can
 */
public class SudokuGUI extends javax.swing.JFrame {

    public static int matrix[][] = new int[21][21];
    public static JLabel[][] labels = new JLabel[21][21];
    public static JLabel j = new JLabel();
    public static FileReader f = new FileReader();
    public static int basildimi=0;
   
    /**
     *
     */
    /**
     * Creates new form SudokuGUI
     *
     * @throws java.io.FileNotFoundException
     */
    public SudokuGUI() throws FileNotFoundException {
        initComponents();
      

        showTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        solveButton = new javax.swing.JButton();
        example = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );

        solveButton.setText("Çöz");
        solveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(example, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(solveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(solveButton)
                .addGap(90, 90, 90)
                .addComponent(example, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void solveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveButtonActionPerformed

        try {
            long starttime=System.currentTimeMillis();
          
            startThread1();
            
             long endtime=System.currentTimeMillis();
             long fark=endtime-starttime;
            
               
                             
                           
           
          
            

           
           
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SudokuGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
           
      
    }//GEN-LAST:event_solveButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException {
        
            
      
    
          
        

        /* Set the Nimbus look and feel */
      
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SudokuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SudokuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SudokuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SudokuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    new SudokuGUI().setVisible(true);
                   
                      

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(SudokuGUI.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel example;
    private javax.swing.JPanel panel;
    private javax.swing.JButton solveButton;
    // End of variables declaration//GEN-END:variables
SwingWorker sw1;
SwingWorker sw2;
SwingWorker sw3;
SwingWorker sw4;
SwingWorker sw5;
  public static String cozum1="";
  public static String cozum2="";
  public static String cozum3="";
  public static String cozum4="";
  public static String cozum5="";

        
 
 
    public void startThread1() throws FileNotFoundException {
          
        JLabel label = example;
       
        Base.MatrixleriBol();
       
        

         sw1 = new SwingWorker() {
            @Override
            protected String doInBackground() throws Exception {
              
                calculateMatrix1();
                return null;
            }

            protected void done() {
                // this method is called when the background 
                // thread finishes execution
                try {
                    String statusMsg = (String) get();
                    System.out.println("Matrix 1 Çözüldü");
                    
                
                   
                  
                    } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }

//            
        };
         sw2 = new SwingWorker() {
            @Override
            protected String doInBackground() throws Exception {

                calculateMatrix2();

                return null;
            }

            @Override
            protected void done() {
                // this method is called when the background 
                // thread finishes execution
                try {
                    String statusMsg = (String) get();
                    System.out.println("Matrix 2 Çözüldü");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }

//            
        };
         sw3 = new SwingWorker() {
            @Override
            protected String doInBackground() throws Exception {

                calculateMatrix3();

                return null;
            }

            @Override
            protected void done() {
                // this method is called when the background 
                // thread finishes execution
                try {
                    String statusMsg = (String) get();
                    System.out.println("Matrix 3 Çözüldü");
                   

                } catch (InterruptedException | ExecutionException e) {
                }
            }

//            
        };
         sw4 = new SwingWorker() {
            @Override
            protected String doInBackground() throws Exception {

                calculateMatrix4();
                return null;
            }

            @Override
            protected void done() {
                // this method is called when the background 
                // thread finishes execution
                try {
                    String statusMsg = (String) get();
                   System.out.println("Matrix 4 Çözüldü");

                } catch (InterruptedException | ExecutionException e) {
                }
            }

//            
        };
        sw5 = new SwingWorker() {
            @Override
            protected String doInBackground() throws Exception {
                calculateMatrix5();

                return null;
            }

            @Override
            protected void done() {
                // this method is called when the background 
                // thread finishes execution
                try {
                    String statusMsg = (String) get();
                    System.out.println("Matrix 5 Çözüldü");

                } catch (InterruptedException | ExecutionException e) {
                }
            }

//            
        };

       
        
        sw1.execute();
        sw2.execute();
        sw3.execute();
        sw4.execute();
        sw5.execute();
       

       
        
    }
    
    public void showTable() throws FileNotFoundException {
        Border blackline = BorderFactory.createLineBorder(Color.black);
        panel.setBackground(new Color(255, 255, 255));
        
       
        FileReader r = new FileReader();
        r.getAllMatrix();

        for (int x = 0; x < 21; x++) {
            for (int y = 0; y < 21; y++) {

                if (x >= 9 && x <= 11 && y < 6) {
                    continue;

                }
                if (y >= 9 && y <= 11 && x < 6) {
                    continue;

                }
                if (y >= 15 && y <= 20 && x < 12 && x >= 9) {
                    continue;

                }
                if (y >= 9 && y <= 11 && x >= 15 && x <= 20) {
                    continue;

                }

                labels[x][y] = new JLabel();

                labels[x][y].setBounds(x * 20, y * 20, 21 * 20, 21 * 20);

                labels[x][y].setSize(20, 20);
                labels[x][y].setBorder(blackline);
                labels[x][y].setHorizontalAlignment(SwingConstants.CENTER);
                labels[x][y].setVerticalAlignment(SwingConstants.CENTER);
                labels[x][y].setFont(new Font("Calibri", Font.BOLD, 15));

                matrix[x][y] = FileReader.allmatrix[y][x];

                if (matrix[x][y] == 0) {
                    labels[x][y].setText("");
                } else {
                    labels[x][y].setText(String.valueOf(matrix[x][y]));
                }

                panel.add(labels[x][y]);

            }

        }

    }

    public void setTable(int i, int j, int value) {
        if (labels[i][j].getText().equals("")) {
            

            labels[i][j].setText(String.valueOf(value));
         
            
            labels[i][j].setForeground(Color.blue);
            labels[i][j].setFont(new Font("Calibri", Font.BOLD, 15));
            labels[i][j].setHorizontalAlignment(SwingConstants.CENTER);
            labels[i][j].setVerticalAlignment(SwingConstants.CENTER);

        }
      
    }

    public void setTable(int i, int j, String value) {

        if (labels[i][j].getText().equals("")) {
            labels[i][j].setText(value);

        }

    }
    int a=20;
    public void calculateMatrix1() throws InterruptedException, FileNotFoundException {
      
       

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

           
                
                
                setTable(j, i, Base.matrix11[i][j]);
                
               

                Thread.sleep(a);
                
            }

            
      
          
        }
       

    }

    public void calculateMatrix2() throws InterruptedException, FileNotFoundException {
      

        for (int i = 0; i < 9; i++) {
            for (int j = 12; j < 21; j++) {

               

                
                setTable(j, i, Base.matrix22[i][j-12]);
               

                  Thread.sleep(a);

            }

        

            //  j.setText(String.valueOf(i));
        }

    }

    public void calculateMatrix3() throws InterruptedException, FileNotFoundException {
     

        for (int i = 6; i < 15; i++) {
            for (int j = 6; j < 15; j++) {



                 setTable(j, i, Base.matrix33[i-6][j-6]);
                   Thread.sleep(a);
            }
                // 1 2 3 çözülüp kenarlar ortaya atanıp atıldıktan sınra 3 çözülüp sonrasında 5 .yi çözme denenecek.
                //kenarların 3.ye atılmış hali bir matrıxe kopyalanacak o kopya ile 3. matrixin çözülmemiş hali toplam bir diziye atanıp o dizi çözdürülecek.
           

            //  j.setText(String.valueOf(i));
        
         
        //sw3.execute();
        
        
        }
           
       
    
    
    
    
    }

    public void calculateMatrix4() throws InterruptedException, FileNotFoundException {
    

        for (int i = 12; i < 21; i++) {
            for (int j = 0; j < 9; j++) {

               

                 setTable(j, i, Base.matrix44[i-12][j]);
                Thread.sleep(a);

            }

            

        }

    }

    public void calculateMatrix5() throws InterruptedException, FileNotFoundException {
       

        for (int i = 12; i < 21; i++) {
            for (int j = 12; j < 21; j++) {

             

                 setTable(j, i, Base.matrix55[i-12][j-12]);
 Thread.sleep(a);
            }
           

           

          
        }

    }
    


}



