import java.util.Scanner;

class SearchElement {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int arr[] = { 12, 33, 15, 3, 66, 70, 8, 14 };
    System.out.println("Enter a number to search");
    int search = s.nextInt();
    boolean found = false;
    for (int i = 0; i < arr.length; i++) {
      if (search == arr[i]) {
        found = true;
        System.out.println("The element " + search + " is present");
        break;

      }
    }
    if (!found) {
      System.out.println("The element " + search + " is not present");
    }

  }
}