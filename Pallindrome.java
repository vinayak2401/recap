import java.util.*;
class Pallindrome{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number to check:");
    int check=s.nextInt();
    int ogNum=check;
    int reversed=0,remainder;
    while(check!=0){
      remainder=check%10;
      reversed=reversed*10+remainder;
      check/=10;
    }
    if(reversed==ogNum){
      System.out.println("Palindrome");
    }else{
      System.out.println("Not Palindrome");
    }
  }
}