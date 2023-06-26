//Write a Java program that takes a string as input and prints its length using the length() method.
import java.util.*;
class StringLength{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a String to find the length:");
    String str=s.next();
    System.out.println("Length of the String is: "+str.length());
  }
}