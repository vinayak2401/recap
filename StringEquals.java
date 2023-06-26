/*Implement a Java program that accepts two strings as input and checks if they are equal, ignoring case, using predefined methods.
*/
import java.util.*;
class StringEquals{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter two Strings:");
    String str=s.next();
    String next=s.next();
    if(str.equalsIgnoreCase(next)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}