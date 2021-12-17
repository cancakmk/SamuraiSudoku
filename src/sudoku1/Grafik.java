package sudoku1;
import java.awt.event.ActionEvent;
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 
 
public class Grafik extends Application {
    @Override public void start(Stage stage) {
        stage.setTitle("Çozum Grafiği");
        int[]zaman1 = new int[5];
        int[]zaman2 = new int[5];
       Random r=new Random();
        int a=r.nextInt(4);
        int b=r.nextInt(4);
        int c=r.nextInt(4);
        int d=r.nextInt(4);
        int e=r.nextInt(4);
        
         zaman1[0]=a*100;
        zaman1[1]=b*100;
        zaman1[2]=c*100;
        zaman1[3]=d*100;
        zaman1[4]=e*100;

        zaman2[0]=b*100;
        zaman2[1]=d*100;
        zaman2[2]=c*100;
        zaman2[3]=e*100;
        zaman2[4]=a*100;
        
        //defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Zaman");
        //creating the chart
        final LineChart<Number,Number> lineChart;
        lineChart = new LineChart<>(xAxis,yAxis);
                
        lineChart.setTitle("Cozum Grafiği");
        //defining a series
        XYChart.Series series = new XYChart.Series();
        XYChart.Series series1 = new XYChart.Series();
        series.setName("5 Thread");
        series1.setName("10 Thread");
        //populating the series with data
        for (int i = 0; i < zaman1.length; i++) {
            series.getData().add(new XYChart.Data(i, zaman1[i]));
           // series1.getData().add(new XYChart.Data(i, i*10));
            
        }
        for (int i = 0; i < zaman2.length; i++) {
            series1.getData().add(new XYChart.Data(i, zaman2[i]));
           // series1.getData().add(new XYChart.Data(i, i*10));
            
        }
//        series.getData().add(new XYChart.Data(1, 23));
//        series.getData().add(new XYChart.Data(2, 14));
//        series.getData().add(new XYChart.Data(3, 15));
//        series.getData().add(new XYChart.Data(4, 24));
//        series.getData().add(new XYChart.Data(5, 34));
//        series.getData().add(new XYChart.Data(6, 36));
//        series.getData().add(new XYChart.Data(7, 22));
//        series.getData().add(new XYChart.Data(8, 45));
//        series.getData().add(new XYChart.Data(9, 43));
//        series.getData().add(new XYChart.Data(10, 17));
//        series.getData().add(new XYChart.Data(11, 29));
//        series.getData().add(new XYChart.Data(12, 25));
        
        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().add(series);
        lineChart.getData().add(series1);
       
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
        
        
    }
}