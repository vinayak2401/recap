import java.util.*;
class DayName{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("1 for Sunday");
    System.out.println("2 for Monday");
    System.out.println("3 for Tuesday");
    System.out.println("4 for Wednesday");
    System.out.println("5 for Thyrsday");
    System.out.println("6 for Friday");
    System.out.println("7 for Saturday");
    System.out.println("Choose your option");
    int choice =s.nextInt();

    switch(choice){
      case 1:System.out.println("Sunday");
        break;
      case 2:System.out.println("Monday");
        break;
      case 3:System.out.println("Tuesday");
        break;
      case 4:System.out.println("Wednesday");
        break;
        
      case 5:System.out.println("Thursday");
        break;
      case 6:System.out.println("Friday");
        break;
      case 7:System.out.println("Saturday");
        break;
      
    }
  }
}