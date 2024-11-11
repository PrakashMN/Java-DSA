// FINDING LARGEST VALUE IN A GIVEN ARRAY

import java.util.Scanner;

public class largestinArr {

   public static void input(int[] arr) {
      Scanner sd = new Scanner(System.in);

      for(int i = 0; i < arr.length; ++i) {
         arr[i] = sd.nextInt();
      }
      sd.close();

   }

   public static int large(int[] arr) {
      int large = Integer.MIN_VALUE;

      for(int i = 0; i < arr.length; ++i) {
         if (arr[i] > large) {
            large = arr[i];
         }
      }

      return large;
   }

   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the length of Array");
      int length = sc.nextInt();
      int[] arr = new int[length];
      System.out.println("Enter numbers in Array");
      input(arr);
      System.out.println("The Largest Number in the Array is : " + large(arr));
      sc.close();
   }
}