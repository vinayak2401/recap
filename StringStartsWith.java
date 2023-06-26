/*Implement a Java program that accepts a string as input and checks if it starts with a specific prefix using predefined methods.*/
import java.util.*;
import java.util.Scanner;
class StringStartsWith{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a String:");
    String str=s.next();
    if(str.startsWith("V")){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}