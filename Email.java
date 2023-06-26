/*Write a program that prompts the user to enter an email address. The program should validate the email address based on the following criteria:
The email address must contain the "@" symbol.
The email address must contain a domain name (e.g., "example.com").*/
import java.util.*;
class Email{
  public static void main(String args[]){
    
    Email e=new Email();
    e.validate();
  }
  public static void validate(){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the email:");
    String str=s.nextLine();
    if(str.contains("@") && str.contains(".com")){
      System.out.println("Your EmailId "+str+" is valid");
    }else{
      System.out.println("Enter a valid EmailId!!!");
    }
  }
}