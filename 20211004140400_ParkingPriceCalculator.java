/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingpricecalculator;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ParkingPriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner myObj = new Scanner(System.in);
           System.out.printf("%1s", "Please enter the number of minutes your car has been parked: ");
           
           double time1 = myObj.nextDouble();
           double minutes = Math.round(time1*100)/100;
           
           double time2 = minutes/60;
           double hours = Math.ceil(time2);
           
           
           System.out.printf("%1s %6s %.0f \n", "Parking Time (Minutes)",":",minutes);   
           System.out.printf("%1s %8s %.0f \n", "parking Time (Hours)",":",hours);
           System.out.printf("%1s %14s %.2f \n", "Original Price",":",hours*2);
           System.out.printf("\n");
           System.out.printf("%1s", "@Aydan Guzevicius");
           System.out.printf("\n");
    }
    
}
