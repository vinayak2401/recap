/*Math Operations: Create a class called MathOperations with overloaded methods for performing basic math operations. Implement methods such as add(int a, int b), add(double a, double b), subtract(int a, int b), subtract(double a, double b), multiply(int a, int b), multiply(double a, double b), divide(int a, int b), and divide(double a, double b). Test the methods by calling them with different arguments.

String Concatenation: Create a class called StringUtils with overloaded methods for concatenating strings. Implement methods such as concat(String str1, String str2), concat(String str1, String str2, String str3), concat(String str1, String str2, String str3, String str4), and so on. Test the methods by calling them with different arguments.

Array Sum: Create a class called ArrayUtils with an overloaded method called sum(). Implement versions of the method that can calculate the sum of different types of arrays, such as sum(int[] arr), sum(double[] arr), sum(float[] arr), and sum(long[] arr). Test the methods by passing different arrays as arguments.

Distance Calculation: Create a class called DistanceCalculator with overloaded methods for calculating distance. Implement methods such as calculateDistance(int x1, int y1, int x2, int y2), calculateDistance(double x1, double y1, double x2, double y2), calculateDistance(int x1, int y1, int z1, int x2, int y2, int z2), and calculateDistance(double x1, double y1, double z1, double x2, double y2, double z2). Test the methods by calling them with different sets of coordinates.*/
class MathOperations{
  
    
    public void add(int a,int b){
      System.out.println("Addition is: "+(a+b));
    }
  public void add(double a,double b){
    System.out.println("Addition is: "+(a+b));
    
  }
  public void subtract(int a,int b){
      System.out.println("Subtraction is: "+(a-b));
    }
  public void subtract(double a,double b){
    System.out.println("Subtraction is: "+(a-b));
    
  }
  public void multiply(int a,int b){
      System.out.println("Multiplication is: "+(a*b));
    }
  public void multiply(double a,double b){
    System.out.println("Multiplication is: "+(a*b));
    
  }
  public void divide(int a,int b){
      System.out.println("Division is: "+(a/b));
    }
  public void divide(double a,double b){
    System.out.println("Division is: "+(a/b));
    
  }
  public static void main(String args[]){
    MathOperations obj=new MathOperations();
    obj.add(10, 12);
    obj.add(22.9, 14.5);
    obj.subtract(23,21);
    obj.subtract(67,45.66);
    obj.multiply(4, 7);
    obj.multiply(5.8, 13);
    obj.divide(6, 2);
    obj.divide(9.8, 4);
  }
  }
