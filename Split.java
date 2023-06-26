class Split{
  public static void main(String args[]){
    String str="Hi Hello How are you";
    int wordCount=countWords(str);
    System.out.println("Words count: "+wordCount);
  }
  public static int countWords(String str){
    str=str.trim();

    if(str.isEmpty()){
      return 0;
    }
    String arr[]=str.split("\\s+");
    return arr.length;
  }
}