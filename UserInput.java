import java.util.Scanner;
class UserInput{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number :");
    int n=s.nextInt();
    System.out.println("Enter the Elements :");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    System.out.println("The array list is :");
    System.out.print("[ ");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println("]");
}
}