/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplestatisticcalculatorv2;
import java.util.Scanner;
/**
 *
 * @author LUCY
 */
public class SimpleStatisticCalculatorV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        
        System.out.printf("%1s", "Please input 5 numbers seperated by space: ");
        
        double number1 = myObj.nextDouble();
        double number2 = myObj.nextDouble();
        double number3 = myObj.nextDouble();
        double number4 = myObj.nextDouble();
        double number5 = myObj.nextDouble();
              
        double mean = (number1+number2+number3+number4+number5)/5;
        
        double minimum;
        minimum = Math.min(number1,Math.min(number2, Math.min(number3, Math.min(number4, number5))));
       
        double maximum;
        maximum = Math.max(number1,Math.max(number2, Math.max(number3, Math.max(number4, number5))));
        
        double sum = (Math.pow((number1-mean),2)+Math.pow((number2-mean),2)+Math.pow((number3-mean),2)+Math.pow((number4-mean),2)+Math.pow((number5-mean),2));
        sum = Math.abs(sum);
        
        double sDeviation = Math.pow((sum/5),0.5);
                
        System.out.printf("%1s %14s %1.2f, %1.2f, %1.2f, %1.2f, %1.2f \n", "Numbers", ":" , number1, number2, number3, number4, number5);
        System.out.printf("%1s %17s %1.2f \n", "Mean", ":", mean);
        System.out.printf("%1s %13s %1.2f \n", "Smallest", ":", minimum);
        System.out.printf("%1s %14s %1.2f \n", "Largest", ":", maximum);
        System.out.printf("%1s %3s %1.2f \n", "Standard Deviation", ":", sDeviation);
        System.out.printf("\n");
        System.out.printf("%1s", "@Aydan Guzevicius");
        System.out.printf("\n");
    }

}
