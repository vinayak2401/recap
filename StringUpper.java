/*Implement a Java program that takes a string as input and converts it to uppercase using the toUpperCase() method.*/
import java.util.*;
class StringUpper{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a String in lowercase to convert to uppercase");
    String str=s.next();
    System.out.println(str+" after converting to uppercase is: "+str.toUpperCase());
  }
}
