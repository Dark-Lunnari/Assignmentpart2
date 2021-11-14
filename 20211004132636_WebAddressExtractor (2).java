/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webaddressextractor;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class WebAddressExtractor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
            System.out.printf("%1s", "Please  input a web address: ");
                System.out.printf("\n");
                
        String address = myObj.nextLine().toLowerCase();
            int part1 = address.indexOf('.');
            int part2 = address.lastIndexOf('.');

        String heading = address.substring(0,part1);
        String company = address.substring(part1 +1, part2);
        String extension = address.substring(part2 + 1);
        
        System.out.printf("%1s %7s %s \n", "Address", ":",address );
        System.out.printf("%1s %7s %s \n", "Heading", ":",heading );
        System.out.printf("%1s %7s %s \n", "Company", ":",company );
        System.out.printf("%1s %5s %s \n", "Extension", ":",extension );
        
        System.out.printf("\n");
        
        System.out.printf("%1s \n", "@Aydan Guzevicius");
    }
    
}
