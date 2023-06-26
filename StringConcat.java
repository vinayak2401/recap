/*Write a Java program that accepts two strings as input and concatenates them using the concat() method.*/
import java.util.*;
class StringConcat{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter two Strings:");
    String str=s.next();
    String str1=s.next();
    System.out.println("After concatinating: "+str.concat(str1));
  }
}