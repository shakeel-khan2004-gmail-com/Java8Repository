import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * 
 * A simple Java Program to demonstrate how to use map and filter method Java 8.
 * In this program, we'll convert a list of String into a list of Integer and
 * then filter all even numbers.
 */
public class Hello {
  public static void main(String[] args) {
    List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
    System.out.println("original list: " + numbers);
    List<Integer> even = numbers.stream()
                                .map(s -> Integer.valueOf(s)).collect(Collectors.toList());
                                
    System.out.println("processed list, only even numbers: " + even);
    
    TreeMap map = new TreeMap();
    TreeSet map1 = new TreeSet();
  }
}
