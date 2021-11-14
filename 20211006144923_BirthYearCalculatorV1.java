/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package birthyearcalculatorv1;
import java.util.Scanner;
/**
 *
 * @author LUCY
 */
public class BirthYearCalculatorV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        
        System.out.printf("%1s", "Please input a birth year: ");
        String year = myObj.nextLine();

        String century = year.substring(0,2);
        int century1 = Integer.parseInt(century)+1;

        String decade = year.substring(2,3)+0;
        int decade1 = Integer.parseInt(decade);
        
        
        System.out.printf("%1s %5s %s \n", "Birth Year",":", year);   
        System.out.printf("%1s %8s %s \n", "Century",":",century1);
        System.out.printf("%1s %9s %s \n", "Decade",":",decade1);
    }

}
