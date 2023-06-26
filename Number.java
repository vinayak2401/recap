class Number{
  public static void main(String args[]){
    int a=Integer.parseInt("1a");
    try{
      System.out.println(a);
    }catch(NumberFormatException e){
      System.out.println(e);
    }
  }
}