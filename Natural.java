import java.util.*;
class Natural{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int i=1;
    System.out.println("Enter a number:");
    int n=s.nextInt();
    while(i<=n){
      System.out.print(i+" ");
      i++;
    }
  }
}