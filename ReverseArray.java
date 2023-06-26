
/*import java.util.*;

 class ReverseArray {
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
           
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

           
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        
for (int i = 0; i < numbers.length; i++) {
       System.out.print(numbers[i] + " ");
    }
        reverseArray(numbers);
      for (int i = 0; i < numbers.length; i++) {
     System.out.print(numbers[i] + " ");
    }

       
    }
}*/
class ReverseArray {

public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        
for (int i = 0; i < numbers.length; i++) {
       System.out.print(numbers[i] + " ");
    }
  System.out.println();
  for (int i = numbers.length-1; i >=0 ; i--) {
       System.out.print(numbers[i] + " ");
}
}
}