/*How can you replace all occurrences of a specific character in a string with another character using predefined methods in Java?*/
import java.util.*;
class StringReplace{
  public static void main(String args[]){
    String str="Hi Hello How are You";
    String str1=str.replaceAll("o", "v");
    System.out.println(str1);
  }
}