
class MyCustomException extends Exception 
{ 
    public MyCustomException(String s) 
    { 
        super(s); 
    } 
} 
  
// A Class that uses above MyException 
public class MyException 
{ 
    // Driver Program 
    public static void main(String args[]) 
    { 
        try
        { 
            // Throw an object of user defined exception 
            throw new MyCustomException("GeeksGeeks"); 
        } 
        catch (MyCustomException ex) 
        { 
            System.out.println("Caught"); 
  
            // Print the message from MyException object 
            System.out.println(ex.getMessage()); 
        } 
    } 
} 
