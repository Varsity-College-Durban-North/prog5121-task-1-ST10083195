
package part1;

import javax.swing.JOptionPane;

/**
 * ST10083195
 * @author Yaseen Khan
 */
public class Part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login l1 = new Login();
        
        String username = JOptionPane.showInputDialog("Please enter username"),
                password = JOptionPane.showInputDialog("Please enter password"),
                firstname = JOptionPane.showInputDialog("Please enter first name"),
                lastname = JOptionPane.showInputDialog("Please enter last name");
        
        //register method is used
        l1.registerUser(username, password, firstname, lastname);
        
        //user asked to enter the login details
        String unamelogin = JOptionPane.showInputDialog("Enter your username"),
                pnameLogin = JOptionPane.showInputDialog("Enter your password");
        
        //login status is stored from the loginUser method
        boolean status = l1.loginUser(unamelogin, pnameLogin);
        String message = l1.returnLoginStatus(status);
        
        JOptionPane.showMessageDialog(null, message);
    }
    
}
