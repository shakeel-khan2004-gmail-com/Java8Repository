import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;    
     
public class MostRepeatedWord {    
        
    public static void main(String[] args) throws Exception {  
    	
        String line, word = "";    
        int count = 0, maxCount = 0;    
        ArrayList<String> words = new ArrayList<String>();
        
        FileInputStream fileStream = new FileInputStream("D://data.txt");
        // Creating an object input stream
        ObjectInputStream objStream = new ObjectInputStream(fileStream);
        
      Object obj = objStream.readObject();
      String str=obj.toString();

        // Using the readObject() method
       // System.out.println("String data: " + objStream.readObject());
           
            String string[] = str.toLowerCase().split("([,.\\s]+) ");    
            //Adding all words generated in previous step into words    
            for(String s : string){    
                words.add(s);  
                System.out.println("Most repeated word==============: " + s);
            }    
   
            
        //Determine the most repeated word in a file    
        for(int i = 0; i < words.size(); i++){    
            count = 1;    
            //Count each word in the file and store it in variable count    
            for(int j = i+1; j < words.size(); j++){    
                if(words.get(i).equals(words.get(j))){    
                    count++;    
                }     
            }    
            //If maxCount is less than count then store value of count in maxCount     
            //and corresponding word to variable word    
            if(count > maxCount){    
                maxCount = count;    
                word = words.get(i);    
            }    
        }    
        System.out.println("count====: " + count);      
        System.out.println("Most repeated word: " + word);    
        //.close();    
    }    
}    
