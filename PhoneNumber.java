/*Write a java program that prompts the user to enter a phone number. The program should validate the phone number based on the following criteria:
The phone number must contain only digits (0-9).
The phone number must be 10 digits long.*/
import java.util.*;
class PhoneNumber{
  public static void main(String args[]){
    PhoneNumber pn=new PhoneNumber();
    pn.validate();
  }

  public static void validate(){
    Scanner s=new Scanner(System.in);
    boolean yes=false;
    System.out.println("Enter a phone number:");
    String str=s.next();
    if(str.length()==10 ){
      char ch[]=str.toCharArray();
      for(int i=0;i<str.length();i++){
      if(ch[i]>='0' && ch[i]<='9'){
         yes=true;
        
      }
      }
      if(yes==true){
        System.out.println("Phone number is valid");
      }else{
        System.out.println("Enter a valid phone number");
      }
    }
  }
}
  