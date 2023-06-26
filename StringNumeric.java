/*Write a Java program that accepts a string as input and checks if it contains only numeric characters using predefined methods.*/
import java.util.*;
class StringNumeric{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a String:");
    String str=s.next();
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(Character.isDigit(ch)){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
    
  }
}