/******************************************************************************
 *  Compilation:  javac UserInput.java
 *  Execution:    java UserInput
 *
 *  Prompts user for a username and prints out Username is <username>.
 *
 *  % java UserInput
 *  Enter username
 *  Jezmin
 *  Username is: Jezmin
 *
 *  These 19 lines of text are comments. They are not part of the program;
 *  they serve to remind us about its properties. The first two lines tell
 *  us what to type to compile and test the program. The next line describes
 *  the purpose of the program. The next few lines give a sample execution
 *  of the program and the resulting output. We will always include such 
 *  lines in our programs and encourage you to do the same.
 *
 ******************************************************************************/
import java.util.Scanner; // import the Scanner class 

class UserInput {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String userName;
    
    // Enter username and press Enter
    System.out.println("Enter username"); 
    userName = myObj.nextLine();   
       
    System.out.println("Username is: " + userName);        
  }
}
