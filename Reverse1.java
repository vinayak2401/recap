class Reverse1{
  public static void main(String args[]){
    String str="Vinayak Ambore Greetings";
    String reverse=reverseString(str);
    System.out.println(reverse);
  }

  public static String reverseString(String str){
    StringBuffer sb=new StringBuffer(str);
    return sb.reverse().toString();
  }
}