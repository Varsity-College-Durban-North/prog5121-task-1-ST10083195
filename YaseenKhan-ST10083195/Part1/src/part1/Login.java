
package part1;

import java.util.regex.*;

/**
 *ST10083195
 * @author Yaseen Khan
 */
public class Login 
{
    String UserName,
            Password,
            FirstName,
            LastName;
    
    boolean checkUserName(String temp) 
    {//checks if length is greater and doesn't have underscore and then returns inverse
        if ((UserName.length() > 5) && (UserName.indexOf('_') == -1)) 
        { 
            return false;
        } else         
        { 
            return true;
        }    
    }
     /*CODE ATTRIBUTION
    Link: https://mkyong.com/regular-expressions/how-to-validate-password-with-regular-expression/*/
    boolean checkPasswordComplexity(String temp) 
    {
        //regex is used, link for website is above
        String passwordRequirements = "^=.*[0-9]"
        + "(?=.*[a-z](?=.*[A-Z]))"
        + "(?=.*[@$%#^&+=])"
        + "(?=\\S+$).{8,20}$";

        Pattern stringPattern = Pattern.compile(passwordRequirements);
        Matcher matcher = stringPattern.matcher(passwordRequirements);

        return matcher.matches();
    }
    
    boolean loginUser(String user, String password)
    {//if password is equal to the stored password then it is passed
        //same goes for the username
        if(user.equals(UserName) && password.equals(Password))
        {
            return true;       
        }
        else
        {
            return false;        
        }
    }
    
    String registerUser(String tempFirstName, String tempLastName, String tempUsername, String tempPassword)
    {
        if ((checkPasswordComplexity(tempPassword)) && (checkUserName(tempUsername))) 
        {//checks if password and username are valid
            UserName = tempUsername;
            Password = tempPassword;
            FirstName = tempFirstName;
            LastName = tempLastName;
   
            return "User has been registered successfully";
            
        } else if (!checkPasswordComplexity(tempPassword)) 
        {//if password is invalid then display error
            return " Password is not correctly formatted, please ensure that the password contains at least characters"+", please ensure that you your username contains an underscore and is no more than 5 characters in length";         
        } else if (!checkUserName(tempUsername)) 
        {//if the username is invalid then display error
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters"+" a captal letter, a number and a special character";         
        }
        return "Failed";

    }
    String returnLoginStatus(boolean check)
    {
        if (check == true)
        {    
        return " Welcome " +FirstName +LastName+ " it is great to see you again";    
        }
        else
        {    
            return "Username or password incorrect, please try again.";
        }
    }
    
}
