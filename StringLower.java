/*Write a Java program that takes a string as input and converts it to lowercase using predefined methods.*/
import java.util.*;
class StringLower{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a String in uppercase to convert to lowercase");
    String str=s.next();
    System.out.println(str+" after converting to lowercase is: "+str.toLowerCase());
  }
}