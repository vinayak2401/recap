class Frequency {
  public static void main(String args[]) {
    int arr[] = { 1, 2, 1, 2, 3, 4, 5, 4, 7, 9, 7, 0, 2 };
    int visited = -1;
    int fr[] = new int[arr.length];
    System.out.println("Present array");
    for (int i = 0; i < arr.length; i++) {

      System.out.print(arr[i] + " ");
    }
    for (int i = 0; i < arr.length; i++) {
      int count = 1;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
          fr[j] = visited;
        }
      }
      if (fr[i] != visited) {
        fr[i] = count;
      }
    }
    for (int i = 0; i < fr.length; i++) {
      if (fr[i] != visited)
        System.out.println("\n" + arr[i] + " ---> " + fr[i] + " times");
    }
  }
}