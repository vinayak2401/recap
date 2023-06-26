import java.util.*;
class Prime{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number to check");
    int check=s.nextInt();
    int count=0;
    if(check<=1){
      System.out.println("Enter number greater than 1");
    }
    for(int i=1;i<check/2;i++){
      if(check%i==0){
        count++;
      }
    }
    if(count>1){
    System.out.println("Not Prime");
    }else{
      System.out.println("Prime");
    }
  }
}