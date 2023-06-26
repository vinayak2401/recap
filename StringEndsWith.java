/*Write a Java program that takes a string as input and checks if it ends with a specific suffix using predefined methods.*/
import java.util.*;
class StringEndsWith{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the String to check:");
    String str=s.nextLine();
    if(str.endsWith("k")){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}