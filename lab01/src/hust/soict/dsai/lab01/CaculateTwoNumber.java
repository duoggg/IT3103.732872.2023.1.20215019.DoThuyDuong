/* 
   Ex5    : ShowTwoNumbers
   author : Do Thuy Duong 20215019
   ClassID: 732872 
 */
package hust.soict.dsai.lab01;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class CaculateTwoNumber{
    public static void main(String[] args) {
        String strNum1, strNum2;
        String noti = " of two inputs is ";
       
        // Nhap so thu 1
        strNum1 = JOptionPane.showInputDialog(null, "Num 1", 
                        "Do Thuy Duong 20215019", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        // Nhap so thu 2
        strNum2 = JOptionPane.showInputDialog(null, "Num 2", 
                        "Do Thuy Duong 20215019", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);
            
        // In ra chuoi
        noti =  "Sum of two numbers is "          + (num1 + num2)
              + "\nDifference of two numbers is " + (num1 - num2)
              + "\nProduct of two numbers is "    + (num1 * num2) ;

        if(num2==0)
            noti += "\nQuotient is unidentified! ";
        else
            noti += "\nQuotient of two numbers is " + (num1 / num2);
        JOptionPane.showMessageDialog(null, noti, 
                                    "Caculate", JOptionPane.INFORMATION_MESSAGE);
        
        
    }
}