import java.util.*;
class NaturalReverse{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    
    System.out.println("Enter a number:");
    int n=s.nextInt();
    while(n>=1){
      System.out.print(n+" ");
      n--;
    }
  }
}