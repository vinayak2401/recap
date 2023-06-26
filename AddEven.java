class AddEven {
  public static void main(String args[]) {
    int arr[] = { 23, 45, 11, 32, 73, 9, 10 };
    System.out.println("Array before addition is :");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        arr[i] = arr[i] + 5;
      } else {
        arr[i] = arr[i] - 5;
      }
    }
    System.out.println("\nArray after addition is :");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}