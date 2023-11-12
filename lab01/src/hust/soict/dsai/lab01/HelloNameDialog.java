/* 
   Ex3    : HelloNameDialog
   author : Do Thuy Duong 20215019
   ClassID: 732872 
 */
package hust.soict.dsai.lab01;

import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog(null, "Please enter your name:");
        JOptionPane.showMessageDialog(null, "Hi " + result + "!");
        System.exit(0);
    }
}

