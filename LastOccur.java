class LastOccur{
  public static void main(String args[]){
    int i=0,flag=-1;
    String str="lalitha";
    char ch='l';
    while(i<str.length()){
      if(str.charAt(i)==ch){
        flag=i;
        
      }
      i++;
    }
    if(flag==-1){
      System.out.println("Not found");
    }else{
      System.out.println("Found at "+i);
    }
  }
}