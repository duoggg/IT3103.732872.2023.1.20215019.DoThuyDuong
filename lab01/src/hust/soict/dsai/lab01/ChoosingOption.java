/* 
   Ex     : ChoosingOption
   author : Do Thuy Duong 20215019
   ClassID: 732872 
 */
package hust.soict.dsai.lab01;

import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {
        String[] opt = new String[]{"I do", "I don't"};
        // int option = JOptionPane.showOptionDialog(null, "Do you want to change to the first class ticket?", "Do Thuy Duong 20215019",
        //         JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        //         null, opt, opt[0]);
         int option = JOptionPane.showConfirmDialog(null,"Do you want to change to the first class ticket?", "Do Thuy Duong 20215019",
                        JOptionPane.YES_NO_OPTION);
    //   int option = JOptionPane.showConfirmDialog
        // int option = JOptionPane.showConfirmDialog(null,
        //         "Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null, "You've chosen: "
                + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
        System.exit(0);
    }
}
