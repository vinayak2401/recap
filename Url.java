/*Write a java program that prompts the user to enter a URL. The program should validate the URL based on the following criteria:
The URL must start with "http://" or "https://".
The URL must contain a domain name (e.g., "example.com").*/
import java.util.*;
class Url{
  public static void main(String args[]){
    Url u=new Url();
    u.validate();
  }
  public static void validate(){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a URL to validate");
    String str=s.nextLine();
    if(str.contains("http://") || (str.contains("https://"))){
      if(str.contains(".com")){
        System.out.println("Entered URL "+str+" is valid");
      }else{
        System.out.println("Enter a valid URL");
      }
    }
  }
}