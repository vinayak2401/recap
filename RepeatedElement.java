class RepeatedElement {
  public static void main(String args[]) {
    int arr[] = { 16, 33, 6, 48, 24, 20, 19, 40, 48, 19 };
    int arr1[] = new int[count];

    int store = 0, count = 0;
    System.out.println("Existing array:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {

          count++;
        }

      }

    }
    System.out.println("\nThe Repeated element is: " + store);
  }
}