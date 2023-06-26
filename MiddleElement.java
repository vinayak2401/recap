
class MiddleElement {
  public static void main(String args[]) {

    int arr[] = { 12, 22, 66, 91, 3, 41 };

    if (arr.length % 2 == 0) {
      System.out.println(arr[(arr.length / 2) - 1]);
      System.out.println(arr[arr.length / 2]);
    } else {
      System.out.println(arr[arr.length / 2]);
    }

  }
}