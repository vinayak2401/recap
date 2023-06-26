import java.util.*;
class Multiplication{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number to see the table");
    int n=s.nextInt();
    for(int i=1;i<=10;i++){
      System.out.println(n+" * "+i+" = "+(n*i));
    }
  }
}