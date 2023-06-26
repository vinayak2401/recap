class Reverse2{
  public static void main(String args[]){
    String str="Vinayak Ambore Greetings";
    String words[]=str.split(" ");
    String st="";
    for(int i=0;i<words.length;i++){
      for(int j=words[i].length()-1;j>=0;j--){
        st=st+words[i].charAt(j);
      }
      st=st+" ";
    }
    System.out.println(st);
  }
}