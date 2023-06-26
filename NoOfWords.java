/*Write a Java program that accepts a sentence as input and counts the number of words in the sentence using predefined methods.*/
import java.util.*;
class NoOfWords{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the sentence to check number of words:");
    String str=s.nextLine();
    int wordCount=words(str);
    System.out.println("Number of words: "+wordCount);
    
  }
  public static int words(String str){
    String words[]=str.split("\\s+");
    return words.length;
  }
}