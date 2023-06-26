/*Array Sum: Create a class called ArrayUtils with an overloaded method called sum(). Implement versions of the method that can calculate the sum of different types of arrays, such as sum(int[] arr), sum(double[] arr), sum(float[] arr), and sum(long[] arr). Test the methods by passing different arrays as arguments.*/
class ArrayUtils{
  public void sum(int arr[]){
    int sum=0;
    for(int num:arr){
      sum+=num;
    }
    System.out.println("Integer: "+sum);
  }
  public void main(String args[]){
    ArrayUtils o=new ArrayUtils();
    o.sum(arr);
  }
}