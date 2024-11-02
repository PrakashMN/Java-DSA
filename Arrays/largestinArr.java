// FINDING LARGEST VALUE IN A GIVEN ARRAY

import java.util.Scanner;

public class largestinArr {
   public largestinArr() {
   }

   public static void input(int[] var0) {
      Scanner var4 = new Scanner(System.in);

      for(int var2 = 0; var2 < var0.length; ++var2) {
         var0[var2] = var4.nextInt();
      }
      var4.close();

   }

   public static int large(int[] var0) {
      int var1 = Integer.MIN_VALUE;

      for(int var2 = 0; var2 < var0.length; ++var2) {
         if (var0[var2] > var1) {
            var1 = var0[var2];
         }
      }

      return var1;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the length of Array");
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];
      System.out.println("Enter numbers in Array");
      input(var3);
      System.out.println("The Largest Number in the Array is : " + large(var3));
      var1.close();
   }
}