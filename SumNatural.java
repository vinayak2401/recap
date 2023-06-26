import java.util.*;
class SumNatural{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int i=1;
    int sum=0;
    System.out.println("Enter a number:");
    int n=s.nextInt();
    while(i<=n){
       sum=sum+i;
     
      i++;
    }
     System.out.println(sum);
  }
}