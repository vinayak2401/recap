class FirstOccur{
  public static void main(String args[]){
    int i=0,flag=0;
    String str="lalitha";
    char ch='l';
    while(i<str.length()){
      if(str.charAt(i)==ch){
        flag++;
        break;
      }
      i++;
    }
    if(flag==0){
      System.out.println("Not found");
    }else{
      System.out.println("Found at "+i);
    }
  }
}